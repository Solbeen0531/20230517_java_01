package member.model.vo;

import java.util.Date;
// import java.lang.*; JVM이 대신 넣어줌  

public class Member {
	private String name;
	private int age;
	private Date enrollDate;
	public Member() {}
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

}
