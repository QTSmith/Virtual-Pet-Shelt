import java.util.ArrayList;
import java.util.Scanner;

public class virtualpetshelterApp {

	public static void main(String[] args) {
		
	VirtualPetShelter shelter = new VirtualPetShelter();
	Scanner input = new Scanner(System.in);
	
	Virtualpet szoke = new Virtualpet("Szoke", "Black and white cat", 20, 10, 30);
	Virtualpet molly = new Virtualpet("Molly", "Shih-Tzu", 30, 20, 40);
	Virtualpet beans = new Virtualpet("Beans", "Gerbil", 10, 20, 30);
	Virtualpet bricks = new Virtualpet("Bricks", "Mini Schnauzer", 40, 30, 10);
	
	shelter.intake(szoke);
	shelter.intake(molly);
	shelter.intake(beans);
	shelter.intake(bricks);
		
	
	    writeLine("******************************************");
		writeLine("      *Welcome to Q's Virtual Pet Shelter*");
		writeLine("*******************************************");
		writeLine("Thank you for volunteering to help! ");
		writeLine("You'll love all our furry friends");	 

	
	
		writeLine("Here are the current pets we have and their needs.");
		writeLine("What would you like to do?");
		
		writeLine("Name\tHunger\tthirst\tBoredom");
		writeLine("-----\t------\t------\t--------");
		for (Virtualpet current : shelter.pets()) {
			writeLine(current.name + " " + "\t  " + current.hunger + "\t  " + current.thirst + "\t  " + current.boredom);
		}

		//
		boolean start = false;
		while (!start) {
			// user options here
			writeLine("Please make a numerical selection between 1-6");
			writeLine("1 - Feed all the pets");
			writeLine("2 - Give water to all of the pets");
			writeLine("3 - Play with one pet");
			writeLine("4 - Adopt a pet");
			writeLine("5 - Admit a pet");
			writeLine("6- Quit the game");

		String options = input.next();
		switch (options) {

		case "1": 
			shelter.feedPets();
			writeLine("You fed all of the pets! Nom nom nom...");
		break;
			case "2":
				shelter.waterPets();
			writeLine("You have given water to all of the pets! Glurp slurp ahhhh..." );
				break;
			case "3"://play with a pet
				writeLine("Please enter the name of the pet you'd like to play with.");
				String userChoice = input.next();
				
				Virtualpet pettoplay = shelter.getPet(userChoice.toLowerCase());
				shelter.entertain(pettoplay);
				writeLine("You played with" + userChoice + "!");
								break;
				case "4": //adopt
					writeLine("We're so glad you want to adopt one of our pets! ");
					writeLine("Please enter the name of the pet you'd like to adopt!");
					String adoptedPet = input.next();
					
					Virtualpet petToAdopt = shelter.getPet(adoptedPet.toLowerCase());
					shelter.adopt(adoptedPet);
					writeLine("We are so glad you've decided to add" + adoptedPet + "to your family!");
			break;
		case "5" ://add a pet
			writeLine("Oh no! We have a homeless pet! There's always room here for a pet in need!");
			String newPet = input.next();
			
			Virtualpet petToIntake = shelter.getPet(newPet.toLowerCase());
			shelter.intake(newPet);
			writeLine("We'll take good care of you" + adoptedPet + "!");
			break;
		case "6": 
			writeLine("You have selected to quit!");
			writeLine("We're sad to see you go!");
			System.exit(0);
		break; 
		}}}
		

	writeLine("Name\tHunger\tthirst\tBoredom");
	writeLine("-----\t------\t------\t--------");

	for (VirtualPet current : shelter.pets()) {
		System.out.println(current.name + " " + "\t  " + current.hunger + "\t  " + current.thirst + "\t  "
				+ current.boredom);
	}

	// Tick method for all pets
	shelter.tickAllPets();

} // END WHILE



	public static void writeLine(String message) {
		System.out.println(message);
	}
}
