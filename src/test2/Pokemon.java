package test2;

public class Pokemon {

	private String name;
	private int maxHP;
	private int currentHP;
	private int CP;
	
	public Pokemon(String nameInput) {
		name=nameInput;
		maxHP=100;
		currentHP=100;
		CP=(int)(Math.random()*10)+1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMaxHP() {
		return maxHP;
	}
	
	public int getCurrentHP() {
		return currentHP;
	}
	
	public void setCP(int CPinput) {
		CP=CPinput;
	}
	
	public void setMaxHP(int newValue) {
		maxHP = newValue;
	}
	
	public String getHP_Status() {
		return currentHP + "/" + maxHP;
	}
	
	public int getCP() {
		return CP;
	}
	
	public String getCPlabel() {
		return CP + " CP";
	}
	
	//If the pokemon takes damage, change should be negative
	//If the pokemon is healed, change should be positive
	public void setCurrentHP(int change) {
		currentHP+=change;
		if(currentHP>maxHP) {
			currentHP=maxHP;
		}
		if(currentHP<0) {
			currentHP=0;
		}
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(getHP_Status());
		
	}
	
	public void setName(String nameInput) {
		name = nameInput;
	}
}
