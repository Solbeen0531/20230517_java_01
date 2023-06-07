package kh.Lclass.api;

public class TestSingleton {
	private int a=10;
	private static TestSingleton instance = new TestSingleton(); 
	
	private TestSingleton() {} // 생성자 private으로 하면 접근불가
	
	public static TestSingleton getInstance() {
		return instance;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
	
}
