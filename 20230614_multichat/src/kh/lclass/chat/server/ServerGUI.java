package kh.lclass.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener {

	// compile 시 인식할 객체 고유 ID
	private static final long serialVersionUID = 6085316166659427339L;

	private JTextArea jta = new JTextArea(40, 25); // chatting 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분
	private ServerBackground sb = new ServerBackground();

	public ServerGUI() {
		// 생성자에서는 초기화 (즉, 화면 초기화)
		setBounds(200, 100, 400, 400); // 창이 뜨는 위치와 크기 설정 / setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		setTitle("서버 창");

		jta.setEditable(false); // chattin 창은 입력되지 않도록 함
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자체, 크기
		jta.setBackground(new Color(230, 255, 230)); // bg color 색 설정

		add(jta, BorderLayout.CENTER);
		add(jtf, BorderLayout.SOUTH);
		jtf.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		sb.setGui(this);
		sb.setting();

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

		// TODO client에 전달하기 위해 backgroud에 전달

	}

}
