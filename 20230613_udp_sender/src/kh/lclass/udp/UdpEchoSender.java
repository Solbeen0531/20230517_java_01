package kh.lclass.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpEchoSender {
	public static void main(String[] args) {
		UdpEchoSender instance = new UdpEchoSender();
		instance.senderUdp();
	}

	public void senderUdp() {
		// port 번호 정함
		int myPort = 5001;
		int partnerPort = 6001;
		String partnerName = "localhost";
		DatagramSocket dSock = null;
		BufferedReader br = null;

		try {
			// DatagramSocket 객체 생성
			dSock = new DatagramSocket(myPort); // 매개인자 없으면 자동 port 번호 할당됨. 지정하면 해당 port 번호로 소켓 생성

			// System.in이 기반스트림 역할
			br = new BufferedReader(new InputStreamReader(System.in));
			
			while (true) {
			// 전달할 메시지
			System.out.print("입력 >>> ");
			String sendMsg = br.readLine(); // console 입력받음
			
			// exit 입력하면 프로그램 끝내기
			if(sendMsg.equals("exit")) {
				break;
			}

			// 메시지 전달
			InetAddress partnerIp = null;
			try {
				// 3. 연결한 클라이언트 IP주소를 가진 InetAddress 객체 생성
				partnerIp = InetAddress.getByName(partnerName);
				// 4. 전송할 메시지를 byte[]로 바꿈
				byte[] byteMsg = sendMsg.getBytes();

				// 5. 전송할 메시지를 DatagramPacket 객체에 담음
				DatagramPacket sendData =  new DatagramPacket(byteMsg, byteMsg.length, partnerIp, partnerPort);
				
				// 6. 소켓 레퍼런스를 사용하여 메시지 전송
				dSock.send(sendData);
				
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			// 메시지 수신
			byte[] byteMsg = new byte[1000];
			
			DatagramPacket receiveData = new DatagramPacket(byteMsg, byteMsg.length);
			dSock.receive(receiveData);
			
			// 전달받은 메시지 정보들
//			System.out.println("=== 전달받은 정보들 ===");
//			System.out.println(byteMsg.length);
//			System.out.println(receiveData.getData().length);
//			System.out.println(receiveData.getLength());
//			System.out.println(receiveData.getAddress()); // 전달받은 메시지의 발신 ip
//			System.out.println(receiveData.getPort()); // 전달받은 메시지의 발신 port
			String receivedStr = new String(receiveData.getData());
			System.out.println("수신 메시지 : " + receivedStr);
			}
		 } catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dSock != null)
					dSock.close();
			
			} catch (Exception e ) {
				e.printStackTrace();
			}
		}
	}

}
