package basicJava;

public class localVariable {
	
	
	public static void main(String[] args) {
		// Local Variables
		
		// Scope of the variable 
		
		//When it is local - scope is always to that method where you are creating that variable
		int num1 = 2;
		int num2 = 3;
		
			
		System.out.println(add(num1,num2));
		
		

	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}
	
	public static int subtract(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
