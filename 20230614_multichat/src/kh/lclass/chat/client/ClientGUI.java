package kh.lclass.chat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientGUI extends JFrame implements ActionListener {

	// compile 시 인식할 객체 고유 ID
	private static final long serialVersionUID = -5930472044191273699L;

	private JTextArea jta = new JTextArea(40, 25); // chatting 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분
	private String nickName; // 클라이언트 닉네임
	private ClientBackground cb = new ClientBackground(); //

	public ClientGUI(String nickname) {
		this.nickName = nickname; //
		

		// 생성자에서는 초기화 (즉, 화면 초기화)
		setBounds(200, 100, 400, 400); // 창이 뜨는 위치와 크기 설정 / setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		setTitle(nickName + "님 창");

		jta.setEditable(false); // chattin 창은 입력되지 않도록 함
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자체, 크기
		jta.setBackground(new Color(198, 255, 255)); // bg color 색 설정

		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);

		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		cb.setNickname(nickname);
		cb.connection();
		cb.setGui(this);
		
		setVisible(true);

	}

	// TODO 새 메시지를 받았을 때 메소드 호출됨
	public void appendMsg(String msg) {
		// jta (채팅 창) 에 msg로 입력받아오는 메시지를 추가하고 display함
		jta.append(msg);
		jta.append(msg);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 입력창에 글 입력하고 enter key를 눌렀을 때
		String msg = jtf.getText();
		System.out.println(msg);

		jtf.setText(""); // 입력창 입력된 글을 초기화

		// server에 전달하기 위해 ClientBackground에 전달
		cb.sendMessage(msg);

	}

}
