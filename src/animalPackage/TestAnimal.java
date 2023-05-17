package animalPackage;

public class TestAnimal {

	public static void main(String[] args) {
		
		Cats cat = new Cats("Cat", "RagDoll", "Meaow", "brown");

		//Run Time polymorphism
		cat.getanimalType();
		cat.getanimalName();
		cat.getAnimalVoice();
		cat.getAnimalColor();


		Dogs dog = new Dogs("Dog", "Rover", "Bark");


		dog.getanimalType();
		dog.getanimalName();
		dog.getAnimalVoice();


	}

}
