package LearnJavaStaticFunctions;

public class LearnStaticFunctions {
	
	public static String abcd="Test";
	
	public static void enterText() {
		System.out.println("Entering text");
		System.out.println(abcd);
	}
	
	public static void clickButton() {
		System.out.println("Clicking Button");
	}
	
	public static void clickCheckBox() {
		System.out.println("Clicking Checkbox");
	}
	
	public void clickRadioButton() {
		System.out.println("Clicking Radio Button");
		System.out.println(abcd);
	}

}
