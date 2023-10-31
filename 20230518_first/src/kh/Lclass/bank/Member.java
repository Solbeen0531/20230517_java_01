package kh.Lclass.bank;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		// 스캐너 마련
		java.util.Scanner sc = new Scanner(System.in);

		System.out.println("통장 개설을 원하십니까?");
		String answer = sc.nextLine();
		if (answer.equals("네")) { // if (answer =="네) 문자로는 ==를 사용해 비교할 수 없다
			System.out.println("주민번호 확인: ");
			String strNo = sc.nextLine();
			
			int sno = Integer.parseInt(strNo);
			// int strNo = sc.nextInt(); sc.nextLine();
			// nextInt 사용 후 nextLine 사용하지 않으면 다음내용이 생략된다.

			System.out.println("이름 확인: ");
			String strName = sc.nextLine();
			BankAccount ej = new BankAccount(sno, strName);
			BankAccount hj = new BankAccount(123123, "종호", 1012131212);
			BankAccount jh = new BankAccount();
			System.out.println(jh.getSno()); // 0
			System.out.println(jh.getName()); // null
			System.out.println(jh.getBalance());// 0
			System.out.println(jh.getAccountName());// 내일배움
			jh.sumArgs(2, 5, 3);

			jh.sum(1, 3);
			jh.sum("11", 22);
			jh.sum(1, 3, 3);

			BankAccount hj2 = new BankAccount(123123, "종호", 1012131212);

			// String
			String str1 = "문자";
			String str2 = "문자";
			String str3 = new String();
			String str4 = new String("문자");
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3); // ""
			System.out.println(str4);

			boolean b = str1.equals(str4);
			if (str1 == str2)
				System.out.println("같다");
			else
				System.out.println("다르다");
			// 1과 2의 출력 결과물은 같고, '같다'로 표시됨;
			// 1과 4의 출력 결과물은 같지만, '다르다'로 표시됨; 주소값이 다름

			System.out.println(hj);
			System.out.println(hj.toString());
			System.out.println(hj.hashCode());

			System.out.println(hj.getSno().MAX_VALUE);
			System.out.println(hj.getSno().MIN_VALUE);
			System.out.println(hj.getSno().toHexString(sno));

			System.out.println("끝");

			char c = '\'';
			System.out.println("한 줄\n한 탭\t탭한슬래쉬\\\\따옴표는 어떻게\"\'?%");
			System.out.printf("한 줄\n한 탭\t탭한슬래쉬\\\\따옴표는 어떻게\"'?%%%%");

			System.out.println("안" + 24); // 안24
			System.out.println("안" + 2 + 4); // 안24
			System.out.println(2 + 4 + "안"); // 6안
			System.out.println(2 * 4 + "안"); // 8안
			System.out.println("안" + 2 * 4); // 안8
			System.out.println(2 + 4 + "안" + 7 + 8); // 6안78
			System.out.println(2 + 4 + "안" + (7 + 8)); // 6안15

			String str = "Hello Java";
			System.out.println(str.indexOf(' ')); // 5; 띄어쓰기는 5번째에 있다

			System.out.println(str.charAt(0)); // H
			System.out.println(str.charAt(1)); // e
			System.out.println(str.charAt(2)); // l
			System.out.println(str.length()); // 10; space bar도 문자 취급된다.
			System.out.println(str.toLowerCase()); // 모두 소문자로 전환
			System.out.println(str.toUpperCase()); // 모두 대문자로 전환

			String strReplace = str.replace('J', 'L');
			System.out.println(strReplace); // Hello Lava

			int idx = str.indexOf(' ');
			String strSubString = str.substring(str.indexOf(' '), str.indexOf(' ') + 2);
			System.out.println(strSubString);

			// String strSubString = str.substring(5); // 5번째 위치부터 끝까지 출력
			// System.out.println(strSubString); // ' Java'로 표시됨
			String strSubString2 = str.substring(5, 8); // 5이상 8미만 번위가 출력
			System.out.println(strSubString2); // ' Ja'로 표시됨

			for (int i = 0; i < str.length(); i++) {

			}
			if (str.length() < 3) {

			}

		} else {
			System.out.println("다른 창구를 이용해주세요.");
		}

	}

}
