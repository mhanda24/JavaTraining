package employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Employee emp1 = new Employee();
		
		Employee emp1 = new Employee(10001,250000,"Manpreet","Singh");
		
	/*	emp1.empId = 10001;
		emp1.empSalary = 250000;
		emp1.empName = "Manpreet";*/
	/*	
		emp1.setEmplId(10001);
		emp1.setEmpSalary(250000);
		emp1.setEmpName("Manpreet");*/
		emp1.getEmplId();
		emp1.getEmpSalary();
		emp1.getEmpFName();
		emp1.getEmpMName();
		
		System.out.println("--------------------------------------------------------------------");
		
	//	Employee emp2 = new Employee();
		Employee emp2 = new Employee(10002,500000,"Monica");
		
		/*emp2.empId = 10002;
		emp2.empSalary = 500000;
		emp2.empName = "Monica";*/
		
		/*emp2.setEmplId(10002);
		emp2.setEmpSalary(500000);
		emp2.setEmpName("Monica");*/
		emp2.getEmplId();
		emp2.getEmpSalary();
		emp2.getEmpFName();
		
		System.out.println("--------------------------------------------------------------------");
	//	Employee emp3 = new Employee();
		Employee emp3 = new Employee(10003,800000,"Richa");
				
		/*emp3.empId = 10003;
		emp3.empSalary = 800000;
		emp3.empName = "Richa";*/
		
	/*	emp3.setEmplId(10003);
		emp3.setEmpSalary(800000);
		emp3.setEmpName("Richa");*/
		emp3.getEmplId();
		emp3.getEmpSalary();
		emp3.getEmpFName();

	}

}
