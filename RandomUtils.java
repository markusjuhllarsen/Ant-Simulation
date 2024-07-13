import java.util.Random;

/**
 * Utilities for the simulation.
 */
public class RandomUtils {

    private static Random generator = new Random();

    // Returns a random integer between 0 and n-1.
    public static int randomInt(int n) {
	    return generator.nextInt(n);
    }
    
    // Returns a random natural number with Poisson distribution and expected value n.
    
    public static int randomPoisson(int n) {
	// Knuth's algorithm for Poisson distribution
        double l = Math.exp(-n);
        int k = 0;
        double p = 1;
        while (p > l) {
            k = k+1;
            double u = generator.nextDouble();
            p = p*u;
        }
        return k-1;
    }

    // Returns true with probability p.
    public static boolean coinFlip(double probability) {
	    return (generator.nextDouble() < probability);
    }
}
