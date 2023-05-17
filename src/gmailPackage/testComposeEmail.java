package gmailPackage;

public class testComposeEmail {

	public static void main(String[] args) {
		//Test Gmail inbox
		GmailApp gmailCompose = new GmailApp();

		gmailCompose.URL = "https://gmail.com"; // String url = "https://gmail.com";
		gmailCompose.userName = "test"; // String userName = "test"
		gmailCompose.passWord = "test123"; // String passWord = "test123";

		System.out.println(gmailCompose.URL);
		System.out.println(gmailCompose.userName);
		System.out.println(gmailCompose.passWord);


		//Step 1 - Navigate to Gmail
		gmailCompose.NavigateTogmailWebsite(gmailCompose.URL);

		//Step 2 - Login tO Gmail
		gmailCompose.login(gmailCompose.userName, gmailCompose.passWord);

		//Step 3 - Testing Inbox
		System.out.println("I am testing Gmail Send Email");


	}

}
