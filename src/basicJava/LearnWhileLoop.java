package basicJava;

public class LearnWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize before the while loop
		//Condition will be in while loop keyword
		//Increment will be last part of the while loop body

/*		for(int i = 1; i <=10; i++) {
			System.out.println(i);
			
		}*/
		
	/*	int i = 1;
		
		while(i<=10) {
			System.out.println(i);
			i++;
		}*/
		
		String[] myName = {"Manpreet", "Singh", "Handa","Ram", "Sham","Mohan"};
		System.out.println(myName.length);

		
		int i = 0;
		
		while(i < myName.length) {
		//	System.out.println(myName[i]);
			if(myName[i] == "Ram") {
				System.out.println(myName[i]);
				break;
			}
			i++;
		}
		
		
		
	}

}

/*
 * Array for Week, Read the complete array, Print all values using length
 * Array for week, Read the complete array, Print all values, Stop when you find Thursday
 *  Array for week, Read the complete array, Dont Print all values but Thursday only and Stop when you find thursday
 *  *  Print the value of addition of numbers from 1-100 E.g. 1+2+3+4+5+6+........
 *  
 */

