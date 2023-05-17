package basicJava;

public class LearnSwitchStatement {

	public static void main(String[] args) {

		//A grade - equal to or more than 95%
		//B grade - between than 80 - 94%
		//C grade - between 60-79%
		//D grade - less than or equal to 59%
		
		//Declaring a variable for switch expression  
	   
	   /* 
	    if(number == 10) {
	    	System.out.println("10");  
	    }else if(number == 20) {
	    	System.out.println("20");
	    }else {
	    	System.out.println("30");
	    }*/
		int rollNumber = 003; 
		
	    switch(rollNumber){  
	    //Case statements  
	    case 001: 
	    	System.out.println("Monica"); 
	    break;
	    case 002: 
	    	System.out.println("Richa");  
	    break;  
	    case 003: 
	    	System.out.println("Krithika");  
	    break; 
	    case 004: 
	    	System.out.println("Sameera");  
	    break;
	    case 005: 
	    	System.out.println("Thahira");  
	    break;
	    //Default case statement  
	    default:
	    	System.out.println("Not in the selenium class");  
	    }  
		
		
	}

}
/*
Print Name of the week using Switch Case - Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday, not a correct day
*/
