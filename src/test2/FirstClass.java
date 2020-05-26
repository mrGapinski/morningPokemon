package test2;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		PokemonBox myPokemon = new PokemonBox();
//		PokemonBox myPokemon2 = new PokemonBox();
//		Pokemon firstCatch = new Pokemon("Pikachu");
//		Pokemon secondCatch = new Pokemon("Charmander");
//		Pokemon thirdCatch = new Pokemon("Squirtle");
//		myPokemon.addPokemon(firstCatch);
//		myPokemon.addPokemon(secondCatch);
//		myPokemon2.addPokemon(thirdCatch);
//		
//		//myPokemon.printInfo(0);
//		//myPokemon2.printInfo(0);
//		Battle firstBattle = new Battle(firstCatch, secondCatch);
//		
//		Scanner scan = new Scanner(System.in);
//		String userInput = "default";
//		System.out.println("What would you like to name your Pokemon");
//		userInput = scan.nextLine();
//		firstCatch.setName(userInput);
//		firstBattle.completeBattle();
//		HealingPotion myPotion = new HealingPotion(20);
//		myPotion.use(firstCatch);
		Reshiram bob = new Reshiram("bob");
		System.out.println(bob.getCurrentHP());
		myPokemon.addPokemon(bob);

}
}
