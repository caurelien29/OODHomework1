import java.util.HashMap;
import java.util.Map;

/**
 * Final Product object generated via the ProductBuilder interface.
 *
 * @author Cooper Aurelien
 */
public class Product {
    private String name;
    private String type;
    private Map<String, String> specs = new HashMap<>();
    private double price;

    /**
     * Constructs a fully initialized Product.
     *
     * @param name name of the product
     * @param type category/type of product
     * @param specs specifications map
     * @param price base retail price
     */
    public Product(String name, String type, Map<String, String> specs, double price) {
        this.name = name;
        this.type = type;
        this.specs = specs;
        this.price = price;
    }

    public Map<String, String> getSpecs() { return specs; }
    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }

    /**
     * Formats detailed summary of the product attributes.
     *
     * @return string overview of the product
     */
    public String getDetails() {
        return "Product: " + name + " [" + type + "] | Price: $" + price + " | Specs: " + specs;
    }
}