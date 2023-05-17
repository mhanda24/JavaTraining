package basicJava;

public class testforSumOfNumbers {

	public static void main(String[] args) {

		//I want to take starting and ending value from different users;
		System.out.println(sumOfTwoNumbers(1,250));
		System.out.println(sumOfTwoNumbers(2,450));
		System.out.println(sumOfTwoNumbers(3,550));
	}

	
	
	public static int sumOfTwoNumbers(int startNumber, int endNumber) {
		int sum=0;
	
		for(int i=startNumber; i<=endNumber; i++)
		{
			sum=sum+i;
		}
		return sum;


	}

}
