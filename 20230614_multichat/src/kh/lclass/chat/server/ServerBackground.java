package kh.lclass.chat.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ServerBackground {

	private ServerSocket serverSocket; // 서버 소켓
	private ServerGUI gui; // 초기값 null / new 하면 안됨

	private BufferedReader br;
	private BufferedWriter bw;

	private Map<String, BufferedWriter> mapClients = new HashMap<String, BufferedWriter>();
	// map.put("socket", socket);

	private Socket socket;

	public int count; // 현재 접속자 수

	// 서버 생성 및 설정
	public void setting() {
		// 참고 : 동시 접속자로 map에 정보가 동기화되어 들어가도록 설정함
		Collections.synchronizedMap(mapClients);
		try {

			serverSocket = new ServerSocket(7777);

			// 방문자 접속 무한반복. GUI 프로그램인 경우 창 닫힐 때까지 반복함. break 없음.
			while (true) {
				// 접속자 대기 중
				socket = serverSocket.accept(); // 클라이언트 받음
				new Client(socket).start();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 클라이언트가 접속하면 그 정보를 display 해주는 메소드
	public void addClient(String nickname) {
		gui.appendMsg(nickname + "님이 접속했습니다");
	}

	// private ServerGUI gui;
	public void setGui(ServerGUI gui) {
		this.gui = gui;
	}

	public void sendMessage(String msg) {
		// client를모두에ㅔ게 msg 전달

		Set<String> keys = mapClients.keySet();
		for (String key : keys) {
			BufferedWriter wr = mapClients.get(key);
			try {
				wr.write(key + ":" + msg + "\n");
				wr.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

///////////   Inner Class /////////////
	class Client extends Thread {
//	private Socket socket;
		private BufferedReader br;
		private BufferedWriter bw;
		private String nickname;

		private Client(Socket socket) {
			try {
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				// 클라이언트 nickname이 바로 이어서 들어옴
				// 접속되면 바로 nickname이 전달될 것이므로 읽음
				String nickname = br.readLine();

				// server 화면에 표현
				addClient(nickname);

				// client outputStream 관리 map에 추가
				mapClients.put(nickname, bw);
				sendMessage(nickname + "님 접속했습니다");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			// client와 입력 통로가 끊어지지 않았다면 계속 반복 확인함
			// client에서 수신받은 msg
			// 클라이언트마다 각각에서 전달되오는 메시지 확인하고 화면에 출력
			while (br != null) {

				try {
					String msg = br.readLine();
					gui.appendMsg(msg);
					// client map 모두에게 접속 정보 전달
					sendMessage(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
}
