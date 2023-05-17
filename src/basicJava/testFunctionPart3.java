package basicJava;

public class testFunctionPart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 10;
		
	//	int sum = num1 + num2;
		int sum2 = additionCalculator(a, b);
		double sum3 = additionCalculator(a, b);
		
		System.out.println("sum of two numbers " +a+ " and " +b+ " = " + sum2);
		System.out.println(divisionCalculator(sum2,11,3));
		System.out.println("sum of two numbers " +a+ " and " +b+ " = " + sum3);
		
		//String b1= ;
		System.out.println( greeting("Monica ", "Sharma"));
		
		System.out.println("Add 2 numbers " + additionCalculator(a, b));
		
	


	//	System.out.println(sum);
	}

	//VOID is a return type. Void means nothing-Don't return anything
	public static int additionCalculator(int number1, int number2) {
		int sum = number1+number2;
		System.out.println("sum of two numbers " +number1+ " and " +number2+ " = " + sum);
		return sum;
	}
	
	public static double additionCalculator(double number1, double number2) {
		double sum = number1+number2;
		
		return sum;
	}

	public static int divisionCalculator(int number1, int number2, int number3) {
		int division = (number1/number2) * number3;
		return division;
	}
	

	public static String greeting(String value1, String value2)
	{
		String a = "Hello world  " ; 

		String greet= a + value1 + value2;
		return greet;
	}
	
	/* 
	 * homework - change all functions of claculuator for different data types
	 * Create a function for string data type and print Hello World with your name Return (Hello world, Name). where name will come from Variable
	 */

	//
}
