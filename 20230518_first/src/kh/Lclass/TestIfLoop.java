package kh.Lclass;

import java.util.Scanner;

public class TestIfLoop {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// 시스템에서 input 형태로 넣어줄게
		System.out.print("나이를 입력해주세요. 정수 0~200 : ");
		int age = sc.nextInt();
		
//		// 8살이면 학교에 입학한다.
//		// 9살부터 19살까지 학교에 다닌다.
//		// 그외 학교에 다니지 않는다.
//		if (age == 8) {
//			System.out.println("학교에 입학한다.");
//		}else if(age >= 9 && age <= 19 ){ 
//			System.out.println("학교에 다닌다.");
//		}else {
//			System.out.println("학교에 다니지 않는다.");
//		}
		
		
		// 8살부터 19살까지 학교에 다닌다.
			// 8살이면 학교에 입학한다.
			// 19살이면 곧 졸업한다.
		// 그외 학교에 다니지 않는다.
		if (age >= 8 && age <= 19) {
			System.out.println("학교에 다닌다.");
			if (age == 8) {
				System.out.println("학교에 입학하였다.");
			} else if (age == 19) {
				System.out.println("곧 졸업한다.");
			}
		} else {
			System.out.println("학교에 다니지 않는다.");
		}
		
		
		System.out.println("===============");
		System.out.println("공원입장료");
		System.out.println("나이 입력 : ");
		//교재 97 page flow chart 보면서 작성바람
		
		int age1 = 0;
		age1 = sc.nextInt();
		int charge = 3000;
		
		
	
		
		
		
		
		

		// 8세 미만
		//14세 미만
		
		//20세 이상
		//15세 이상
		if (age1 < 8) {
			charge = 1000; // 초기값을 주는 것이 좋다
		} else if (age1 < 14) {
			charge = 2000;
		} else if (age1 < 20) {
			charge = 2300;
		} else {
			//charge = 3000;
		}
		
//		if (age1 >= 8) {
//			charge = 2000;
//			if (age1 >= 14) {
//				charge = 2500;
//			} else if (age >= 20) {
//				charge = 3000;
//			}
//					
//		}
		
		
		
		System.out.println("요금은 " + charge + "원 입니다.");		
		System.out.println("===============");
		
		
		System.out.println("==============");
		System.out.println("====  학점  ====");
		System.out.println("평균 점수를 입력하세요 : ");
		
		int totalScore = sc.nextInt();//????
		int score = totalScore / 10; //10으로 나눈 몫 (정수 연산이므로 몫만 필요)
		switch(score / 10) {/*totalScore*/
		case 10://if
			System.out.println("A학점 입니다.");
		case 9://else if
			System.out.println("B학점 입니다.");
			break;
		case 8:
			System.out.println("C학점 입니다.");
			break;
		case 7:
			System.out.println("D학점 입니다.");
			break;
		case 6:
			System.out.println("F학점 입니다.");
			break;
		default ://else
			System.out.println("과락입니다.");
			break;
		}
	
		System.out.println("=========================");
		
		
		//1~100 정수의 합을 구하시오
		int i;
		int sum = 0;
		
		//for (1,초기값설정 ; 2,5,8조건식 ; 4,7,증감식) {3,6,	}
		for(i = 1; i <= 100; i = i + 1) {
			//여기
			sum += i;
		}
		
		// 20명의 영어 성적을 입력받아 합계와 평균값을 구해주세요
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}