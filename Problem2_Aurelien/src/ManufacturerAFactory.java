/**
 * Concrete factory implementing DroneFactory for Manufacturer A (Prioritizes Range).
 *
 * @author Cooper Aurelien
 */
public class ManufacturerAFactory implements DroneFactory {
    @Override
    public Drone createSurveillanceDrone() {
        return new SurveillanceDrone(4000, 50, "High-quality camera");
    }

    @Override
    public Drone createDeliveryDrone() {
        return new DeliveryDrone(4200, 60, "Medium payload capacity");
    }

    @Override
    public Drone createAgriculturalDrone() {
        return new AgriculturalDrone(4500, 55, "Crop spraying array");
    }
}