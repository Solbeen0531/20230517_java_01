package kh.Lclass.oop.sample;

// import java.lang.*; 안써도 되는 import

public class Person /*extends Object*/{
	protected  String name; // 주민등록증상 이름
	private int age;
	private char gender; // 'M' / 'F'

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
