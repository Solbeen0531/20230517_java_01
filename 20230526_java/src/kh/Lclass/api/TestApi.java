package kh.Lclass.api;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

import kh.Lclass.vo.TestVo;
import static kh.Lclass.api.KHCommonApi.checkMenu;

public class TestApi {
	public void testDate() {
		Date when = new Date(2000L);
		// 대부분 deprecated 되어 있어 사용불가 / deprecated = 중요도가 떨어져 더 이상 사용되지 않고 앞으로는 사라지게 될 (컴퓨터 시스템 기능 등)
		System.out.println(when);
		
		Calendar c = new GregorianCalendar(); // Cannot instantiate the type Calendar 
		// new Calendar() 오류
		// 원인 1. abstract class 2. 생성자 접근 제한자 protected
		Calendar c2 = Calendar.getInstance();
		// 해결 1. 
		// 해결 2. Singleton - 디자인패턴 중 하나
		
		TestSingleton ts = TestSingleton.getInstance();;
		System.out.println(ts.getA());
		ts.setA(50);
		System.out.println(ts.getA());
		
		TestSingleton ts2 = TestSingleton.getInstance();;
		System.out.println(ts2.getA());
		ts2.setA(100);
		System.out.println(ts2.getA());
		
		System.out.println(c.getTime());
	}

	public void testWrapperWhile() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴 1-5 사이 선택해주세요.");
			int menu = 0;
			try {
				String menuStr = sc.nextLine();
				menu = Integer.parseInt(menuStr);

			} catch (NumberFormatException e) {
//				NumberFormatException
//				e.printStackTrace(); 예외처리 코드. 
			}
			
			if (!kh.Lclass.api.KHCommonApi.checkMenu(1, 5, menu)) {
				continue;
			}
			
//	+		if (!checkMenu(1, 5, menu)) {
//				continue;
//			}			

//	+ 		if (!KHCommonApi.checkMenu(1, 5, menu)) {
//				continue;
//			}
			
//	+		if (!checkMenu(1, 5, menu)) {
//				continue;
//			}

			// 정상 입력 경우 / 정상인 경우 else 쓰지 않음
			System.out.println("정상적으로 입력되어서... 다른 함수 호출함.");
			testString();
			System.out.println("동작 마침!!!");
			break;

		}

//		while (true) {
//			System.out.println("메뉴 1-5 사이 선택해주세요.");
//			int menu = sc.nextInt();
//
//			if (menu > 0 && menu < 6) {
//				// 정상 입력 경우
//				System.out.println("정상적으로 입력되어서... 다른 함수 호출함.");
//				testString();
//				System.out.println("동작 마침!!!");
//				break;
//			} else {
//				// 비정상 입력 경우
//				System.out.println("1-5 사이 선택해주세요.");
//			}
//		}
	}

	public void testString() {
		StringBuffer str1 = new StringBuffer("aaa");
		StringBuffer str2 = new StringBuffer();
		str2.append("12345");
		str2.insert(2, "abc");
		System.out.println(str2.indexOf("bc"));
		StringBuilder str3 = new StringBuilder("bbb");
		str3.insert(1, "111");
		System.out.println(str3);

		Scanner sc = new Scanner(System.in);
		System.out.println("구분자를 입력해주세요");
		String token = sc.nextLine();
		System.out.println("내용을 입력해주세요");
		String content = sc.nextLine();
		String str = "A| |A|BB|C|C";
		StringTokenizer st = new StringTokenizer(content, token);
		System.out.println(st);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println(st);

		// 기본 자료형 --> String;
		int i = 35;
		double d = 35.0;
		String s1 = String.valueOf(d);
		String s2 = Double.valueOf(d).toString();

		// String --> 기본 자료형
		String s = "35.6";
		i = Integer.parseInt(s);
		System.out.println(i);

		System.out.println("========끝============");

		int bnum1 = 10;
		int bnum2 = 11;
		String bcontent2 = "aaaa";
		String bwriter1 = "aa";
		bwriter1 = "bb";

		TestVo tvo = new TestVo(10, "aa");

		TestVo tvo2 = new TestVo(11);
		tvo2.setBoardContent("aaaa");
		// tvo2.setBoardNum(11);

		tvo2.getBoardContent();
		tvo2.getBoardNum();
	}
}
