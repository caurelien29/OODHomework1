
/**
 * Tests the Wedding Planning System.
 *
 * @author Cooper Aurelien
 */
public class WeddingTest {

    /**
     * Runs the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Factory Pattern: create a wedding package.
        WeddingFactory factory = new WeddingFactory();
        WeddingPackage wedding = factory.createWedding("luxury");

        if (wedding == null) {
            System.out.println("Wedding package not found.");
            return;
        }

        // Builder Pattern: customize the wedding package.
        WeddingPackageBuilder builder = new WeddingPackageBuilder(wedding);

        WeddingPackage customizedWedding = builder
                .setVenue("Beachfront Resort")
                .setCatering("Italian Buffet")
                .setDecorations("White Roses and Candles")
                .setPhotography("Professional Photo and Video")
                .build();

        // Singleton Pattern: get the same planner instance.
        WeddingPlanner planner = WeddingPlanner.getInstance();
        WeddingPlanner anotherPlanner = WeddingPlanner.getInstance();

        // Plan the wedding.
        planner.planWedding(customizedWedding);

        // Check that both references point to the same planner.
        System.out.println("Is there only one planner? " + (planner == anotherPlanner));
    }
}
