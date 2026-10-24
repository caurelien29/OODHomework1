import java.util.HashMap;
import java.util.Map;

/**
 * Builder implementation specialized for Laptop products.
 *
 * @author Cooper Aurelien
 */
public class LaptopBuilder implements ProductBuilder {
    private String name = "Custom Laptop";
    private String type = "Laptop";
    private Map<String, String> specs = new HashMap<>();
    private double price = 800.00; // Fixed default price per requirements

    @Override
    public ProductBuilder fromSpec(ProductSpec spec) {
        this.name = spec.getName();
        this.specs.putAll(spec.getAttributes());
        this.price = spec.getPrice();
        return this;
    }

    @Override
    public ProductBuilder setAttribute(String key, String value) {
        this.specs.put(key, value);
        return this;
    }

    @Override
    public Product build() {
        return new Product(name, type, specs, price);
    }
}