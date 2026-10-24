/**
 * Abstract base class representing a generic Wedding Package.
 *
 * @author Cooper Aurelien
 */
public abstract class WeddingPackage {
    protected Venue venue;
    protected Catering catering;
    protected Decorations decorations;
    protected Photography photography;

    /**
     * Abstract method to obtain detailed information about the wedding package.
     *
     * @return String detailing package contents
     */
    public abstract String getDetails();
}