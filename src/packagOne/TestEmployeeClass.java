package packagOne;

public class TestEmployeeClass {

	public static void main(String[] args) {
	
		Employee manpreet = new Employee(); //This is an object of datatype or class Employee
		manpreet.empId = "Emp001";
		manpreet.empName = "Manpreet";
				
		manpreet.printEmployeeDetails();
		
		Employee monica = new Employee(); //This is an object of datatype or class Employee
		monica.empId = "Emp002";
		monica.empName = "monica";
		
		monica.printEmployeeDetails();
		
		Employee richa = new Employee(); //This is an object of datatype or class Employee
		richa.empId = "Emp003";
		richa.empName = "richa";
		
		richa.printEmployeeDetails();
		
		System.out.println();
		
	}
/*
 * Homework Create a class Cars under package name - Cars- 
 * Fields - Car Type, Car Make, Car model
 * Methods - To read carType - print
 * Method - To read carMake - print
 * Method To read carModel - print
 * 
 * create another class with any name and with Main method
 * Create 5 different objects
 * Assign Type, Make and Model value
 * Call all functions wrote in Cars class
 */
}
