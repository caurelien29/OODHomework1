
/**
 * Defines the drone creation methods for each manufacturer.
 *
 * @author Cooper Aurelien
 */
public interface DroneManufacturer {

    /**
     * Gets the manufacturer name.
     *
     * @return the manufacturer name
     */
    String getManufacturerName();

    /**
     * Creates a surveillance drone.
     *
     * @return a surveillance drone
     */
    Drone createSurveillanceDrone();

    /**
     * Creates a delivery drone.
     *
     * @return a delivery drone
     */
    Drone createDeliveryDrone();

    /**
     * Creates an agricultural drone.
     *
     * @return an agricultural drone
     */
    Drone createAgriculturalDrone();
}
