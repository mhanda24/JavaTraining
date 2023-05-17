package employee;

public class Employee {
	
	private int empId;
	private int empSalary;
	private String empFName;
	private String empMiddleName;
	private String empLName;
	private String designation;
	
	//Constructors - This helps to initialize the values. These are just the methods without return type - will always be same name as Class name
	public Employee(int empId, int empSalary , String empFName, String empLName) {
		this.empId = empId;
		this.empSalary = empSalary;
		this.empFName = empFName;
		this.empLName = empLName;
		
	}
	
	public Employee(int empId, int empSalary , String empFName) {
		this.empId = empId;
		this.empSalary = empSalary;
		this.empFName = empFName;
		}
	
	public Employee(int empId, int empSalary , String empFName, String empMiddleName, String empLName) {
		this.empId = empId;
		this.empSalary = empSalary;
		this.empFName = empFName;
		this.empMiddleName = empMiddleName;
		this.empLName = empLName;
	}
	
	public void setEmplId(int empId) {
		
		this.empId = empId;
	}
	
	
	
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	public void setEmpName(String empName) {
		this.empFName = empName;
	}
	
	
	public void getEmplId() {
		System.out.println("Employee id is " + empId);
	}
	
	public void getEmpSalary() {
		System.out.println("Employee Salary is " + empSalary);
	}
	
	public void getEmpFName() {
		System.out.println("Employee Name is " + empFName);
	}
	
	public void getEmpMName() {
		System.out.println("Employee Name is " + empMiddleName);
	}
	

}
/* Cars Class - Using private access modifiers - with constructors and Without consurtuctors
 * CarType
 * CarMake
 * CarModel
 * CarPrice
 */
