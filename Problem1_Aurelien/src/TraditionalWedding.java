/**
 * Concrete implementation of a Traditional Wedding Package.
 *
 * @author Cooper Aurelien
 */
public class TraditionalWedding extends WeddingPackage {

    /**
     * Constructs a TraditionalWedding package.
     *
     * @param venue the selected venue
     * @param catering the chosen catering service
     * @param decorations the selected decorations
     * @param photography the chosen photography level
     */
    public TraditionalWedding(Venue venue, Catering catering, Decorations decorations, Photography photography) {
        this.venue = venue;
        this.catering = catering;
        this.decorations = decorations;
        this.photography = photography;
    }

    @Override
    public String getDetails() {
        return "Traditional Wedding Package at " + (venue != null ? venue.getName() : "TBD") +
                " | Catering: " + (catering != null ? catering.getType() : "Classic") +
                " | Decorations: " + (decorations != null ? decorations.getStyle() : "Traditional") +
                " | Photography: " + (photography != null ? photography.getLevel() : "Local");
    }
}