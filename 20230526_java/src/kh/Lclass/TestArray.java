package kh.Lclass;

import java.util.Arrays;

public class TestArray {
	private int a;

	public static void main(String[] args) {
		String[] strArr = new String[3];
		strArr[0] = "apple";
		strArr[1] = "banana";
		strArr[2] = new String("mango");

		String[] strCopyArr = new String[strArr.length];
		// String[] strCopyArr=new String[]; [숫자] 미입력 시 에러 출력

		for (int i = 0; i < strArr.length; i++) {
			strCopyArr[i] = strArr[i];
		}

		strArr[2] = "orange";
		strCopyArr[1] = "strawberry";
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i] + " : " + strCopyArr[i]);
		}
		System.out.println("===========================================");

		int a = 10;
//		a.
		int[] arrA = new int[3];
		arrA[2] = 20;
		int[] arrB = arrA.clone();
		System.out.println(arrB.length);
		System.out.println(arrB[2]);

		System.out.println("======Arrays.copyof===");
		String[] strCopyArr2 = Arrays.copyOf(strArr, 5);// Arrays 5로 설정해도 null 처리만 되고 오류미출력
		for (int i = 0; i < strCopyArr2.length; i++) {
			System.out.println(strCopyArr2[i]);
		}

		System.out.println("======System======");
		String[] strCopyArr3 = new String[5];
		System.arraycopy(strArr, 1, strCopyArr3, 0, 2);
		for(int i=0;i<strCopyArr3.length;i++) {
			System.out.println(strCopyArr3[i] );
		}
		
		
		
		
		
		

		System.out.println("===========================================");
		String[] strArr2 = { "apple", "banana", new String("mango") };
//		System.out.println(strArr2[2]);
		String[] strArr3 = { new String("apple"), new String("banana"), new String("mango") };
		String[] strArr4 = new String[] { "apple", "banana", new String("mango") };
		String[] strArr5 = new String[] { new String("apple"), new String("banana"), new String("mango") };

		System.out.println("strArr의 1번째 과일은" + strArr[0]);
		System.out.println("strArr의 2번째 과일은" + strArr[1]);
		System.out.println("strArr의 3번째 과일은" + strArr[2]);
		System.out.println("strArr의 3번째 과일은" + strArr[strArr.length - 1]);

//		for(int i=0;i<=strArr.length-1;i++) { 
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr의 " + i + "번째 과일은 " + strArr[i]);
			System.out.printf("strArr의 %d번째 과일은' %s\n", i, strArr[i]); // 타입 안맞으면 오류

		}

//		System.out.println(strArr[0]);

//		String str;
//		 System.out.println(str);
//		// System.out.println(str); string, int 값 안넣고 출력하려고 하면 오류 발생

		int[] intArr = new int[3];
		System.out.println(intArr[1]);

		int[] intArr2 = new int[] { 1, 2, 3 };
//		int[] intArr2 = new int[3] { 1, 2, 3 }; 중괄호 안의 숫자와 대괄호 안의 숫자가 같건다르건 동시에 쓰면 에러발생
		int[] intArr3 = { 1, 2, 3 }; // 이렇게 써도 가능

//		student[] studentArr=new 
	}

}
