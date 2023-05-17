package animalPackage;

public class Cats extends Dogs{

	private String animalColor ;

	
	public Cats(String animalType, String animalName, String animalVoice,String animalColor) {

		super(animalType, animalName,animalVoice) ;
		this.animalColor = animalColor;


	}

	public void getAnimalColor() {


		System.out.println("Color of Animal is - " +animalColor);
		System.out.println("");
	}

}
