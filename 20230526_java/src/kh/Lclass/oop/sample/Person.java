package kh.Lclass.oop.sample;

import java.io.Serializable;

// import java.lang.*; 안써도 되는 import

/**
 * 파란 주석 java docs에 표시됨 여기에 UID 생성날짜, 누가, 무엇 때문에 작성하였는지를 남겨야 함
 */
public class Person /* extends Object */ implements Serializable {

	private static final long serialVersionUID = 452843279181773421L;
	protected String name; // 주민등록증상 이름
	private int age;
	private transient char gender; // 'M' / 'F'

	// 기본 생성자
	public Person() {

	}

	// 생성자:오버로딩이 가능.리턴타입이 없음.new생성자.

	// allArgumentsConstructor 만들어주세요.
	// 모든 매개인자를 받아서 처리하는 생성자. overloading 으로 생성자

	public Person(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	// getter / setter

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
