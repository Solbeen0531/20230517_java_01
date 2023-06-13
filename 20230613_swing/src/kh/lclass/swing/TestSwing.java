package kh.lclass.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestSwing extends JFrame{
	
	public TestSwing() {
		setTitle("title : Hello Window _ Frame");
//		setDefaultCloseOperation(EXIT_ON_CLOSE); // [Close] 버튼 눌러서 resource 정리하고 창 닫기
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
//		contentPane.setLayout(new FlowLayout()); // 아래 버튼이 하나씩 보이게 해줘
//		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10)); // 왼쪽 정렬해줘, 마진은 가로5 세로 10
//		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 10));
		
//		contentPane.add(new JButton("OK"), BorderLayout.NORTH); // BorderLayout의 북쪽 으로 버튼 배치해줘
//		contentPane.add(new JButton("Cancel"), BorderLayout.WEST);
//		contentPane.add(new JButton("Ignore"), BorderLayout.EAST);
//		contentPane.add(new JButton("Center"), BorderLayout.CENTER);

//		contentPane.setLayout(new GridLayout(3,4,10,10)); // 세로로 3개 가로로 4개, 마진은 가로 세로 10씩
		contentPane.setLayout(new GridLayout(5,2,10,10)); 
		
		// 방법 1
//		contentPane.add(new JLabel("name")); // 이름 
//		contentPane.add(new JTextField()); // component 생성
		// 방법 2
//		contentPane.add(new JLabel("name")); 
//		JTextField txtName = new JTextField(); // component 생성
//		contentPane.add(txtName); //component를 contentPane에 추가
		
		// component 생성
		JTextField txtName = new JTextField();
		JTextField txtNo = new JTextField();
		JTextField txtMajor = new JTextField();
		JTextField txtSubject = new JTextField();
		JButton btnSave = new JButton("저장"); 
		
		// event 등록 = Action 리스너 달기
		btnSave.addActionListener(new MyActionListener());
		txtName.addActionListener(new MyActionListener());
		
		//component를 contentPane에 추가
		contentPane.add(new JLabel("이름")); 
		contentPane.add(txtName);		
		contentPane.add(new JLabel("학번")); 
		contentPane.add(txtNo);		
		contentPane.add(new JLabel("학과")); 
		contentPane.add(txtMajor);		
		contentPane.add(new JLabel("과목")); 
		contentPane.add(txtSubject);				
		contentPane.add(btnSave);
		
		
		setSize(300, 300);
//		setVisible(true); // window가 보이게 하거나 true, 보이지 않게 하거나 false
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TestSwing frame = new TestSwing();
		
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("이건 언제 실행되지?");
			System.out.println(e);
			
			Object source = e.getSource();
			if(source instanceof JButton) {
				System.out.println("button 눌렀네요");
				if (((JButton)source).getText().equals("저장")) {
					((JButton)source).setText("저장2");
				} else {
					((JButton) source).setText("저장");
				}
			} else if (source instanceof JTextField) {
				System.out.println("text field에서 enter key를 눌렀네요");
			}
			
		}
		
	}
}
