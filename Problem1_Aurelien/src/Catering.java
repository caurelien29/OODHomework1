/**
 * Represents the Catering service for a wedding package.
 *
 * @author Cooper Aurelien
 */
public class Catering {
    private String type;

    /**
     * Constructs a Catering object with the given catering type.
     *
     * @param type the type of catering
     */
    public Catering(String type) {
        this.type = type;
    }

    /**
     * Gets the catering type.
     *
     * @return catering type string
     */
    public String getType() {
        return type;
    }
}