package kh.Lclass.oop.sample;

public class Car {
	private int price;
	
	public Car() {}
	public Car(int price) {
		this.price = price;
	}
	
	
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void defaultFun() {
		System.out.println("Car basic function");
	}
	
	
	public void moveCar() {
		System.out.println("Car move");
	}
	
	
}
