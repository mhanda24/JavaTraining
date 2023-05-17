package JavaCollectionPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnIterator {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		//to add value in the HashSet
		cars.add("car1");
		cars.add("car2");
		cars.add("car3");
		cars.add("car4");
		cars.add("car2");
		cars.add("car4");
		
			
		for(String car : cars) {
			System.out.println(car);
		}
		System.out.println("-----------------------");
		
		Iterator<String> car = cars.iterator();
		while(car.hasNext()) {
			System.out.println(car.next());
			 if(car.equals("car4")) { // String - Use equals function instead of == 
				break;
			}
		}
		
		System.out.println("Outside while loop");

	}

}
