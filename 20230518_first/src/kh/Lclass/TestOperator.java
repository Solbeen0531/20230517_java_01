package kh.Lclass;

public class TestOperator {
	public static void main(String[] args) {
		/*
		 * int num1 = 100; int num2 = 3; double num3 = 3.0;
		 * 
		 * System.out.println(num1 % num2); System.out.println(num1 % num3);
		 * System.out.println(-num1); System.out.println(-(-num1 - 10));
		 */
		// 구구단

		int a = 1;
		int b = 0; // 처리완료자 수

		a = a + 1; // 대기번호표, 대기자 수 와는 다름 a += 1;
		a += 1; // 부호 연산자처럼 띄어쓰면 오류남
		System.out.println(a); // 3
		a = a * 2;
		System.out.println(a);// 6
		a *= 2;
		System.out.println(a);// 12
		a = a % 4;
		System.out.println(a);// 3
		a %= 4;
		System.out.println(a + "\n");// 3

		a++;
		++a;
		--a;
		a--;
		a = 10;
		System.out.println(++a);// 11
		// a += 1; a에 1을 더한 값을 a에 대입한다. 10에 1을 더한 값을 a에 대입하여 11이 된다.
		System.out.println(a);// 11
		System.out.println(--a);// 10
		System.out.println(a + "\n후위증감");// 10
		a = 10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a + "\n");

		System.out.println("비교연산자 결과는 true/false");
		System.out.println(3 < 7);
		boolean c = !(3 < 5);// boolean 자료형은 int형으로 변환 불가능하다.
		// boolean d = !3 < 5; [Java]정수값, 실수값, 문자값 등은 true/false로 형변환 불가
		System.out.println("\n");
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10 );
		//논리 곱에서 앞 항의 결과 값이 거짓이므로 이 문장은 실행되지 않음
		// ((num1 = num1 + 10) < 10) 
			// (num1)
				// num1 + 10
				// num1 대입
			// 10
		// ((i = i + 2) < 10)
		//순서
		// num1 = num1 + 10; //20
		// num1 < 10 // false
		// false && 뒷항 실행되지 않음
		//value = false;
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10 ) > 10) || ((i = i + 2) < 10);
		//순서
		// num1 = num1 + 10; //20 + 10 = 30
		// num1 > 10 // true
		// true || 이면 뒷항 실행하지 않음
		//value = true ;
				
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
	}
}
