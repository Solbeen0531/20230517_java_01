package kh.Lclass.oop.run;

import kh.Lclass.oop.sample.Person;
import kh.Lclass.oop.sample.Student;

public class TestArray {
	final int a=10;
	public static void main(String[] args) {
		
		Object obj1 = new Student();
		Object obj2=new Person();
		Person p1=new Student(); // 인스턴스 p1
		Student s1=new Student();
//		obj1.
		p1.getName();
		s1.getAge();
		
		
		
		
		
		
		final int b=11; // 지역변수 b
		int n=0;
		for(final double maxCnt=5;n<10;n++) {
			System.out.println("테스트 "+n);
		}
		// 방법1
		Person[] personArray2 = new Person[] {new Person(),new Person(),new Person()};
		
		// 방법2
		Person[] personArray = new Person[22];
		for (int i=0;i<personArray.length;i++) {
			personArray[i]=new Person();
		}
		
		
		
		// 아래와 같이 하면 오류 발생
		Person[] personArray3=new Person[22];
		
		
		// personArray[0].setAge(25); 
		// NullPointerException
		// 원인 : '.' 점 찾기. 점 앞에 있는 변수 (=객체=인스턴스)가 null 상태
		// 즉 personArray[0]이 null 주소값을 가지고 있었음
		// 해결방법 : 변수(=객체=인스턴스)에 new 생성자(); 해줌
				
		
		
		personArray3[0]=new Person();
		personArray3[0].setAge(25);
		personArray3[0].setName("김소소");
		personArray3[0].setGender('여');
		
		personArray3[1]=new Person("김개개",19,'남');
		personArray3[2]=new Person("김말말",22,'남');

		System.out.println(personArray3[0].getName()); // 김소소
		
		System.out.println("==== student arr ====");
		
		Student[] stdArray = new Student[3]; // 배열 생성
		for(int i=0; i<stdArray.length; i++) {
			stdArray[i]=new Student() {
				@Override
				public int getGrade() {
					return 0;
				}
				@Override
				public void setGrade(int grade) {
					System.out.println("학년 " + 3); // 객체 생성
					// Override 안에 있는 i는 for 안의 i와는 다르게 적용됨
				}
			}; 
		}
		stdArray[0].setAge(15);
		stdArray[0].setName("김영희");
		stdArray[0].setGender('여');
		
		stdArray[0].setScore(85);
		stdArray[0].setGrade(3);
		
		System.out.println(stdArray[0].getName()); // 김소소
		System.out.println(stdArray[0].getAge()); // 16
		System.out.println(stdArray[0].getGender()); // 여
		
		System.out.println(stdArray[0].toString());
		// Student [name=null, score=0, grade=0,
		// toString()=Person [name=김영희, age=16, gender=여]
		
		// Student [name=김영희, score=0, grade=0,
		// toString()=Person [name=null, age=16, gender=여]
		
		Student yh = new Student("김영희",'여',20,1) {
			public void setGrade(int grade) {
				System.out.println("학년 지정함 ");
			}
		};
		
	}
}


/* 2023-05-26 16시 10분
 * package kh.Lclass.oop.run;
 * 
 * import kh.Lclass.oop.sample.Person;
 * 
 * public class TestArray { 
 * 	public static void main(String[] args) { 
 * 		Person[] personArray = new Person[22]; 
 * 		personArray[0].setAge(25); 
 * 		//NullPointerException 
 * 		// 원인 : '.' 점 찾기. 점 앞에 있는 변수 (=객체=인스턴스)가 null 상태 
 * 		// 즉personArray[0]이 null 주소값을 가지고 있었음 
 * 		// 해결방법 : 변수(=객체=인스턴스)에 new 생성자(); 해줌 
 * 	} 
 * }
 */