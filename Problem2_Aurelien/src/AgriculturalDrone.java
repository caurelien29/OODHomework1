/**
 * Concrete Drone class tailored for agricultural operations.
 *
 * @author Cooper Aurelien
 */
public class AgriculturalDrone implements Drone {
    private int battery;
    private int range;
    private String feature;

    /**
     * Constructs an AgriculturalDrone with specified attributes.
     *
     * @param battery battery capacity in mAh
     * @param range flight range in km
     * @param feature special feature capability
     */
    public AgriculturalDrone(int battery, int range, String feature) {
        this.battery = battery;
        this.range = range;
        this.feature = feature;
    }

    @Override
    public String getSpecifications() {
        return "Agricultural Drone - Battery: " + battery + " mAh, Range: " + range + " km, Special Feature: " + feature;
    }
}