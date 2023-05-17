package JavaInheritance;

public class Tesla extends Cars{

	private String carModel;
	
	public Tesla(String carMake, int carPrice, String carModel) {
		super(carMake, carPrice); // Cars constructor will be called
		this.carModel = carModel;
	}
	
	public void getCarModel() {
		System.out.println("Car model name is " + carModel);
	}
	

}
