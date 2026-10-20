
/**
 * Represents a destination wedding package.
 *
 * @author Cooper Aurelien
 */
public class DestinationWedding implements WeddingPackage {

    private String venue;
    private String catering;
    private String decorations;
    private String photography;

    /**
     * Creates a destination wedding with default options.
     */
    public DestinationWedding() {
        venue = "Beach Resort";
        catering = "Destination Catering";
        decorations = "Tropical Decorations";
        photography = "Destination Photographer";
    }

    /**
     * Gets the wedding venue.
     *
     * @return the venue
     */
    public String getVenue() {
        return venue;
    }

    /**
     * Sets the wedding venue.
     *
     * @param venue the new venue
     */
    public void setVenue(String venue) {
        this.venue = venue;
    }

    /**
     * Gets the catering service.
     *
     * @return the catering service
     */
    public String getCatering() {
        return catering;
    }

    /**
     * Sets the catering service.
     *
     * @param catering the new catering service
     */
    public void setCatering(String catering) {
        this.catering = catering;
    }

    /**
     * Gets the decorations.
     *
     * @return the decorations
     */
    public String getDecorations() {
        return decorations;
    }

    /**
     * Sets the decorations.
     *
     * @param decorations the new decorations
     */
    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    /**
     * Gets the photography service.
     *
     * @return the photography service
     */
    public String getPhotography() {
        return photography;
    }

    /**
     * Sets the photography service.
     *
     * @param photography the new photography service
     */
    public void setPhotography(String photography) {
        this.photography = photography;
    }

    /**
     * Gets the package name.
     *
     * @return Destination Wedding
     */
    public String getPackageName() {
        return "Destination Wedding";
    }

    /**
     * Displays the wedding details.
     */
    public void displayDetails() {
        System.out.println("Package: " + getPackageName());
        System.out.println("Venue: " + venue);
        System.out.println("Catering: " + catering);
        System.out.println("Decorations: " + decorations);
        System.out.println("Photography: " + photography);
    }
}
