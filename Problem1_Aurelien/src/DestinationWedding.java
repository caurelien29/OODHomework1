/**
 * Concrete implementation of a Destination Wedding Package.
 *
 * @author Cooper Aurelien
 */
public class DestinationWedding extends WeddingPackage {

    /**
     * Constructs a DestinationWedding package.
     *
     * @param venue the selected venue
     * @param catering the chosen catering service
     * @param decorations the selected decorations
     * @param photography the chosen photography level
     */
    public DestinationWedding(Venue venue, Catering catering, Decorations decorations, Photography photography) {
        this.venue = venue;
        this.catering = catering;
        this.decorations = decorations;
        this.photography = photography;
    }

    @Override
    public String getDetails() {
        return "Destination Wedding Package at " + (venue != null ? venue.getName() : "TBD") +
                " | Catering: " + (catering != null ? catering.getType() : "Standard") +
                " | Decorations: " + (decorations != null ? decorations.getStyle() : "Standard") +
                " | Photography: " + (photography != null ? photography.getLevel() : "Standard");
    }
}