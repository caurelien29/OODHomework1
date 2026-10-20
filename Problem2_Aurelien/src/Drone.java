
/**
 * Defines the methods required for every drone.
 *
 * @author Cooper Aurelien
 */
public interface Drone {

    /**
     * Gets the drone type.
     *
     * @return the drone type
     */
    String getDroneType();

    /**
     * Gets the manufacturer name.
     *
     * @return the manufacturer name
     */
    String getManufacturer();

    /**
     * Gets the battery capacity.
     *
     * @return the battery capacity in mAh
     */
    int getBatteryCapacity();

    /**
     * Gets the flight range.
     *
     * @return the flight range in kilometers
     */
    int getFlightRange();

    /**
     * Gets the special feature.
     *
     * @return the special feature
     */
    String getSpecialFeature();

    /**
     * Displays the drone information.
     */
    void displayDetails();
}
