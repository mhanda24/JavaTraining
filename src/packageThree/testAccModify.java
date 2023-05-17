package packageThree;

import packageTwo.JavaAccessModifiers;

public class testAccModify {

	public static void main(String[] args) {
		
		JavaAccessModifiers jm = new JavaAccessModifiers();
		System.out.println(jm.number1);
		System.out.println(jm.number2);
		
		jm.sum();
	
		
	}

}
