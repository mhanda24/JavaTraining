package basicJava;

public class learnArray {

	public static void main(String[] args) {
		String name = "Manpreet SINGH Handa";
		
		String firstName = "Manpreet";
		String middleName = "SINGH";
		String lastName = "Handa";
		String FFName = lastName;
		System.out.println(FFName);
		
		String[] myName = {"Manpreet", "Singh", "Handa"};
		System.out.println("My Name is " + myName[0]);
		System.out.println("My Name is " + myName[1]);
		System.out.println("My Name is " + myName[2]);
		
		
		String fName = myName[0];
		System.out.println(fName);
		//Array - String Array, Int Array, and so on
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		System.out.println("---------"+ numbers.length);
		System.out.println(numbers[4]);
		
		int[] even = {2,4,6,8,10,12,14,16,18,20};
		//Print 6th element from the even int array
		
		System.out.println("Element at 6th position of integer EvenNumbers Array is :  "+even[5]);

	}

}
/*Homework - Use Few indian States for an array and print value of any state and length
 * 2 - Even numbers and print length and any value
 * 
 */
