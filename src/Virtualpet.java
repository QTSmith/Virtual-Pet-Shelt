import java.util.Random;
public class Virtualpet {

	Random r = new Random();
	
	int hunger = 10;//hunger is an instance variable
	int drysoil = 10;
	int boredom = 10;
	int sickness = 10;
	
	boolean alive = (hunger < 50 && drysoil < 50); { 
	}
	

void Exit () { 
	System.exit(0);
	}
	
	void feed() {
		hunger = hunger - 10; //hunger -=10
	}
	boolean isHungry() {
	return hunger >= 50; //if hunger is greater than or equal to 60 then the pet is hungry
	}
	
	int getHunger() { 
	return hunger;
	}
	
	 {
	hunger = hunger + 10; //hunger +5
	}
	void water() {
		drysoil = drysoil - 10; //hunger -=10
	}
	boolean isDry() {
	return drysoil >= 50; //if hunger is greater than or equal to 60 then the pet is hungry
	}
	
	int getDryness() { 
	return drysoil;
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
	void spray() {
		sickness = sickness - 10; //hunger -=10
	}
	boolean isSick() {
	return sickness >= 50; //if hunger is greater than or equal to 60 then the pet is hungry
	}
	
	int getSickness() { 
	return sickness;
	}
	
	 {
	sickness = sickness + 10; //hunger +5
	}
	void tick () {
	hunger = hunger+r.nextInt(10);
	drysoil =drysoil+r.nextInt(10);
	}
	
	}


