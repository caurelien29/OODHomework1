/**
 * Test class demonstrating Singleton, Factory, and Builder design patterns for Problem 1.
 *
 * @author Cooper Aurelien
 */
public class WeddingTest {

    /**
     * Application entry point for Problem 1.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Problem 1: Wedding Planning System ---");

        // 1. Singleton pattern test
        WeddingPlanner planner1 = WeddingPlanner.getInstance();
        WeddingPlanner planner2 = WeddingPlanner.getInstance();
        System.out.println("Are both planner instances identical? " + (planner1 == planner2));

        // 2. Factory pattern test
        WeddingFactory factory = new WeddingFactory();
        WeddingPackage luxury = factory.WeddingPackage("Luxury");
        System.out.println("Factory Created: " + luxury.getDetails());

        // 3. Builder pattern test
        WeddingPackageBuilder builder = new WeddingPackageBuilder();
        WeddingPackage customPackage = builder.setVenue(new Venue("Mountain Peak"))
                .setCatering(new Catering("BBQ Feast"))
                .setDecorations(new Decorations("Rustic Wooden"))
                .setPhotography(new Photography("Drone Photography"))
                .build();
        System.out.println("Custom Built: " + customPackage.getDetails());
    }
}