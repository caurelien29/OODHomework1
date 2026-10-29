import java.util.Map;

/**
 * Concrete adapter parsing actual CSV rows (ProductName, Processor, RAM, Storage, Ingerated, Operating Systems, Price)
 * into structured ProductSpec objects.
 *
 * @author Cooper Aurelien
 */
public class CSVProductAdapter implements ProductAdapter {

    @Override
    public ProductSpec toSpec(ExternalCSVRow row) {
        // Split line by comma, keeping empty trailing tokens
        String[] parts = row.getRawData().split(",", -1);
        if (parts.length < 7) {
            return null; // Skip invalid or malformed rows
        }

        String name = parts[0].trim();
        String processor = parts[1].trim();
        String ram = parts[2].trim();
        String storage = parts[3].trim();
        String ingerated = parts[4].trim();
        String operatingSystem = parts[5].trim();
        String priceStr = parts[6].trim();

        // Safety check: Skip header row
        if (name.equalsIgnoreCase("ProductName") || priceStr.equalsIgnoreCase("Price")) {
            return null;
        }

        // Parse price safely to avoid NumberFormatException on empty string
        double price = 0.0;
        if (!priceStr.isEmpty()) {
            try {
                price = Double.parseDouble(priceStr);
            } catch (NumberFormatException e) {
                return null;
            }
        }

        // Dynamically set product type based on product name
        String type = name.toLowerCase().contains("smartphone") ? "Smartphone" : "Laptop";

        ProductSpec spec = new ProductSpec(name, type);
        spec.setPrice(price);

        Map<String, String> attrs = spec.getAttributes();
        attrs.put("Processor", processor);
        attrs.put("RAM", ram);
        attrs.put("Storage", storage);
        attrs.put("Integrated", ingerated.isEmpty() ? "N/A" : ingerated);
        attrs.put("Operating System", operatingSystem);

        return spec;
    }
}