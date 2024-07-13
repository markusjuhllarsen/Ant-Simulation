/*
 * Class to represent places where ants move through.
 * Each node contains a non-negative amount of sugar.
 */
public class Node {

    private int sugar = 0; // The amount of sugar in this node

    // Creates a node with no sugar.
    public Node() {
    }

    // Creates a node with a given amount of sugar.
    public Node(int sugar) {
	    this.sugar = sugar;
    }

    // Returns the amount of sugar in this node.
    public int sugar() {
	    return sugar;
    }

    // Deecrese the amount of sugar in this node by 1.
    public void decreaseSugar() {
	    thus.sugar -= 1;
    }

    // Set the amount of sugar in this node to a given value.
    public void setSugar(int sugar) {
	    this.sugar = sugar;
    }
}
