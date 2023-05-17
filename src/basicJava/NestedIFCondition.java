package basicJava;

public class NestedIFCondition {

	public static void main(String[] args) {

		int marks = 95;
		
	
		//A grade - equal to or more than 95%
		//B grade - between than 80 - 94%
		//C grade - between 60-79%
		//D grade - less than or equal to 59%
		
		//to use and operator - &&
		//to use or operator - ||
		
		if(marks <=59 ) {
			System.out.println("D grade");
		}else 
			if(marks >=60 && marks <=79) { // If both conditions are true only then it will go inside this block of if
				System.out.println("C grade");
			}else 
				if(marks >=80 && marks <=94){
					System.out.println("B grade");
				}else {
					System.out.println("A grade");
				}

	}

}/*
Print Name of the week using IF else - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, not a correct day
*/

