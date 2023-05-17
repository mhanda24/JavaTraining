package gmailPackage;

public class testInboxGmailApp {

	public static void main(String[] args) {
		
		
		//Test Gmail inbox
		GmailApp gmail = new GmailApp();
		
		gmail.URL = "https://gmail.com"; // String url = "https://gmail.com";
		gmail.userName = "test"; // String userName = "test"
		gmail.passWord = "test123"; // String passWord = "test123";
		
		System.out.println(gmail.URL);
		System.out.println(gmail.userName);
		System.out.println(gmail.passWord);
		
		
		//Step 1 - Navigate to Gmail
		gmail.NavigateTogmailWebsite(gmail.URL);
	
		//Step 2 - Login tO Gmail
		gmail.login(gmail.userName, gmail.passWord);
		
		//Step 3 - Testing Inbox
		System.out.println("I am testing Gmail Inbox");
		
		
		

	}
	
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
