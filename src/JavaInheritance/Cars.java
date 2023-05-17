package JavaInheritance;

public class Cars {
	
	private String carMake;
	private int carPrice;
	
	public Cars(String carMake, int carPrice) {
		this.carMake = carMake;
		this.carPrice = carPrice;
	}
	
	public void getCarMake() {
		System.out.println("Car make is " + carMake);
	}
	public void getCarPrice() {
		System.out.println("Car price is " + carPrice);
	}

}

/*
	Create Animal Class As Parent - 3 variables 
	Create 2 child classes - Dogs, Cats
	Create variables and methods in Animal
	Create different methods and variables in child classes
	create object of each class and call functions
	Create construtors too 
	
	Extra Challenge - create 2 constructor in parent. 1 with 2 variables, 1 with 3 variables
*/
