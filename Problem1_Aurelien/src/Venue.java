/**
 * Represents the Venue component of a wedding package.
 *
 * @author Cooper Aurelien
 */
public class Venue {
    private String name;

    /**
     * Constructs a Venue with the specified name.
     *
     * @param name the name of the venue
     */
    public Venue(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the venue.
     *
     * @return venue name
     */
    public String getName() {
        return name;
    }
}