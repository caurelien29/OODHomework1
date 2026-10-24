/**
 * Concrete implementation of a Luxury Wedding Package.
 *
 * @author Cooper Aurelien
 */
public class LuxuryWedding extends WeddingPackage {

    /**
     * Constructs a LuxuryWedding package.
     *
     * @param venue the selected venue
     * @param catering the chosen catering service
     * @param decorations the selected decorations
     * @param photography the chosen photography level
     */
    public LuxuryWedding(Venue venue, Catering catering, Decorations decorations, Photography photography) {
        this.venue = venue;
        this.catering = catering;
        this.decorations = decorations;
        this.photography = photography;
    }

    @Override
    public String getDetails() {
        return "Luxury Wedding Package at " + (venue != null ? venue.getName() : "TBD") +
                " | Catering: " + (catering != null ? catering.getType() : "Gourmet") +
                " | Decorations: " + (decorations != null ? decorations.getStyle() : "Elegant") +
                " | Photography: " + (photography != null ? photography.getLevel() : "Professional");
    }
}