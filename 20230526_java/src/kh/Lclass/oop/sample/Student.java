package kh.Lclass.oop.sample;

// The type Student cannot subclass the final class Person
// class 예약어 키워드 abstract는 해당 클래스 내에 abstract 메소드가 0개 이상 있을 것을 의미함
public /* abstract */ class Student extends Person{
	private String name; //학생증용 이름
//	private int age;
//	private char gender;
	private int score;
	private int grade;
	private final int maxCount=10;
	
	public Student() {
	 super(); // person
	//	super("김말말",22,'남'); // Person("김말말",22,'남')
	}
	
	public Student(String name, char gender,int age,int grade) {
		super(name,age,gender);
		this.name=name;
		this.grade=grade;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", grade=" + grade 
				+ ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	public String getName() {
		return this.name;
		//return super.name; 상속한 부모의 name은 private이어서 접근불가
		//return super.getName(); 
		//내꺼는 this로 접근, 상속한거는 super로 접근 가능
		//this도 super도 없으면 내꺼 먼저 그다음 super
		
	}
	@Override 
	// @annotation Overriding
	// 재정의=재구현
	// 조건 : 1. 상속한 클래스의 메소드와
	// 2. 동일한 메소드명(클래스명)
	// 3. 매개변수 자료형, 개수 동일 The method getAge(int) of type Student must override or implement a supertype method
	// 4. 리턴 타입 동일
	// etc. 접근제한자는 달라도 됨 - 부모 메소드의 접근제한자보다 넓은범위가능 Cannot reduce the visibility of the inherited method from Person
	
	public int getAge() {
		return super.getAge()+1; // super 상속한 부모의것
	}






	public int getScore() {
		return score;
	}






	public void setScore(int score) {
		this.score = score;
	}






	public int getGrade() {
		return grade;
	}






//	public void setGrade(int grade) {
//		this.grade = grade;
//	}

	// 변수 선언
	// 메소드 정의 // 이 기능은 이런이런기능으로 되어잇어
	
// 메소드 선언 // 이 기능은 이런이런기능이 잇을꺼야
	public /* abstract */ void setGrade(int grade){
	//The abstract method setGrade in type Student can only be defined by an abstract class
	this.grade = grade;
}



//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	
}
