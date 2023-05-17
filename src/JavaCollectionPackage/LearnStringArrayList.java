package JavaCollectionPackage;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LearnStringArrayList {

	public static void main(String[] args) {
		/*
		 * The difference between a built-in array and an ArrayList in Java, is that the size of an array
		 * cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). 
		 * While elements can be added and removed from an ArrayList whenever you want.
		 * 
		 */
		//array
	try {
		String[] Cars = {"car1", "Car2","car3"};
		System.out.println(Cars[1]);
		System.out.println(Cars.length);
	
		
		//Regular For loop
		for(int i=0; i<Cars.length; i++) {
			System.out.println(Cars[i]);
		}
		//For each
		for(String Car : Cars) {
			
			if(Car=="Car2") {
				System.out.println(Car);
				break;
			}
		}
		//Primitive types - int, long, double, char, float,boolean, byte, short		
		//arraylist
		ArrayList<String> cars = new ArrayList<String>();
		//to add value in the arraylist
		cars.add("car1");
		cars.add("car2");
		cars.add("car3");
		cars.add("car4");
		cars.add("car2");
		cars.add("car4");
		
		System.out.println("-----------" + cars);
		
		cars.add("car5");
		System.out.println(cars);
		cars.add("car6");
		System.out.println(cars);
		
		
		//To get or print any value based on index
		System.out.println(cars.get(1));
		//To replace the value at particular index
		cars.set(1,"newcar2");
		
		System.out.println(cars.get(1));
		//To remove the value based on the index
		cars.remove(3);
		
		System.out.println(cars);
		
		System.out.println(cars.size());
		
		for(int i = 0; i <cars.size(); i++) {
			System.out.println("For Index# " + i + " value is " + cars.get(i));
		}
		//for each
		for(String c : cars) {
			System.out.println(c);
		}
		
		 ArrayList<String> NewCars = new ArrayList<String>();
		 NewCars.add("Volvo");
		 NewCars.add("BMW");
		 NewCars.add("Ford");
		 NewCars.add("Mazda");
		 System.out.println(NewCars);
		 
		 //Sorting in ascending order
		 Collections.sort(NewCars);
		 //Getting the index of an element based on the value
		 System.out.println(cars.indexOf("car3"));
				 
		 System.out.println(NewCars);
		 
		 LinkedList<String> oldcars = new LinkedList<String>();
		 
		 ArrayList<Integer> al = new ArrayList<Integer>(); //Shortcut to do import--- CTRL KEY + SHIFT KEY + O KEY
	}catch(Exception e) {
		
	}
	
	
	}

}

/*
 * Create an arrayList for Integers and apply all functions - add, get, set, remove
 * for each loop
 * 
 * Second Homework - Get index of every item using for each loop
 * 
 * Third Homework - Create Linkedlist for a Cars - Use already read functions plus these functions - addFirst, addLast, removeFirst, removeFirst, getFirst, getLast
 */
