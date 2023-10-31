package chapter4_practicexample;

public class GuguEven {

	public static void main(String[] args) {
		int dan;
		int times;
				
		// continue 사용
		System.out.println("==continue 사용==");
		for (dan = 2;dan <= 9; dan++) {
			if (dan % 2 == 1)
				continue;
			for (times = 1; times <=9; times++) {
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			System.out.println();
		}

	}

}
