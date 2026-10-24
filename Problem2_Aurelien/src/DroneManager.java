/**
 * Manager class delegating creation tasks to abstract factory instances.
 *
 * @author Cooper Aurelien
 */
public class DroneManager {
    /**
     * Creates a drone using the provided factory based on requested string type.
     *
     * @param type requested drone type
     * @param factory concrete factory supplier
     * @return created Drone instance
     */
    public Drone createDrone(String type, DroneFactory factory) {
        if ("surveillance".equalsIgnoreCase(type)) {
            return factory.createSurveillanceDrone();
        } else if ("delivery".equalsIgnoreCase(type)) {
            return factory.createDeliveryDrone();
        } else if ("agricultural".equalsIgnoreCase(type)) {
            return factory.createAgriculturalDrone();
        }
        throw new IllegalArgumentException("Unknown drone type requested: " + type);
    }
}