package gmailPackage;

public class GmailApp {
	
	String userName;
	String passWord;
	String URL;
	
	public void NavigateTogmailWebsite(String URL) {
		System.out.println("Gmail opened successfully");
	}
	
	public void login(String userName, String passWord) {
		System.out.println("Entered username as " + userName);
		System.out.println("Entered Password as " + passWord);
		System.out.println("Click Login button");
		System.out.println("User logged in successfully");
	}

}
