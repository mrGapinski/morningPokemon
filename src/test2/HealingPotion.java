package test2;

public class HealingPotion {

	private int healthPoints;
	private boolean hasBeenUsed;
	
	public HealingPotion(int howManyPoints) {
		healthPoints = howManyPoints;
		hasBeenUsed = false;
	}
	
	public int getHealthPoints() {
		return healthPoints;
	}
	
	public void setHealthPoints(int howManyPoints) {
		healthPoints = howManyPoints;
	}
	
	public void changeHealthPoints(int changeInPoints) {
		healthPoints += changeInPoints;
	}
	
	public void use(Pokemon target) {
		if(hasBeenUsed) {
			System.out.println("This potion has already been used");
			return;
		}
		else {
			target.setCurrentHP(healthPoints);
			hasBeenUsed = true;
			target.printInfo();
		}
	}
}
