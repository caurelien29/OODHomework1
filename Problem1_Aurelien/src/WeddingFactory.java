
/**
 * Creates different types of wedding packages.
 *
 * @author Cooper Aurelien
 */
public class WeddingFactory {

    /**
     * Creates a wedding package based on its type.
     *
     * @param type the type of wedding
     * @return the wedding package, or null if not found
     */
    public WeddingPackage createWedding(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("luxury")) {
            return new LuxuryWedding();
        }

        if (type.equalsIgnoreCase("traditional")) {
            return new TraditionalWedding();
        }

        if (type.equalsIgnoreCase("destination")) {
            return new DestinationWedding();
        }

        return null;
    }
}

