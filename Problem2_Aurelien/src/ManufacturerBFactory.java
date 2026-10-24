/**
 * Concrete factory implementing DroneFactory for Manufacturer B (Prioritizes Battery).
 *
 * @author Cooper Aurelien
 */
public class ManufacturerBFactory implements DroneFactory {
    @Override
    public Drone createSurveillanceDrone() {
        return new SurveillanceDrone(5500, 35, "Night vision camera");
    }

    @Override
    public Drone createDeliveryDrone() {
        return new DeliveryDrone(5000, 40, "High payload capacity");
    }

    @Override
    public Drone createAgriculturalDrone() {
        return new AgriculturalDrone(6000, 30, "Heavy-duty irrigation");
    }
}