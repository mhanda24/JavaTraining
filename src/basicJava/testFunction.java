package basicJava;

public class testFunction {

	public static void main(String[] args) {
				
				int num1 = 100;
				int num2 = 10;

							//	int sum = num1+num2;
			//	System.out.println("----------------------"+sum);
				//This is what a calling of a function is. You can call parameters as Arguments while calling a function
				
				
				
				additionCalculator(num1, num2); 
				additionCalculator(150, 50);
				//Java will go inside the function and execute all the lines of code added inside the function
				subCalculator(num1,num2);
				divisionCalculator(num1,num2);
				additionCalculator(num1,num2,3);
				
				//Hard coded values
			/*	additionCalculator(200, 20); //Java will go inside the function and execute all the lines of code added inside the function
				subCalculator(200,20);
				divisionCalculator(200,20);*/
				
				
				
				
				/*	additionCalculator(num1, num2);
				additionCalculator(300, 200);
				additionCalculator(1100,1000);
				divisionCalculator(1200,200);
				testFunction.addCalc(2, 3);*/
		//		System.out.println("sum of 2 numbers " + addCalc(2, 3));
				
		//		int sum = addCalc(2,3);
		//		System.out.println(sum);
		
	}
	
	//User defined functions
	//Parameterization of the functions or it can be an input to the function
	public static void additionCalculator(int number1, int number2) {
		number1 = 200;
		int sum = number1+number2;
		System.out.println("sum of two numbers " +number1+ " and " +number2+ " = " + sum);
	}
	
	public static void subCalculator(int number1, int number2) {
		int subtraction = number1-number2;
		System.out.println("Subtraction of two numbers " +number1+ " and " +number2+ " = " + subtraction);
	}
	
	public static void additionCalculator(double number1, double number2) {
		double sum = number1+number2;
		System.out.println("sum of two numbers " +number1+ " and " +number2+ " = " + sum);
	}
	
	public static void additionCalculator(int number1, int number2, int number3) {
		int sum = number1+number2+number3;
		System.out.println("sum of two numbers " +number1+ " and " +number2+ " = " + sum);
	}
	
	public static void divisionCalculator(int number1, int number2) {
		int division = number1/number2;
		System.out.println(division);
	}
	
	/*Homework 
	 * Create function to add 2 and also another function for 3 numbers and call it 2 times atleast
	 * Create calculator for substraction, multiplication for 2 numbers and call it atleast 2 times
	 * Create division function for 2 numbers and call it atleast 2 times.
	 * + for addition
	 * - for substraction
	 * * for mulitplication
	 * / for division
	 */

	public static void addCalc(int a , int b) {
		System.out.println(a+b);
	}
	
	/*public static int addCalc(int a , int b) {
		return (a+b+c);
	}
	*/
	/*public static int addCalc(int a , int b, int c) {
		int sum = a+b+c;
		return sum;
	}*/
	
}
