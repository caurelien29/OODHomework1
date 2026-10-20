
/**
 * Allows customers to customize a wedding package.
 *
 * @author Cooper Aurelien
 */
public class WeddingPackageBuilder {

    private WeddingPackage wedding;

    /**
     * Creates a builder for a wedding package.
     *
     * @param wedding the package to customize
     */
    public WeddingPackageBuilder(WeddingPackage wedding) {
        this.wedding = wedding;
    }

    /**
     * Sets the wedding venue.
     *
     * @param venue the selected venue
     * @return this builder
     */
    public WeddingPackageBuilder setVenue(String venue) {
        wedding.setVenue(venue);
        return this;
    }

    /**
     * Sets the catering service.
     *
     * @param catering the selected catering service
     * @return this builder
     */
    public WeddingPackageBuilder setCatering(String catering) {
        wedding.setCatering(catering);
        return this;
    }

    /**
     * Sets the decorations.
     *
     * @param decorations the selected decorations
     * @return this builder
     */
    public WeddingPackageBuilder setDecorations(String decorations) {
        wedding.setDecorations(decorations);
        return this;
    }

    /**
     * Sets the photography service.
     *
     * @param photography the selected photography service
     * @return this builder
     */
    public WeddingPackageBuilder setPhotography(String photography) {
        wedding.setPhotography(photography);
        return this;
    }

    /**
     * Returns the customized wedding package.
     *
     * @return the completed wedding package
     */
    public WeddingPackage build() {
        return wedding;
    }
}
