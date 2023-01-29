
//Create a Pet Class with the following instance variables: 
//
//name (PRIVATE) 
//age (PRIVATE) 
//location (PRIVATE) 
//type (PRIVATE) 
//two constructors(empty, all attributes)
//Code to be able to access the following (Get Methods): 
//name, age, type 
//Code to be able to change (Set Methods): 
//name, age, location  
class AboutPet {
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	public AboutPet() {
		System.out.println("Empty");
	}
	
	public AboutPet(String name, int age, String type, String location) {
		
		this.name = name;
		this.age = age;
		this.type = type;
		this.location = location;
		
		System.out.println("My pet's name is " + name);
		System.out.println("It is " + age + " years old");
		System.out.println("It is a " + type + " from " + location);
	}
}

public class Pet {

	public static void main(String[] args) {
		

		AboutPet emptyPet = new AboutPet();
		
		AboutPet myPet = new AboutPet("Coco", 15, "cat", "St. Thomas");

	}

}
