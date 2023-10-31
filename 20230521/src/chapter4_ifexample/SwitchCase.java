package chapter4_ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		int ranking = 1;
		char medalColor;

		switch (ranking) {
		case 1:
			medalColor = '금';
			break;
		case 2 :
			medalColor = '은';
		case 3 :
			medalColor = '녹';
		default :
			medalColor = '청';
			

		}
		System.out.println(ranking+"등 메달의 색깔은 "+medalColor+" 입니다.");

	}

}
