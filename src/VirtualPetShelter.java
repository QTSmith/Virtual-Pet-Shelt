import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	Map<String, Virtualpet> shelterPets = new HashMap<String,  Virtualpet>();

	public Collection<Virtualpet> pets() { 
		return shelterPets.values();
	}
	 public void feedPets() {
		 Virtualpet.feed();
		 
	 }
	
	
	
	
	
	
	
	
//	
//	Virtualpet baby = new Virtualpet("Baby", "Kitten", 20, 20, 10);
//	Virtualpet sugar = new Virtualpet("Sugar", "dog", 10, 30, 20);
//	Virtualpet molly = new Virtualpet("Molly", "Shih-Tzu", 20, 20, 10);
//	Virtualpet honey = new Virtualpet("Honey", "Gerbil", 20, 20, 10);
//	
//	
//	shelterPets.put("Baby" , baby);
//	shelterPets.put("Sugar" , sugar);
//	shelterPets.put("Molly" , molly);
//	shelterPets.put("Honey" , honey);
//	

	
	
//	void tick() {
//		hunger = hunger + r.nextInt(10);
//		thirst = thirst + r.nextInt(10);
//		boredom = boredom + r.nextInt(10);
//	}
//
//	
//
//void feedPet() { 
//	hunger= hunger-30;
}



	
	
