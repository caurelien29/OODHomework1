/**
 * Abstract Factory interface for manufacturing drones.
 *
 * @author Cooper Aurelien
 */
public interface DroneFactory {
    /**
     * Factory method creating a SurveillanceDrone.
     *
     * @return Drone instance
     */
    Drone createSurveillanceDrone();

    /**
     * Factory method creating a DeliveryDrone.
     *
     * @return Drone instance
     */
    Drone createDeliveryDrone();

    /**
     * Factory method creating an AgriculturalDrone.
     *
     * @return Drone instance
     */
    Drone createAgriculturalDrone();
}