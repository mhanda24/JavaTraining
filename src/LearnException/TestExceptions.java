package LearnException;

import java.util.ArrayList;

public class TestExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		
		try {	
			
				
			numbers.add(100);
			numbers.add(200);
			numbers.add(300);
			numbers.add(400);
			numbers.add(500);
			System.out.println(numbers.get(2));
			System.out.println("Testing inbox");
			System.out.println(numbers.get(5));
			

		}catch(Exception e) {
			System.out.println(e.getMessage());
			 System.out.println(numbers.get(4));
			
		}
		finally {
		  
		      System.out.println(numbers.get(3));
		      System.out.println("The 'try catch' is finished.");
	    }
			
	

	}

}
