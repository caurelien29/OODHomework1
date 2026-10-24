/**
 * Factory class that creates instances of WeddingPackage based on type string.
 *
 * @author Cooper Aurelien
 */
public class WeddingFactory {

    /**
     * Factory method creating a specific WeddingPackage.
     *
     * @param type the requested package type
     * @return WeddingPackage instance matching the specification
     */
    public WeddingPackage WeddingPackage(String type) {
        WeddingPackageBuilder builder = new WeddingPackageBuilder();
        if ("Luxury".equalsIgnoreCase(type)) {
            return new LuxuryWedding(new Venue("Resort Ballroom"), new Catering("Gourmet Buffet"), new Decorations("Elegant Flowers"), new Photography("Professional 4K"));
        } else if ("Traditional".equalsIgnoreCase(type)) {
            return new TraditionalWedding(new Venue("Community Center"), new Catering("Classic Buffet"), new Decorations("Simple Flowers"), new Photography("Local"));
        } else {
            return builder.setVenue(new Venue("Tropical Beach"))
                    .setCatering(new Catering("Seafood Deluxe"))
                    .setDecorations(new Decorations("Floral Arc"))
                    .setPhotography(new Photography("Full Day 4K"))
                    .build();
        }
    }
}