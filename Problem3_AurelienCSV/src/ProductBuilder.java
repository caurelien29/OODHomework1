/**
 * Interface establishing builder methods to create Product instances.
 *
 * @author Cooper Aurelien
 */
public interface ProductBuilder {
    /**
     * Populates builder fields from a ProductSpec.
     *
     * @param spec input specification model
     * @return builder reference
     */
    ProductBuilder fromSpec(ProductSpec spec);

    /**
     * Sets custom key-value specifications.
     *
     * @param key spec attribute key
     * @param value spec attribute value
     * @return builder reference
     */
    ProductBuilder setAttribute(String key, String value);

    /**
     * Constructs the final Product instance.
     *
     * @return completed Product object
     */
    Product build();
}