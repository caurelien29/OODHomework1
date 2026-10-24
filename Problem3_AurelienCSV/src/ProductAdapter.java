/**
 * Target adapter interface for mapping raw CSV data to ProductSpec instances.
 *
 * @author Cooper Aurelien
 */
public interface ProductAdapter {
    /**
     * Adapts external CSV row into a ProductSpec object.
     *
     * @param row input external CSV row
     * @return converted ProductSpec instance
     */
    ProductSpec toSpec(ExternalCSVRow row);
}