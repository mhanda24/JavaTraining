package basicJava;

public class VariablesLesson {

	public static void main(String[] args) {
		
		//Comments - Plain english text for our information
		
		
		//Data Manipulation
		
		//What are variables
		//Data Type 
		int x = 20; //x is variable name with value 20 . Initialization of the variable
		//Initialization of the variable - Create Variable name, Assign Value and Data type.
		int y = 30; //y is a variable with value 30. Initialization of the variable
		
		
		//Q - Assigne Mobile number 123456789 
		//Best Practice to Create Variable - Starts witj lowerCase. If you want to use 2 words together then use Uppercase for second word.
		
		int phoneNumber = 123456789;
		
		System.out.println("PhoneNumber - " + phoneNumber);  //Concatination 
		
		String number = "100";
		String number2 = "200";
		String name = "Manpreet300";
		System.out.println(number+number2 + name);
		
		
		int a = 10;
		int b = 20;
	//	int c = a;//Impt - Both data types should be same
		int c = a+b; 
	//	System.out.println(c);		
	
		System.out.println(name + a + b);
		System.out.println(name + (a+b));
		
		
		System.out.println(a+b);
		System.out.println(c);
		
		Long d = 20000000000L;
		
		System.out.println(d);
		
		System.out.println(a + number);
		
		double e = 3.14;
		float f = 3.145f;
		
		System.out.println(e);
		System.out.println(f);
		
		/*Homework - 
		Do subtraction on 2 integres 
		Concat int and String - Happy Birthday 20
		Concat Float and String - Happy Birthday 20.5
		Concat double and String
		Add Long and Int number
		Add float and Double
		Add 2 Strings - Welcome to Automation Training;
		Define 2 strings with numeric values and print them together
		
		Print all of the above
		*/
	

	}

}
