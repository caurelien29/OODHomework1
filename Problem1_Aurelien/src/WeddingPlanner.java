/**
 * Singleton class coordinating overall wedding planning activities.
 *
 * @author Cooper Aurelien
 */
public class WeddingPlanner {
    private static WeddingPlanner instance;

    /**
     * Private constructor to restrict instantiation from outer classes.
     */
    private WeddingPlanner() {}

    /**
     * Provides access to the single global instance of WeddingPlanner.
     *
     * @return the unique WeddingPlanner instance
     */
    public static WeddingPlanner getInstance() {
        if (instance == null) {
            instance = new WeddingPlanner();
        }
        return instance;
    }
}