package com.kh.practice1.func;
// 이 파일은 com (폴더) 안의 kh 안의 practice1 안의 func 안에 소속되어 있다.

import java.util.Scanner;
// 따로 함수 정의 안하고, java.util.Scanner에 있는 함수를 불러오겠다.

public class VariablePractice1 {
	// package와 import를 제외한 모든 소스는 class 안에 있어야 한다.
	// public 으로 선언되었기 때문에 필요 시, 다른 java 파일에서도 이것을 불러올 수 있다.

	public static int cnt = 10;

	// 모두 참여 > 1_변수_실습문제.pdf
	public void method1() {
		System.out.println("실습문제1");

		Scanner sc = new Scanner(System.in); // 데이터를 입력해서 사용하기 위해 필요한 버퍼 on
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); // 문자열을 입력받고 줄바꿈을 한다
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		// 한 문자를 입력받고 줄바꿈을 한다
		// 여러 문자를 입력하더라도 그 중 첫 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt(); // 정수형 숫자를 입력받는다
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble(); // 실수형 숫자를 입력받는다
		System.out.println("키 " + height + "cm인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다 ^^");

//		이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
//
//		ex.
//		이름을 입력하세요 : 아무개
//		성별을 입력하세요(남/여) : 남
//		나이를 입력하세요 : 20
//		키를 입력하세요(cm) : 180.5
//
//		키 180.5cm인 20살 남자 아무개님 반갑습니다^^
		sc.close(); // 스캐너를 모두 사용했으므로 닫는다 off
	}

	public void method2() {
		System.out.println("여기2 실행");

		Scanner sc = new Scanner(System.in);
		// 데이터를 입력해서 사용하기 위해 필요한 버퍼 on

		System.out.print("첫 번째 정수 : ");
		int a = sc.nextInt();
		// 정수형 숫자를 입력받는다

		System.out.print("두 번째 정수 : ");
		int b = sc.nextInt();
		// 정수형 숫자를 입력받는다

		System.out.println("더하기 결과 : " + (a + b));
		System.out.println("빼기 결과 : " + (a - b));
		System.out.println("곱하기 결과 : " + (a * b));
		System.out.println("나누기 결과 : " + (a / b));

//		키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
//
//		ex.
//		첫 번째 정수 : 23
//		두 번째 정수 : 7
//
//		더하기 결과 : 30
//		빼기 결과 : 16
//		곱하기 결과 : 161
//		나누기 몫 결과 : 3

		sc.close();
		// 스캐너를 모두 사용했으므로 닫는다 off
	}

	public void method3() {
		System.out.println("여기3 실행");

		Scanner sc = new Scanner(System.in);
		// 데이터를 입력해서 사용하기 위해 필요한 버퍼 on

		System.out.println("가로 : ");
		double width = sc.nextDouble();
		// 실수형 숫자를 입력받는다

		System.out.println("세로 : ");
		double vertical = sc.nextDouble();
		// 실수형 숫자를 입력받는다

		System.out.println("면적 : " + (width * vertical));
		System.out.println("둘레 : " + (width + vertical) * 2);

//		키보드로 가로, 세로 값을 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
//		계산 공식 ) 면적 : 가로 * 세로
//		둘레 : (가로 + 세로) * 2
//
//		ex.
//		가로 : 13.5
//		세로 : 41.7
//
//		면적 : 562.95
//		둘레 : 110.4

		sc.close();
		// 스캐너를 모두 사용했으므로 닫는다 off

	}

	public void method4() {
		System.out.println("여기4 실행");

		Scanner sc = new Scanner(System.in);
		// 데이터를 입력해서 사용하기 위해 필요한 버퍼 on

		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		// 문자열을 입력받고 줄바꿈을 한다

		char firstWord = word.charAt(0);
		// 입력된 문자열 중 첫 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.

		char secondWord = word.charAt(1);
		// 입력된 문자열 중 두 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.

		char thirdWord = word.charAt(2);
		// 입력된 문자열 중 세 번째(프로그래밍에서 정수형 숫자는 0부터 1씩 올라가기 시작한다) 문자를 출력한다.

		System.out.println("첫 번째 문자 : " + firstWord + "\n두 번째 문자 : " + secondWord + "\n세 번째 문자 : " + thirdWord);

//		영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
//
//		ex.
//		문자열을 입력하세요 : apple
//
//		첫 번째 문자 : a
//		두 번째 문자 : p
//		세 번째 문자 : p

		sc.close();
		// 스캐너를 모두 사용했으므로 닫는다 off

	}

}
