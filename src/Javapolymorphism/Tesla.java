package Javapolymorphism;

public class Tesla extends CarsPolyMorphism{

	private String carModel;
	
	public Tesla(String carMake, int carPrice, String carModel) {
		super(carMake, carPrice); // CarsPolyMorphism constructor will be called
		this.carModel = carModel;
	}
	
	@Override
	public void getCarMake(String abcd) {
		System.out.println("Test class - Car make is " + carMake);
	}
	
	@Override
	public void getCarPrice(){
		int cPrice = carPrice - 1000;
		System.out.println("Tesla car price is " + cPrice);
	}

	
	public void getCarModel() {
		System.out.println("Car model name is " + carModel);
	}
	

}
