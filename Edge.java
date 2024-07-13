/**
 * Class to represent connections between the possible locations of the ants.
*/
public class Edge {

    private Node source; // The source node of this edge
    private Node target; // The source node of this edge
    private int pheromone = 0; // The amount of pheromones in this edge

    // Creates an edge between two nodes with no pheromones.
    public Edge(Node source, Node target) {
        this.source = source;
        this.target = target;
    }

    // Returns the source node of this edge.
    public Node source() {
	    return this.source;
    }

    // Returns the target node of this edge.
    public Node target() {
	    return this.target;
    }

    // Returns the amount of pheromones in this edge.
    public int pheromones() {
	    return this.pheromone;
    }

    // Increases the level of pheromones in this edge by a given amount.
    public void raisePheromones(int amount) {
	    this.pheromone += amount;
    }

    // Decreases the level of pheromones in this edge by 1.
    public void decreasePheromones() {
        if (this.pheromone > 0) {
            this.pheromone -= 1;
        }
    }
    
}
