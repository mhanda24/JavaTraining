package packageTwo;

public class JavaEncapsulation {
	
	//Hide the data members - encapsulation
	int dnum1 =75;
	int dnum2 = 5;
	
	int res=0;
	String a = null;
	
	 public void variableInitialization() {
			System.out.println(res);
			System.out.println(a);
		
	 }


	
	//Method overloading
	 public void quotient() {
		
			 res = dnum1/dnum2;
			 System.out.println("Division of "+dnum1+" "+"and "+dnum2+" is : "+res);
			 a = "Hello world";
			 System.out.println(a);
		 }


	 public void quotient(int n1,int n2,int n3) {
		
		 n3 = n1/n2;
		 System.out.println("Division of "+n1+" "+"and "+n2+" is : "+n3);
	 }

}
/*
 * Create a calculator class - sum, div, mulptipcation, subtraction functions. 
 * 2 variables - nmber 1 and number 2 - Test for various access modifiers. - Private, dfeault, public and Protected
 * Create atleast 1 class in 1 package and 1 more class in another package and access methods and variables
 * craeet object of calculator class and apply all methods.
 */
