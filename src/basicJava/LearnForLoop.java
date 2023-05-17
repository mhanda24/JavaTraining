package basicJava;

public class LearnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Starting value is 0 , increment by 1 - Value 1 , increment by 1 - value 2, increment by 2 - value 4
	
		/*int a = 1;
		// a++ is equavalent to a+1
		
		System.out.println(a++); //1 > 2
		System.out.println(a);
		System.out.println(++a); //3 > 3
		
		System.out.println(++a);*/
		
	//	System.out.println(a++);//After executing this row, a will be 2
		
	//	System.out.println(a++); //After executing this row, a will be 3
		
	//	System.out.println(a++); //After executing this row, a will be 4
		
		
		for(int i = 1; i <=100; i++) {
			System.out.println(++i);
			
		}
	
		
		String[] myName = {"Manpreet", "Singh", "Handa","Ram", "Sham","Mohan"};
		System.out.println(myName.length);
		
		
		for(int i = 0; i < myName.length; i++) {
			System.out.println(myName[i]);
			if(myName[i] == "Ram") {
				System.out.println("Inside If loop");
				System.out.println(myName[i]);
				break;
			}
			System.out.println("Not in IF loop");
		}
		
	}

}
/*
 * Array for Month, Read the complete array, Print all values using length
 * Array for Month, Read the complete array, Print all values, Stop when you find October
 *  Array for Month, Read the complete array, Dont Print all values but OCT only and Stop when you find October
 *  
 *  Print the value of addition of numbers from 1-100 E.g. 1+2+3+4+5+6+........
 */
