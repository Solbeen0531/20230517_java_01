import java.util.Date;

import kh.Lclass.bank.BankAccount;

public class HelloWorld {

	public static void main(String[] args) {
		// JVM이 main 메소드를 호출해줌
		
//		BankAccount ejkim = new BankAccount();// BankAccount가 ejkim의 참조자료형 이다
//		ejkim.accountNo =1111;
//		ejkim.setName("이제이");
//		ejkim.setBalance(5000);
//		
//		// 시간히 흘러서..
//		int currentBalance 
//			= ejkim.deposit("역삼우리은행ATM3", 5000);
//		// BankAccount가 ejkim의 참조자료형 이다/ 필드와 메소드는 점(.)을 찍어서 접근한다
//		System.out.println(ejkim.getName() + "님의 잔액 " + currentBalance + "입니다.");
//		 
		
		final int NUMBER_OF_STUDENT = 10;
		boolean a1;
		byte a2; // -128~127
		short a3; // 
		int a4; //정수 기본연산 자료형
		long a5;
		
		float a6;
		double a7; //실수 기본연산 자료형
		
		char a8;
		
		a1 = true;		System.out.println(a1);
		a2 = 3+5*2;		System.out.println(a2);
		a3 = 20;		System.out.println(a3);
		a4 = 20;		System.out.println(a4);
		a5 = 10000000000L;		System.out.println(a5);
		a6 = 20132232.3221321234232234342f ;		System.out.println(a6);
		a7 = 20132232.3221321234232234342;		System.out.println(a7);
		a8 = 65; /* a8 = 'A';	*/	System.out.println(a8);
		
		a5 = 20L;
		
		
		a2 = 20 * 3;
		
		System.out.println("aaa");
		//()가 있으면 메소드명, 없으면 변수나 클래스명. 대문자로 시작하지 않으면 필드명
		// 즉, out는 필드명이다.
		
		/*
		 * public class System {
		 *  public Abcdef out; // Abcdef 참조형 
		 *  
		 * }
		 * 
		 * public class Abcdef{
		 *  public void println(String a1){// 대입코드가 없으면 void
		 *   // console창에 a1 뿌리기
		 *   return;	
		 * }
		 * }
		 * */
		
		
		
		/*
		 * int a; a = 10; a= 15; System.out.println(a); // 15 a = a + 5; // a+=5;
		 * System.out.println(a); // 20
		 */		
		
		
	
	}

}
