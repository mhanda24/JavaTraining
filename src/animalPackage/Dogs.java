package animalPackage;

public class Dogs extends Animal{

	private String animalvoice;


	public Dogs(String animalType, String animalName, String animalVoice) {

		super(animalType, animalName);
		this.animalvoice = animalVoice;
	}

	public void getAnimalVoice() {

		System.out.println("Voice of animal is - " +animalvoice);


	}


}
