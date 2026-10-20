
/**
 * Creates drones made by Manufacturer B.
 *
 * @author Cooper Aurelien
 */
public class ManufacturerB implements DroneManufacturer {

    /**
     * Gets the manufacturer name.
     *
     * @return Manufacturer B
     */
    public String getManufacturerName() {
        return "Manufacturer B";
    }

    /**
     * Creates a surveillance drone.
     *
     * @return a Manufacturer B surveillance drone
     */
    public Drone createSurveillanceDrone() {
        return new SurveillanceDrone(getManufacturerName(), 5500, 60, "Night vision camera");
    }

    /**
     * Creates a delivery drone.
     *
     * @return a Manufacturer B delivery drone
     */
    public Drone createDeliveryDrone() {
        return new DeliveryDrone(getManufacturerName(), 5000, 40, "High payload capacity");
    }

    /**
     * Creates an agricultural drone.
     *
     * @return a Manufacturer B agricultural drone
     */
    public Drone createAgriculturalDrone() {
        return new AgriculturalDrone(getManufacturerName(), 6000, 45, "Automated field mapping");
    }
}
