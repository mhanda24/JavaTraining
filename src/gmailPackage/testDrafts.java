package gmailPackage;

public class testDrafts {

	public static void main(String[] args) {
		//Test Gmail inbox
		GmailApp gmailInbox = new GmailApp();

		gmailInbox.URL = "https://gmail.com"; // String url = "https://gmail.com";
		gmailInbox.userName = "test"; // String userName = "test"
		gmailInbox.passWord = "test123"; // String passWord = "test123";

		System.out.println(gmailInbox.URL);
		System.out.println(gmailInbox.userName);
		System.out.println(gmailInbox.passWord);


		//Step 1 - Navigate to Gmail
		gmailInbox.NavigateTogmailWebsite(gmailInbox.URL);

		//Step 2 - Login tO Gmail
		gmailInbox.login(gmailInbox.userName, gmailInbox.passWord);

		//Step 3 - Testing Inbox
		System.out.println("I am testing Gmail Drafts");


	}

}
