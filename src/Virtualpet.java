import java.util.Random;

public class Virtualpet {

	Random r = new Random();

	String name;
	String description;
	int hunger;
	int thirst;
	int boredom;

	public Virtualpet(String newName, String newDescription) {
		name = newName;
		description = newDescription;
		hunger = 50;
		thirst = 50;
		boredom = 50;
	}
	public Virtualpet(String newName, String newDescription, int newHunger, int newThirst, int newBoredom) {
		name = newName;
		description = newDescription;
		hunger = newHunger;
		thirst = newThirst;
		boredom = newBoredom;

	}

	boolean alive = (hunger < 50 && thirst < 50);
	{
	}

	void Exit() {
		System.exit(0);
	}

	void feed() {
		hunger = hunger - 10; // hunger -=10
	}

	boolean isHungry() {
		return hunger >= 50; // if hunger is greater than or equal to 60 then
								// the pet is hungry
	}

	int getHunger() {
		return hunger;
	}

	{
		hunger = hunger + 10; // hunger +5
	}

	void water() {
		thirst = thirst - 10;
	}

	boolean isDry() {
		return thirst >= 50;
	}

	int getDryness() {
		return thirst;
	}

	void entertain() {
		boredom = boredom - 10;
	}

	boolean isBored() {
		return boredom >= 50;
	}

	int getBored() {
		return boredom;
	}

	void tick() {
		hunger = hunger + r.nextInt(10);
		thirst = thirst + r.nextInt(10);
	}
	public String getName() {
		return name;
	}
	

}
