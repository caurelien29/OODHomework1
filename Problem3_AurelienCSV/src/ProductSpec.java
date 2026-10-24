import java.util.HashMap;
import java.util.Map;

/**
 * Structured specification object extracted from parsed CSV rows.
 *
 * @author Cooper Aurelien
 */
public class ProductSpec {
    private String name;
    private String type;
    private double price;
    private Map<String, String> attributes = new HashMap<>();

    /**
     * Constructs a ProductSpec with name and product type.
     *
     * @param name name of product
     * @param type category or type of product
     */
    public ProductSpec(String name, String type) {
        this.name = name;
        this.type = type;
        this.price = 800.00;
    }

    /**
     * Sets price from parsed CSV data.
     *
     * @param price parsed price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Gets default/parsed price.
     *
     * @return price
     */
    public double getPrice() { return price; }

    /**
     * Gets product name.
     *
     * @return product name
     */
    public String getName() { return name; }

    /**
     * Gets product type.
     *
     * @return product type
     */
    public String getType() { return type; }

    /**
     * Gets attributes map.
     *
     * @return key-value map of specifications
     */
    public Map<String, String> getAttributes() { return attributes; }
}