package Javapolymorphism;

public class CarsPolyMorphism {
	
	public String carMake;
	public int carPrice;
	
	public CarsPolyMorphism(String carMake, int carPrice) {
		this.carMake = carMake;
		this.carPrice = carPrice;
	}
	
	public void getCarMake() {
		System.out.println("Car make is " + carMake);
	}
	//@Overloading  - With method overloading, multiple methods can have the same name with different parameters or return type:
	public void getCarMake(String abcd) {
		System.out.println("Car make is " + carMake);
	}
	//@Overloading
	public void getCarMake(String abcd, String test) {
		System.out.println("Car make is " + carMake);
	}
	//@Overloading
	public void getCarMake(int price) {
		System.out.println("Car price is " + carPrice);
	}
	
	public void getCarPrice() {
		System.out.println("CarPolymorphism Car price is " + carPrice);
	}

}


