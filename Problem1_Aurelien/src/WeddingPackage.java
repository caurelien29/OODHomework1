
/**
 * Defines the methods for a wedding package.
 *
 * @author Cooper Aurelien
 */
public interface WeddingPackage {

    /**
     * Gets the wedding venue.
     *
     * @return the venue
     */
    String getVenue();

    /**
     * Sets the wedding venue.
     *
     * @param venue the new venue
     */
    void setVenue(String venue);

    /**
     * Gets the catering service.
     *
     * @return the catering service
     */
    String getCatering();

    /**
     * Sets the catering service.
     *
     * @param catering the new catering service
     */
    void setCatering(String catering);

    /**
     * Gets the wedding decorations.
     *
     * @return the decorations
     */
    String getDecorations();

    /**
     * Sets the wedding decorations.
     *
     * @param decorations the new decorations
     */
    void setDecorations(String decorations);

    /**
     * Gets the photography service.
     *
     * @return the photography service
     */
    String getPhotography();

    /**
     * Sets the photography service.
     *
     * @param photography the new photography service
     */
    void setPhotography(String photography);

    /**
     * Gets the wedding package name.
     *
     * @return the package name
     */
    String getPackageName();

    /**
     * Displays the wedding package details.
     */
    void displayDetails();
}
