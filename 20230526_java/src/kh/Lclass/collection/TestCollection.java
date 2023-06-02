// 2023-06-01 작성

package kh.Lclass.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import kh.Lclass.oop.sample.Car;

public class TestCollection {
	
	public <E extends Number, J> String testGeneric(E a, J b) {
		System.out.println(a.getClass().getName());
		return a.toString()+" 결과값"+b.toString();
	}
	
	
	public void testStack() {
		Stack<String> strStack = new Stack<String>();
		strStack.push("안녕");
		strStack.add("하");
		strStack.push("세요");
		System.out.println(strStack.get(1));
		System.out.println(strStack);
		System.out.println(strStack.peek());
		System.out.println(strStack);
		System.out.println(strStack.pop());
		System.out.println(strStack);
	}
	
	public void testHashMap() {
		Map<String, Object> objMap = new HashMap<String, Object>();
		objMap.put("ej", 35.0);
		objMap.put("jy", "지영이네");
		objMap.put("hj", new Car(5000));
		System.out.println(objMap.toString());
		System.out.println(objMap.get("jy"+":"+objMap.get("jy")));
		Set<String> keyset = objMap.keySet();
		System.out.println(keyset);
		System.out.println("==== Map: enhanced for ====");
		
		for(String item:keyset) {
			Object value = objMap.get(item);
			System.out.println(item+" : "+value);
		}
		
		System.out.println("==== Map: enhanced for ====");
		
		Iterator<String> itr = keyset.iterator();
		
		while(itr.hasNext()) {
			String item = itr.next();
			Object value = objMap.get(item);
			System.out.println(item+" : "+value);
		}
		
		
		
		
	}
	
	public void testHashSet() {
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(11);
		integerSet.add(22);
		integerSet.add(33);
		integerSet.add(11);
		
		System.out.println(integerSet.toString());
		System.out.println("==== Set :  enhanced for ");
		System.out.println(integerSet.size());
		for( Integer item : integerSet) {
			System.out.println(item);
		}
		
		System.out.println("==== Set : Iterator 사용 ====");
//		integerSet.iterator();
		Iterator<Integer> itr = integerSet.iterator();
		System.out.println(itr); // HashMap 의 iterator
		
		while(itr.hasNext()) {
			Integer item = itr.next();
		}
		System.out.println(itr);
	}

	public void testArrayList() {
		String[] strArr1 = new String[3];
		strArr1[0] = "banana";
		strArr1[1] = "strawberry";
//		ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		strArr1[3] = "watermellon";
		strArr1.clone();
		//FIXME 오류!!! ArrayIndexOutOfBoundsException:
		
		
		/*
		 public class ArrayList implements List{
		 
		 	public boolean add(Object e){
		    	// 
		    }
//		    public boolean add(Integer e){
//		    	// 
//		    }
//		    public boolean add(Double e){
//		    	// 
//		    }
//		    public boolean add(Car e){
//		    	// 
//		    }
		 }
		 
		 */
		
		
		
//		ArrayList<String> list1 = new ArrayList<String>(); 
		// 한 단어를 쓰고 import하는 것이 중요하다
		ArrayList<Integer> list2 = new ArrayList<Integer>(); 
		ArrayList<Car> list3 = new ArrayList<Car>();
		list3.add(new Car(3000));
		list2.add(25);
		list2.add(26);
		list2.add(null);
		list2.add(27);
		list2.add(55);
//		list2.add(10, 56); // 끼워넣기 insert가 index 현재 크기 size()보다 클 수 없음
//		IndexOutOfBoundsException: Index: 50, Size: 3
//		IndexOutOfBoundsException: Index 1000 out of bounds for length 3
		System.out.println(list2.get(2));
		System.out.println(list2.get(3));
		
		System.out.println("=====List - for=======");
		
		// List - for
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		for (int i = 0; i < list2.size(); i++) {
			Integer item = list2.get(i);
			System.out.println(item);
		}
		
		System.out.println("======배열 - for========");
		
		// 배열 - for
		for (int i = 0; i < strArr1.length; i++) {
			System.out.println(strArr1[i]);
		}
		for (int i = 0; i < strArr1.length; i++) {
			String item = strArr1[i];
			System.out.println(item);
		}
		
		System.out.println("=====enhanced-for=======");
		
		//enhanced-for 중간에 끊을 수 없음
		for(Integer item : list2) {
			System.out.println(item);
		}
		for(String item : strArr1) {
			System.out.println(item);
		}

		
		System.out.println("=========================");
		
		
		List<String> list1 = new ArrayList<String>();
		if (list1.add("7번")) {
			System.out.println("list1 에 추가 성공했습니다.");
		}
		
		list1.add("2번");
		list1.add("1번");
		list1.add("2번");
		list1.add("3번");
		list1.add(1,"2번 대신 끼워넣기");
//		list.remove("2번");
		Collection<String> collection1 = new ArrayList<String>();
		collection1.add("2번");
//		collection1.add("3번");
		list1.removeAll(collection1);
		((ArrayList<String>)list1).clone();
		
		if(list1 instanceof ArrayList/*<String>*/) {
			@SuppressWarnings("unchecked")
			ArrayList<String> copyList = (ArrayList<String>)(((ArrayList<String>)list1).clone());
			System.out.println(copyList);
		}
		
		
//		list.remove(0);
//		list.clear();
		System.out.println(list1);
		
		
	}

}
