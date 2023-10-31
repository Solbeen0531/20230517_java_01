package com.kh.practice1.run;

import com.kh.practice1.func.VariablePractice1;

public class Run {
	public Run() {
		super();
	}

	public static void main(String[] args) {
		System.out.println(VariablePractice1.cnt); // italic 스타일은 static을 의미
		
		
		
		
		// 객체=인스턴스 vp 생성
		VariablePractice1 vp = new VariablePractice1();
//		VariablePractice1.cnt=11;

		
//		vp.method1();
//		vp.method2();
//		vp.method3();
		vp.method4();


	}
}
