package kh.Lclass;

public class TestFor {

	/**
	 * 2023-05-23 화요일 작성된 페이지 입니다.
	 */

	public static void main(String[] args) {

		/*
		 * // 1. 화면에 1-5까지 display 해줘 System.out.println("1. 화면에 1-5까지 display 해줘");
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4); System.out.println(5 + "\n");
		 */

		// 시작 : 1 // 홀수합구하기while
		// 끝 : 100
		// step : 1
		int sum = 0;
		int start = 1;
		int end = 100;
		int step = 1;
		int num3 = start;
		while (num3 <= end) {
			sum = sum + num3;
			num3 += step;
		}
		System.out.println(start + "부터 " + end + "까지의 합은 " + sum);

		// 시작 : 2
		// 끝 :100
		// step: +2
		sum = 0;
		step = 2;
		num3 = start + 1;
		while (num3 <= end) {
			sum = sum + num3;
			num3 += step;
		}
		System.out.println(start + "부터 " + end + "까지의 짝수 합은 " + sum);

		// 홀수합을 위한 초기화
		sum = 0;
		step = 2;
		num3 = start;
		while (num3 <= end) {
			sum = sum + num3;
			num3 += step;
		}
		System.out.println(start + "부터 " + end + "까지의 odd수 합은 " + sum);

		System.out.println(" [for문 사용]");

		int evenSum = 0;
		int oddSum = 0;
		sum = 0;

		for (start = 1, step = 1, num3 = start; // 초기화 -0
				num3 <= end; // 조건식-1
				num3 += step // 증감식-3
				) {
			sum += num3; // 반복문-2
			if (num3 % 2 == 0) {
				evenSum += num3;
			} else {
				oddSum += num3;
			}
		}
		System.out.println(start + "부터 " + end + "까지의 합은 " + sum);
		System.out.println(start + "부터 " + end + "까지의 짝수 합은 " + evenSum);
		System.out.println(start + "부터 " + end + "까지의 홀수 합은 " + oddSum);

		// 2. 1-5까지 역순으로 display 해줘 - while문 사용
		System.out.println("2. [while문]");

//		int num1 = 6;
//
//		while (num1 > 1) {
//			num1 = num1 - 1;
//			System.out.println(num1);
//		}

		int num1 = 5;
		int num2 = 1;

		while (num1 >= 1) {
			System.out.println("(" + num1 + "," + num2 + ")");
			// 여기 하는 행동이 길어지면
			// 증감식 코드를 잊을 때가 많음
			num1 = num1 - 1;
			num2 = num2 + 1;
		}

		System.out.println("3. [for문 사용]");

//		for(num1=5; num1>0; num1=num1-1) {
//			System.out.println(num1);
//		}

//		for (num1 = 5, num2 = 1; num1 >= 1; num1 = num1 - 1, num2++) {
//			// num2++ 대신 2씩 증가는 num2+=2로 가능
//			// 큰값에서 시작하면 감소 연산자, 작은 값에서 시작하면 증가 연산자 사용
//			System.out.println("(" + num1 + "," + num2 + ")");
//		}

		for (num1 = 5, num2 = 1; num1 >= 1; num1 = num1 - 1, num2++) {
			// num2++ 대신 2씩 증가는 num2+=2로 가능
			// 큰값에서 시작하면 감소 연산자, 작은 값에서 시작하면 증가 연산자 사용
			System.out.println("(" + num1 + "," + num2 + ")");
		}

		System.out.println("== 반복 끝");

		System.out.println("지역 범위 - 변수");
		int num8 = 10;
		for (num8 = 1; num8 < 5; num8++) {
			System.out.println(num8);
		}
		System.out.println("===");
		System.out.println(num8);
		System.out.println("===");

		for (int num9 = 1; num9 < 5; num9++) {
			System.out.println(num9);
			System.out.println(num8);
		}
//		System.out.println(num9); // num9는 지역변수라 괄호밖에서 사용불가

		for (int num9 = 3; num9 < 7; num9++) {
			System.out.println(num9);
		}

		System.out.println("====구구단 2단을 하자=====");
		int dan = 2;
		int multiple = 1; // 1씩 증가, 9까지 변함 // 곱해지는 수, 배수
		System.out.printf("%d * %d = %2d\n", dan, multiple, dan * multiple); // print format
		// %d 는 한 자리 숫자, %2d 는 두 자리 숫자
		System.out.printf("%d * %d = %2d\n", dan, ++multiple, dan * multiple);
		System.out.printf("%d * %d = %2d\n", dan, ++multiple, dan * multiple);
		System.out.printf("%d * %d = %2d\n", dan, ++multiple, dan * multiple);
		System.out.println("==========");
		for (multiple = 1; multiple <= 9; multiple++) {
			// for문에서 multiple++ 으로 쓰든 ++multiple으로 쓰든 동일한 결과값이 출력
			System.out.printf("%d * %d = %2d\n", dan, multiple, dan * multiple);

		}

		System.out.println("======");
		for (dan = 2; dan <= 9; dan++) {
			for (multiple = 1; multiple <= 9; multiple++) {
				System.out.printf("%2d * %2d = %2d\n", dan, multiple, dan * multiple);

			}
			System.out.println();
		}

		System.out.println("==어릴 때 외운 화면처럼 1단계====");
//		dan = 2;
		multiple = 1;
		for (dan = 2; dan <= 9; dan++) {
			System.out.printf("%d * %d = %2d\t", dan, multiple, dan * multiple);

		}
		System.out.println();

		System.out.println();
		System.out.println("==어릴 때 외운 화면처럼 2단계====");
		for (multiple = 1; multiple <= 9; multiple++) {
			for (dan = 2; dan <= 9; dan++) {
				System.out.printf("%d * %d = %2d\t", dan, multiple, dan * multiple);
			}
			System.out.println();
		}

		// 결론
		System.out.println("======");
		for (dan = 2; dan <= 9; dan++) {
			for (multiple = 1; multiple <= 9; multiple++) {
				System.out.printf("%d * %d = %2d\t", dan, multiple, dan * multiple);
			}
			System.out.println();
		}

		// break문
		System.out.println("====break=====");
		for (dan = 2; dan <= 9; dan++) {
			for (multiple = 1; multiple <= 9; multiple++) {
				System.out.printf("%d * %d = %2d\t", dan, multiple, dan * multiple);
				if (multiple == 5) {
					break;
				}
			}
			if (dan == 5) {
				break;
			}
			System.out.println();

			System.out.println("=========continue=========");
			int total = 0;
			for (int i = 1; i < 10; i++) {
				// 방법 1
//			if(i%2 == 0) {
//				continue;
//			}

				// 방법 2
				if (i % 2 != 0) {
					total += i;
				}

			}
			System.out.printf("홀수의 합계는 %d\n", total);
		}
	}

}
