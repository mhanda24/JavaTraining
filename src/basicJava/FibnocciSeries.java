package basicJava;

public class FibnocciSeries {

	public static void main(String[] args) {
		//Fibnocci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

		//Step 1 - print 0 
		int a = 0;//1st value, 2nd value, 3rd value, 4th value 
		System.out.print(a);
		//step 2 - Print 1
		int b = 1; // 2nd value, 3rd value, 4th value 
		System.out.print(" " + b);

		for (int i = 2; i <10; i ++) {
			//Step 3 Sum of last 2 numbers
			int c = a + b; 
			
			System.out.print(" " + c);

			a = b; // assign next value always
			b = c; // assign next value always

		
		}




	}

}
