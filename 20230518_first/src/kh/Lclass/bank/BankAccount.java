package kh.Lclass.bank;

import kh.Lclass.bank.Information;

/*1. 자료형
 * 	- 기본자료형 = 프리미티브 자료형 = primitive type = 기본형形
 * boolean - 1 byte - 논리형 true/false
 * 	boolean a1 = true;
 * byte - 1 byte = 8 bit 정수형
 * 	byte a2 = 20;
 * char - 2 byte
 * 	char a3 = '한';
 * short - 2 byte
 *	short a4 = 20;
 * int - 4 byte 정수
 * 	int a5 = 20;
 * float - 4 byte 실수
 * 	float a6 = 20.0;
 * double - 8 byte 실수
 * 	double a7 = 20.0;
 * long - 8 byte 정수
 * 	long a8 = 20;
 * 용량이 부족할 경우 배열 사용
 * 
 *  - 참조자료형 = 레퍼런스 자료형 = reference type = 참조형形 ==> 클래스명
2. 변수선언 vs 변수활용
		자료형 변수명; // 선언 (변수명은 유일해야 한다)
		변수명 = 값; // 활용 - 대입
		변수명	// 활용 - 꺼내기
3. 메소드 정의 vs - 메소드 호출
	리턴 타입 메소드멍(자료형 매개변수, 자료형 매개변수, ..){ return 값;} // 리턴 타입 = 리턴형
	char abc(int p1) {
		return 'A';
	} // 선언한 타입과 일치하는 return 값이 있어야 한다.


	//메소드 호출
	 * 자료형 변수명 = 메소드명(값,값,..);
	 * char a = abc(100);
*
*
*/

//클래스 선언 vs 클래스/인스턴스/객체 생성 vs 인스턴스 메소드 호출 / 인스턴스 필드값 대입
public class BankAccount {
	// 필드 = 변수선언
	// setter 있으면 안됨
	private int accountNo; // 계좌번호
	private String name; // private String name = new String(); 예금주
	private String accountName = "내일배움"; // 통장이름
	private Information info; // 유의사항
	private int balance; // 잔액
	private Integer sno; // 주민번호
	private int password;
	// private은 동일 class내에서만 사용 가능

	{
		accountName = "내일배움-블럭초기화";
		balance = 5000000;
	}

	// 생성자 클래스명과 동일, 리턴 타입 없음
	/*
	 * public BankAccount() {
	 * 
	 * } 자료형 int int 불가
	 */
	public BankAccount() {
		accountName = "내일배움생성";
		for (int i = 0; i < 5; i++) {
		}
	}

	public BankAccount(String a, int b) {
		this.sno = b;
		this.name = a;
	}

	public BankAccount(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public BankAccount(int accountNo, String name, int sno, String accountName, int password) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.sno = sno;
		this.accountName = accountName;
		this.password = password;
	}

	public BankAccount(int sno, String name, int phonenumber) {
		this.accountNo = phonenumber;
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + "" + ", name=" + name + ", accountName=" + accountName
				+ ",balance=" + balance + "]";
	}

	// overloading 오버로딩 (매개인자=배개변수) 조건 : 매개변수 개수, 자료형이 다르고 메소드 명이 같을 때
	public double sum(double a, double b) {
		return a + b;
	}

	public double sum(double a, int b) {
		return a + b;
	}

	public int sum(String a, int b) {
		return Integer.parseInt(a) + b;
	}

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public int sumArgs(int... args) {
		int result = 0;
		for (int a : args) {
			System.out.println(a);
			result += a;
		}

		System.out.println("합은 " + result);
		// 가변인자 예시
		System.out.printf("printf는 %d가변 [%.2f] 인자 %d 사용 %c %s", 1, 3.5, 2000000000000L, 'c', "문자열도 가능");
		// 쉼표 뒤에 있는 값 대입하기 %d 정수 dgit, %f 실수 float, %c char, %s string
		return result;
	}

	// getter / setter 게터/세터

	// 메소드정의 = 기능정의
	// 입금 --- 출처(source), 금액(inputmoney) 준다면 - balance에 금액만큼 더하고 - 최종 balance 를 화면
	// 표시함
	// 출금 --- 목적지(destination), 금액(outputmoney) 준다면 - balance에 금액만큼 빼고 - 최종 balance
	// 를 화면 표시함
	// 비번확인 --- 입력한패스워드(inputpassword)와 - password를 비교하여 같다면 true, 다르면 false를 표시함.
	// 잔액조회
	// 입출금내역조회
	// 입금 --- 출처(source), 금액(inputmoney) 준다면 - balance에 금액만큼 더하고 - 최종 balance 를 화면
	// 표시함
	public String deposit(String source, int inputMoney) {
		System.out.println(source + "으로 부터 " + inputMoney + "만큼 입금되었습니다");
		double interate = 0.05;
		balance = balance + inputMoney;
		interate = 5;
		return "입금 후 잔액은" + balance + "입니다";
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public String getAccountName() {
		return accountName;
	}

	public Information getInfo() {
		return info;
	}

	public int getBalance() {
		return balance;
	}

	public Integer getSno() {
		return sno;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void setInfo(Information info) {
		this.info = info;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public void setPassword(int password) {
		this.password = password;
	}

}
