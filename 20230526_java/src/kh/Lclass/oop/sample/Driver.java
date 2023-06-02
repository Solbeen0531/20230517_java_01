package kh.Lclass.oop.sample;

public class Driver {
	private int license;
	private int money;

	public int getLicense() {
		return license;
	}

	public void setLicense(int license) {
		this.license = license;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	// 자동차 구매
	public void buy(Car c) { // 다운캐스팅
		if (money > c.getPrice() /* 자동차 가격 */) {
//			((Avante) c).moveAvante(); // 동적 바인딩
			

			if (c instanceof Sonata) {
//				((Sonata) c).moveSonata(); // (Sonata)c.moveSonata(); c의 Sonata 형변환 후 moveSonata()접근
				c.defaultFun();
				System.out.println("Sonata 이벤트에 응모되셨습니다. ");
			}
			if (c instanceof Car) {
				System.out.println("Car 이벤트에 응모되셨습니다.");
			}
			if (c instanceof Object) {
				System.out.println("Object 이벤트에 응모되셨습니다.");
			}
			System.out.println(c.getPrice() + "원에 구매확정");
			money = money - c.getPrice();
			c.moveCar();
		} else {
			System.out.println("잔액 부족! . 현재 잔액은 " + money);
		}
	}

	// 자동차 운전
	public void driving() {

	}
}
