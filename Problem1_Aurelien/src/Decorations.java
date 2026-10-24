/**
 * Represents the Decorations setup for a wedding package.
 *
 * @author Cooper Aurelien
 */
public class Decorations {
    private String style;

    /**
     * Constructs a Decorations object with the given style.
     *
     * @param style the decorative style
     */
    public Decorations(String style) {
        this.style = style;
    }

    /**
     * Gets the decoration style.
     *
     * @return decoration style string
     */
    public String getStyle() {
        return style;
    }
}