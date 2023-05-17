package basicJava;

public class LearnBreakContinue {

	public static void main(String[] args) {
		
		String[] myNames = {"Manpreet", "Singh", "Handa","Ram", "Sham","Mohan","Ram","Bob"};
		
		for ( String name : myNames) {
			System.out.println(name);
			/*if(name == "Ram") {
				System.out.println("Want to do something");
				break;
			}*/
			if(name == "Ram") {
				System.out.println("Want to do something");
				continue;
			}
		}

	}

}
