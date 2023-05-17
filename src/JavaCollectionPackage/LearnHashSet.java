package JavaCollectionPackage;

import java.util.HashSet;

public class LearnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cars = new HashSet<String>();
		//to add value in the HashSet
		cars.add("car1");
		cars.add("car2");
		cars.add("car3");
		cars.add("car4");
		cars.add("car2");
		cars.add("car4");
		
		System.out.println("-----------" + cars);
		System.out.println(cars.contains("car1"));
		
		for(String car : cars) {
			System.out.println(car);
		}

	}

}
