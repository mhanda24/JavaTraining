package basicJava;

public class LearnForEachLoop {

	public static void main(String[] args) {
		
		String[] myNames = {"Manpreet", "Singh", "Handa","Ram", "Sham","Mohan"};
		
		String[] states = {"Punjab", "Delhi", "Bihar","Goa", "Sikkim","MP"};
		
		int[] numbers = {1,2,3};
		
		for(int no : numbers) {
			System.out.println(no);
		}
		
		
		for(String myName : myNames ) {
			System.out.println(myName);
			
		}
		
		for(String state : states ) {
			System.out.println(state);
			if(state == "Goa") {
				break;
			}
			
		}
		
		
		
	}
	/* 
	 * Home work - Print each value of Fibnocci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
	 */ 
//Create a code for fibnocci series till 34 value.
}
