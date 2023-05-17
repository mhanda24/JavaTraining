package JavaInheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Childone child = new Childone();
	//	System.out.println(child.ParentsName);
		child.getParentsName();
		System.out.println("----------------");
	/*	Parent parent = new Parent();
		System.out.println(parent.parentsName);
		parent.getParentsName();*/
		
		ChildTwo child2 = new ChildTwo();
		child2.getParentsName();
		
		int speed = 100;
		
		int brake = 10;
		
		int finalSpeed = speed - brake;
		System.out.println(finalSpeed);
		finalSpeed -=  brake;
		System.out.println(finalSpeed);
	}

}
