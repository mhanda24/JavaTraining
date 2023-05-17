package Javapolymorphism;

public class Honda extends CarsPolyMorphism{

private String carModel;
	
	public Honda(String carMake, int carPrice, String carModel) {
		super(carMake, carPrice); // CarsPolyMorphism constructor will be called
		this.carModel = carModel;
	}
	
	
}
