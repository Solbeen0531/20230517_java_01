package kh.lclass.tcp;

public class ServerMain {
	public static void main(String[] args) {
		new TCPServer().testTCPServer(9001);
		// 서버의 포트번호 정함 ==> 프로그램의 포트번호
	}
}
