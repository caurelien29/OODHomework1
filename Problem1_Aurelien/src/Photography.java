/**
 * Represents the Photography package for a wedding.
 *
 * @author Cooper Aurelien
 */
public class Photography {
    private String level;

    /**
     * Constructs a Photography object with a specific coverage level.
     *
     * @param level the coverage level (e.g., Premium, Basic)
     */
    public Photography(String level) {
        this.level = level;
    }

    /**
     * Gets the coverage level of photography.
     *
     * @return photography level
     */
    public String getLevel() {
        return level;
    }
}