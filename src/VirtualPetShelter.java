import java.util.Map;
import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {
	
	Map<String, Virtualpet> mapShelterPets = new HashMap<String,  Virtualpet>();

	public Collection<Virtualpet> pets() {
		return mapShelterPets.values();
	}

	public Virtualpet getPet(String name) {
		return mapShelterPets.get(name);
	}

	public void intake(Virtualpet pet) {
		mapShelterPets.put(pet.name, pet);
	}

	public void adopt(String name) {
		mapShelterPets.remove(name);
	}

	public void feedPets() {
		for (Virtualpet currentPet : mapShelterPets.values()) {
			currentPet.feed();
		}
	}

	public void waterPets() {
		for (Virtualpet currentPet : mapShelterPets.values()) {
			currentPet.water();
		}
	}

	public void entertain(Virtualpet p) {
		p.entertain();
	}

	public void tick() {
		for (Virtualpet currentPet : mapShelterPets.values()) {
			currentPet.tick();
		}
	}

	@Override
	public String toString() {
		return ("" + mapShelterPets.keySet() + mapShelterPets.values());
	}

		
	}


		
	
}
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	






	
	
