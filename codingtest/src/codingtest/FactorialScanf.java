package codingtest;

import java.util.Scanner;

public class FactorialScanf {

	// 5. 숫자를 입력받아 해당 숫자의 팩토리얼(5*4*3*2*1) 값을 출력하는 프로그램을 작성하시오.
	// (재귀함수 말고 while문은 사용해서)
	public static void main(String[] args) {
		
		int num = 0; 
		int result = 0;
		
		System.out.print("숫자를 입력하세요_정수 : ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while (num > 0) {
			num = num-1;
			if (num == 1) {
				System.out.print(num);
				
			} else {
				System.out.print(num+"*");
			}
			result = num*(num++);
		}
				
		System.out.print("1 = "+result);
		
		sc.close();

	}

}
