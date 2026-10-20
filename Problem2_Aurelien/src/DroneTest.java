
/**
 * Tests the Drone Management System.
 *
 * @author Cooper Aurelien
 */
public class DroneTest {

    /**
     * Runs the drone management program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Create the manufacturer factories.
        DroneManufacturer manufacturerA = new ManufacturerA();
        DroneManufacturer manufacturerB = new ManufacturerB();

        // Create the central factory.
        DroneFactory factory = new DroneFactory();

        // Create drones from Manufacturer A.
        Drone drone1 = factory.createDrone(manufacturerA, "surveillance");

        Drone drone2 = factory.createDrone(manufacturerA, "delivery");

        Drone drone3 = factory.createDrone(manufacturerA, "agricultural");

        // Create drones from Manufacturer B.
        Drone drone4 = factory.createDrone(manufacturerB, "surveillance");

        Drone drone5 = factory.createDrone(manufacturerB, "delivery");

        Drone drone6 = factory.createDrone(manufacturerB, "agricultural");

        // Display all drone details.
        displayDrone(drone1);
        displayDrone(drone2);
        displayDrone(drone3);
        displayDrone(drone4);
        displayDrone(drone5);
        displayDrone(drone6);
    }

    /**
     * Displays a drone if it was created successfully.
     *
     * @param drone the drone to display
     */
    public static void displayDrone(Drone drone) {

        if (drone == null) {
            System.out.println("Drone could not be created.");
            return;
        }

        drone.displayDetails();
        System.out.println("------------------------------");
    }
}
