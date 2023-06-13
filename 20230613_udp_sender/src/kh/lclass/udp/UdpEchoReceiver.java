package kh.lclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoReceiver {

	public static void main(String[] args) {
		new UdpEchoReceiver().receiverUdp();
	}

	public void receiverUdp() {
		// port 번호 정함
		int myPort = 6001;
//		int partnerPort = 5001;
//		String partnerName = "localhost";
		DatagramSocket dSock = null;
		
		try {
			// DatagramSocket 객체 생성
			dSock = new DatagramSocket(myPort); // 매개인자 없으면 자동 port 번호 할당됨. 지정하면 해당 port 번호로 소켓 생성
			
			// 메시지 수신
			while (true) {
				byte[] byteMsg = new byte[1000];
				
				DatagramPacket receiveData = new DatagramPacket(byteMsg, byteMsg.length);
				dSock.receive(receiveData);
				
				// 전달받은 메시지 정보들
				System.out.println("=== 전달받은 정보들 ===");
				System.out.println(byteMsg.length);
				System.out.println(receiveData.getData().length);
				System.out.println(receiveData.getLength());
				System.out.println(receiveData.getAddress()); // 전달받은 메시지의 발신 ip
				System.out.println(receiveData.getPort()); // 전달받은 메시지의 발신 port
								
				String receivedStr = new String(receiveData.getData());
				System.out.println("수신 메시지 : " + receivedStr);
				
				// Echo  메시지 송신
				// 5. 전송할 메시지를 DatagramPacket 객체에 담음
				DatagramPacket sendData =  new DatagramPacket(receiveData.getData(), receiveData.getLength(), receiveData.getAddress(), receiveData.getPort());
				dSock.send(sendData);
				
			}
			
			
			
			
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
