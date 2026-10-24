/**
 * Main application class acting as test driver for Problem 2.
 *
 * @author Cooper Aurelien
 */
public class DroneTest {
    /**
     * Application entry point for Problem 2.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--- Problem 2: Drone Management System ---");
        DroneManager manager = new DroneManager();

        DroneFactory factoryA = new ManufacturerAFactory();
        DroneFactory factoryB = new ManufacturerBFactory();

        Drone drone1 = manager.createDrone("surveillance", factoryA);
        Drone drone2 = manager.createDrone("delivery", factoryB);

        System.out.println("Manufacturer A - " + drone1.getSpecifications());
        System.out.println("Manufacturer B - " + drone2.getSpecifications());
    }
}