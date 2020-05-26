package test2;

public class Battle {

	private Pokemon poke1;
	private Pokemon poke2;
	private boolean isPoke1sTurn;
	
	public Battle(Pokemon first, Pokemon second) {
		poke1 = first;
		poke2 = second;
		isPoke1sTurn=true;
	}
	
	public void takeTurn() {
		if(isPoke1sTurn) {
			poke2.setCurrentHP(-1*poke1.getCP());
		}
		else {
			poke1.setCurrentHP(-1*poke2.getCP());
		}
		isPoke1sTurn = !isPoke1sTurn;
		poke1.printInfo();
		System.out.println("***********************");
		poke2.printInfo();
		if(poke1.getCurrentHP()==0) {
			System.out.println(poke1.getName() + " has fainted.");
		}
		if(poke2.getCurrentHP()==0) {
			System.out.println(poke2.getName() + " has fainted.");
		}
	}
	
	public void completeBattle() {
		while(poke1.getCurrentHP()>0 && poke2.getCurrentHP()>0) {
			takeTurn();
		}
	}
}
