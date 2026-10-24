/**
 * Builder class for step-by-step construction of a WeddingPackage object.
 *
 * @author Cooper Aurelien
 */
public class WeddingPackageBuilder {
    private Venue venue;
    private Catering catering;
    private Decorations decorations;
    private Photography photography;

    /**
     * Sets the venue for the builder.
     *
     * @param venue the venue object
     * @return current instance of WeddingPackageBuilder
     */
    public WeddingPackageBuilder setVenue(Venue venue) {
        this.venue = venue;
        return this;
    }

    /**
     * Sets the catering for the builder.
     *
     * @param catering the catering object
     * @return current instance of WeddingPackageBuilder
     */
    public WeddingPackageBuilder setCatering(Catering catering) {
        this.catering = catering;
        return this;
    }

    /**
     * Sets the decorations for the builder.
     *
     * @param decorations the decorations object
     * @return current instance of WeddingPackageBuilder
     */
    public WeddingPackageBuilder setDecorations(Decorations decorations) {
        this.decorations = decorations;
        return this;
    }

    /**
     * Sets the photography package for the builder.
     *
     * @param photography the photography object
     * @return current instance of WeddingPackageBuilder
     */
    public WeddingPackageBuilder setPhotography(Photography photography) {
        this.photography = photography;
        return this;
    }

    /**
     * Constructs and returns the final WeddingPackage.
     *
     * @return built WeddingPackage object
     */
    public WeddingPackage build() {
        return new DestinationWedding(venue, catering, decorations, photography);
    }
}