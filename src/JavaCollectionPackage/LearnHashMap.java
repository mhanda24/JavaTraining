package JavaCollectionPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class LearnHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> cars  = new HashMap<String , String>();//First data Type belongs to keys & second belongs to Values
		
		//Can't use duplicate keys
		//No order maintained in hashmaps
		cars.put("Tesla", "X model");
	//	System.out.println(cars);
		cars.put("Tesla", "Y model");
	//	System.out.println(cars);
		cars.put("Honda", "CRV model");
		cars.put("Toyota", "Camry");
		
		System.out.println(cars);
	//	System.out.println(cars.get("Toyota"));
		
//		System.out.println(cars.size());
		
		
		for(String carNameValues : cars.values()) {
			System.out.println(carNameValues);
		}
		
		for(String carKeys : cars.keySet()) {
			System.out.println(carKeys);
		}
		
		
		for(String carNameKeys : cars.keySet()) {
			System.out.println(carNameKeys + "-----" + cars.get(carNameKeys));
		}
		
		
		
		
	}
	
	/*
	 * Store -- Person Name and age - Use Hashmap 
	 * Itertae through keys and values and also display all values based on key iteration
	 * 
	 * Store - Amazon Product - Price- Hashmap
	 * Itertae through keys and values and also display all values based on key iteration
	 */
	 

}
