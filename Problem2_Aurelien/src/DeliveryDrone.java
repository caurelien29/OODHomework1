/**
 * Concrete Drone class tailored for logistics delivery tasks.
 *
 * @author Cooper Aurelien
 */
public class DeliveryDrone implements Drone {
    private int battery;
    private int range;
    private String feature;

    /**
     * Constructs a DeliveryDrone with specified attributes.
     *
     * @param battery battery capacity in mAh
     * @param range flight range in km
     * @param feature special feature capability
     */
    public DeliveryDrone(int battery, int range, String feature) {
        this.battery = battery;
        this.range = range;
        this.feature = feature;
    }

    @Override
    public String getSpecifications() {
        return "Delivery Drone - Battery: " + battery + " mAh, Range: " + range + " km, Special Feature: " + feature;
    }
}