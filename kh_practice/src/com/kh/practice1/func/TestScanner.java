package com.kh.practice1.func;

import java.util.Scanner;

public class TestScanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너 가져다가 전원 on 버튼 누름

		// [Enter] H/W key 눌릴 때까지의 data를 scan해줘
		// 1 2 가 나 다 [Enter]
		// scan은 data "11 22 33 가가가 나나 다 \n\0" // \0이란 null 값 의미. 즉, 빈란.
		
		String str1 = scan.next(); // 띄어쓰기 또는 [Enter] 전까지 한 덩어리 문자로 return
		System.out.println(str1);// 11
		int num1 = scan.nextInt(); // 띄어쓰기 또는 [Enter] 전까지 한 덩어리를 정수형으로 바꿔서 return.
		System.out.println(num1);// 22(int)
		double num2 = scan.nextDouble(); //  띄어쓰기 또는 [Enter] 전까지 한 덩어리를 실수형으로 바꿔서 return.
		scan.nextLine();
		System.out.println(num2);// 33.0(double) 
		String str2 = scan.nextLine(); // 줄바꿈까지 한 덩어리를 문자형으로 바꿔서 return.
		System.out.println(str2);// 가가가 나나 다 \n
		
		System.out.println("입력1");
		int num3 = scan.nextInt(); //
		scan.nextLine(); // 이 코드가 없으면 '입력2' 가 skip 된다. 타 언어의 flush() 와 같은 역할 함. 
		System.out.println(num3);
		
		System.out.println("입력2");
		String str3 = scan.nextLine();
		System.out.println(str3);
		
		System.out.println("끝");
		
		
		
		
		scan.close(); // 스캐너 가져다가 전원 off 버튼 누름
	}

}
