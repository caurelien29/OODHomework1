
/**
 * Represents an agricultural drone.
 *
 * @author Cooper Aurelien
 */
public class AgriculturalDrone implements Drone {

    private String manufacturer;
    private int batteryCapacity;
    private int flightRange;
    private String specialFeature;

    /**
     * Creates an agricultural drone.
     *
     * @param manufacturer the manufacturer name
     * @param batteryCapacity the battery capacity in mAh
     * @param flightRange the flight range in kilometers
     * @param specialFeature the special feature
     */
    public AgriculturalDrone(String manufacturer, int batteryCapacity, int flightRange, String specialFeature) {
        this.manufacturer = manufacturer;
        this.batteryCapacity = batteryCapacity;
        this.flightRange = flightRange;
        this.specialFeature = specialFeature;
    }

    /**
     * Gets the drone type.
     *
     * @return Agricultural Drone
     */
    public String getDroneType() {
        return "Agricultural Drone";
    }

    /**
     * Gets the manufacturer.
     *
     * @return the manufacturer name
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Gets the battery capacity.
     *
     * @return battery capacity in mAh
     */
    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    /**
     * Gets the flight range.
     *
     * @return flight range in kilometers
     */
    public int getFlightRange() {
        return flightRange;
    }

    /**
     * Gets the special feature.
     *
     * @return the special feature
     */
    public String getSpecialFeature() {
        return specialFeature;
    }

    /**
     * Displays the drone details.
     */
    public void displayDetails() {
        System.out.println("Drone Type: " + getDroneType());
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Flight Range: " + flightRange + " km");
        System.out.println("Special Feature: " + specialFeature);
    }
}
