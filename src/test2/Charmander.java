package test2;

public class Charmander extends Pokemon{

	//instance data goes here
	
	public Charmander(String name) {
		super("Charmander");
	}
	
	public Charmeleon evolve() {
		Charmeleon result = new Charmeleon(this.getName());
		result.setCP(this.getCP());
		return result;
		
	}
}
