
/**
 * Creates drones made by Manufacturer A.
 *
 * @author Cooper Aurelien
 */
public class ManufacturerA implements DroneManufacturer {

    /**
     * Gets the manufacturer name.
     *
     * @return Manufacturer A
     */
    public String getManufacturerName() {
        return "Manufacturer A";
    }

    /**
     * Creates a surveillance drone.
     *
     * @return a Manufacturer A surveillance drone
     */
    public Drone createSurveillanceDrone() {
        return new SurveillanceDrone(getManufacturerName(), 4000, 50, "High-quality camera");
    }

    /**
     * Creates a delivery drone.
     *
     * @return a Manufacturer A delivery drone
     */
    public Drone createDeliveryDrone() {
        return new DeliveryDrone(getManufacturerName(), 4500, 35, "GPS delivery system");
    }

    /**
     * Creates an agricultural drone.
     *
     * @return a Manufacturer A agricultural drone
     */
    public Drone createAgriculturalDrone() {
        return new AgriculturalDrone(getManufacturerName(), 5000, 30, "Precision crop spraying");
    }
}
