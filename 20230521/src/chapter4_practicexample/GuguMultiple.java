package chapter4_practicexample;

public class GuguMultiple {

	public static void main(String[] args) {
		int dan;
		int times;
				
		// break문 사용
		System.out.println("==break문 사용==");
		for (dan = 2;dan <= 9; dan++) {
			for (times = 1; times <=9; times++) {
				if (dan < times)
					break;
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			System.out.println();
		}


	}

}
