package JavaInheritance;

public class testCarsInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tesla t = new Tesla("TeslaMake", 10000, "YModel");
		
		t.getCarMake();
		t.getCarModel();
		t.getCarPrice();
		
		Cars c = new Cars("Audi", 5000);
		c.getCarMake();
		c.getCarPrice();
		
		

	}

}
