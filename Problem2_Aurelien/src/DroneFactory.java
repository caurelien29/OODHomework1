
/**
 * Centrally creates drones based on manufacturer and type.
 *
 * @author Cooper Aurelien
 */
public class DroneFactory {

    /**
     * Creates the requested drone.
     *
     * @param manufacturer the selected manufacturer factory
     * @param type the requested drone type
     * @return the drone, or null if the selection is invalid
     */
    public Drone createDrone(DroneManufacturer manufacturer, String type) {

        if (manufacturer == null || type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("surveillance")) {
            return manufacturer.createSurveillanceDrone();
        }

        if (type.equalsIgnoreCase("delivery")) {
            return manufacturer.createDeliveryDrone();
        }

        if (type.equalsIgnoreCase("agricultural")) {
            return manufacturer.createAgriculturalDrone();
        }

        return null;
    }
}
