package kh.Lclass.oop.sample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class TestPolymophism {
	
	public static void main(String[] args) {
		
		ArrayList<Car> carArrList 	= new ArrayList<Car>(); //업캐스팅 안한거. 
		List<Car> CarList 			= new ArrayList<Car>();//업캐스팅. 가장 흔하게 선언하는 방식
		List<Car> CarList2			= new LinkedList<Car>();//업캐스팅. 가장 흔하게 선언하는 방식
		Collection<Car> carCollection = new ArrayList<Car>();
		
		
		
		// 오류 new TestInterface();
//		TestInterface kh = new Kh();
//		((Kh)kh).khSpecial();
		
		TestInterface bit;
		TestInterface bit2;
		Kh kh2 = new Kh();
		kh2.khSpecial();
//		kh2.method1();
		
		
		
		
		
//		Driver ej = new Driver();
		Driver ej = new DriverSub();

		ej.setMoney(10000);

//		ej.buy(new Car());
		ej.buy(new Avante());
		ej.buy(new Sonata());

		Driver jh = new DriverSub();

		jh.setMoney(10000);
		jh.buy(new Avante());
		jh.buy(new Sonata());
	}
}
