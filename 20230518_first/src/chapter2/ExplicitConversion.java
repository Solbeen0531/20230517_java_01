package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum1 = 1.2;
		float fNum2 = 0.9f;
		
		int iNum3 = (int)dNum1 + (int)fNum2; // 두 실수가 각각 형 변환되어 더해짐
		int iNum4 = (int)(dNum1 + fNum2); // 두 실수의 합이 먼저 계산되고 형 변환됨
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		int a1 = 10;
		int b1 = 3;
		int c1 = a1 / b1;
		double d1 = a1 / b1;
		double d2 = (double)(a1 / b1);
		double d3 = (double)a1 / (double)b1;
		double d4 = (double)a1 / b1; // best
		double d5 = a1 / (double)b1; // best
		
		
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		
		/*
		 * int = int; int / int int / int = int
		 */
		
		
		

	}

}
