/**
 * Class to represent the ants.
 * Each ant knows its its current position and its previous position, as well as the location of its
 * home.
 * Furthermore, ants can be carrying a fixed amount of sugar.
 */
public class Ant {

    private Colony home;
	private Node current;
	private Node previous;
	private boolean carrying;

    // Creates an ant with a given home.
    public Ant(Colony home) {
        this.home = home;
        this.current = home;
        this.previous = home;
        this.carrying = false;
    }

    // Returns the current node of this ant.
    public Node current() {
	    return this.current;
    }

    // Returns the previous node of this ant.
    public Node previous() {
	    return this.previous;
    }

    // Returns the home of this ant.
    public Colony home() {
	    return this.home;
    }

    // Returns whether this ant is carrying sugar.
    public boolean carrying() {
	    return this.carrying;
    }

    // Returns whether this ant is at home.
    public boolean isAtHome() {
	    return (this.home == this.current);
    }

    // Returns whether this ant was at home previously.
    public boolean wasAtHome() {
	    return (this.home == this.previous);
    }

    // Moves this ant to a given location.
    // PRecondition: there should be an edge between this ant's current location and its new location.
    public void move(Node location) {
        this.previous = this.current;
        this.current = location;
    }

    // Models picking up sugar.
    // Precondition: There is sugar at the current node AND this ant is not carrying sugar.
    public void pickUpSugar() {
	    this.carrying = true;
    }

    // Models dropping sugar.
    // Precondition: This ant is at home AND this ant is carrying sugar.
    public void dropSugar() {
	    this.carrying = false;
    }
}
