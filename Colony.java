/*
 * Class to represent places where ants have homes.
 * Each colony is also a node.
 */
public class Colony extends Node{

	// Stored sugar in colony
	private int consumptionStock;
	
	// Creates colony with no stored sugar and no transportable sugar
	public Colony(){
		// Calling the constructor without arguments from the superclass Node
		super();
		consumptionStock = 0;
	}
	
	// Checks whether colony has stored sugar
	public boolean hasStock(){
		return consumptionStock > 0;
	}
	
	// Simulates ant eating sugar
	// Precondition: there is sugar in this colony's stock
	public void consume(){
		consumptionStock -= 1;
	}
	
	// Adding carried sugar to stored sugar
	public void topUp(int carriedSugar){
		consumptionStock += carriedSugar;
	}
}