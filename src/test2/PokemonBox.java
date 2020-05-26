package test2;

import java.util.ArrayList;


public class PokemonBox {

	private ArrayList<Pokemon> listOfPokemon;
	
	public PokemonBox() {
		listOfPokemon = new ArrayList<Pokemon>();
		
	}
	
	public Pokemon getPokemonFromList(int index) {
		return listOfPokemon.get(index);
	}
	
	public void addPokemon(Pokemon pokeToAdd) {
		if(listOfPokemon.size() < 6) {
			listOfPokemon.add(pokeToAdd);
		}
	}
	public void printInfo(int index) {
		if(index>=listOfPokemon.size()) {
			System.out.println("You don't have that many Pokemon");
		}
		else {
			System.out.println(listOfPokemon.get(index).getName());
			System.out.println(listOfPokemon.get(index).getHP_Status());
			System.out.println(listOfPokemon.get(index).getCPlabel());
		}
	}
}
