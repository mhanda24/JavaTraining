package Javapolymorphism;

public class TestPolyMorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarsPolyMorphism c = new CarsPolyMorphism("Honda",100);
				
		Tesla t = new Tesla("Tesla", 10000, "X");
		
		Honda h = new Honda("Honda",5000,"CRV");
		
		t.getCarPrice();
		System.out.println("---------------------1");
		c.getCarPrice();
		System.out.println("---------------------2");
		h.getCarPrice();
		System.out.println("---------------------3");
		CarsPolyMorphism ct = new Tesla("Tesla", 20000, "Y");
		ct.getCarPrice();
		
	}

}
