package animalPackage;

public class Animal {

	//Variables
	private String animalType;
	private String animalName;

	//Constructor
	public Animal(String animalType, String animalName) {
		this.animalType = animalType;
		this.animalName = animalName;
	}

	//Functions
	public void getanimalType() {
		System.out.println("Animal Type is - " +animalType);
	}
	
	public void getanimalName() {
		System.out.println("Animal Name is - " +animalName);
	}

}
