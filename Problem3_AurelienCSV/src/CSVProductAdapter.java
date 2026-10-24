import java.util.HashMap;
import java.util.Map;

/**
 * Concrete adapter parsing actual CSV rows (Name, Processor, RAM, Storage, Price)
 * into structured ProductSpec objects.
 *
 * @author Cooper Aurelien
 */
public class CSVProductAdapter implements ProductAdapter {

    @Override
    public ProductSpec toSpec(ExternalCSVRow row) {
        String[] parts = row.getRawData().split(",");
        if (parts.length < 5) {
            throw new IllegalArgumentException("Invalid CSV line format: " + row.getRawData());
        }

        String name = parts[0].trim();
        String processor = parts[1].trim();
        String ram = parts[2].trim();
        String storage = parts[3].trim();
        String priceStr = parts[4].trim();

        // Safety check: Skip header row if it reaches the adapter
        if (priceStr.equalsIgnoreCase("Price")) {
            return null;
        }

        double price = Double.parseDouble(priceStr);

        ProductSpec spec = new ProductSpec(name, "Laptop");
        spec.setPrice(price);

        Map<String, String> attrs = spec.getAttributes();
        attrs.put("Processor", processor);
        attrs.put("RAM", ram);
        attrs.put("Storage", storage);

        return spec;
    }
}