
/**
 * Represents the company's wedding planner.
 * Only one planner instance is created.
 *
 * @author Cooper Aurelien
 */
public class WeddingPlanner {
    //static means you can call the method using the class name without creating a WeddingFactory object.
    private static WeddingPlanner instance = new WeddingPlanner();

    /**
     * Private constructor prevents direct object creation.
     * The private constructor prevents other classes from directly
     * constructing their own WeddingPlanner.
     */
    private WeddingPlanner() {
    }

    /**
     * Gets the single wedding planner instance.
     *- static means you call getInstance() on the class itself.
     * @return the wedding planner
     */
    public static WeddingPlanner getInstance() {
        return instance;
    }

    /**
     * Plans a wedding using the WeddingPackage interface.
     *
     * @param wedding the wedding package to plan
     */
    public void planWedding(WeddingPackage wedding) {

        if (wedding == null) {
            System.out.println("Wedding package not found.");
            return;
        }

        System.out.println("Wedding planning started!");
        wedding.displayDetails();
        System.out.println("Wedding planning completed!");
    }
}
