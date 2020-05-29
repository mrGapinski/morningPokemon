package test2;

public class GapDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Charmander firstCatch = new Charmander("bill");
Solgaleo secondCatch = new Solgaleo("rick");
PokemonBox myPokes = new PokemonBox();
Reshiram thirdCatch = new Reshiram("charlie");
myPokes.addPokemon(firstCatch);
myPokes.addPokemon(secondCatch);
myPokes.addPokemon(thirdCatch);
for(int i=0;i<myPokes.size();i++) {
	myPokes.getPokemonFromList(i).evolve();
}
	}

}
