package basicJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LearnDateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    System.out.println("Filename-"+myObj);
	    
	    LocalTime myObjTime = LocalTime.now();
	    System.out.println(myObjTime);
	    
	    LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");

	    String formattedDate = myObjTime.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}

}
