/**
 * Concrete Drone class tailored for aerial surveillance tasks.
 *
 * @author Cooper Aurelien
 */
public class SurveillanceDrone implements Drone {
    private int battery;
    private int range;
    private String feature;

    /**
     * Constructs a SurveillanceDrone with specified attributes.
     *
     * @param battery battery capacity in mAh
     * @param range flight range in km
     * @param feature special feature capability
     */
    public SurveillanceDrone(int battery, int range, String feature) {
        this.battery = battery;
        this.range = range;
        this.feature = feature;
    }

    @Override
    public String getSpecifications() {
        return "Surveillance Drone - Battery: " + battery + " mAh, Range: " + range + " km, Special Feature: " + feature;
    }
}