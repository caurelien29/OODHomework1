// Reads file data character-by-character or line-by-line using a buffer for efficient file reading
import java.io.BufferedReader;

// Opens and reads characters from a file on disk
import java.io.FileReader;

// Handles errors that may occur during file reading/writing operations
import java.io.IOException;

// Provides a dynamic, resizable array to store objects
import java.util.ArrayList;

// Defines an ordered list structure (implemented by ArrayList)
import java.util.List;

/**
 * Driver class demonstrating CSV file reading, Adapter conversion,
 * step-by-step Builder customization, and Extra Credit price matching.
 *
 * @author Cooper Aurelien
 */
public class ProductTest {

    /**
     * Reads all default products directly from products.csv.
     *
     * @param filePath path to the products.csv file
     * @return list of parsed Product instances
     */
    public static List<Product> readProductsFromCSV(String filePath) {
        List<Product> defaultProducts = new ArrayList<>();
        CSVProductAdapter adapter = new CSVProductAdapter();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                // Skip empty lines or header line starting with "Name"
                if (line.isEmpty() || line.startsWith("Name")) {
                    continue;
                }

                ExternalCSVRow csvRow = new ExternalCSVRow(line);
                ProductSpec spec = adapter.toSpec(csvRow);

                if (spec != null) {
                    LaptopBuilder builder = new LaptopBuilder();
                    Product product = builder.fromSpec(spec).build();
                    defaultProducts.add(product);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        return defaultProducts;
    }

    /**
     * Extra credit matching algorithm adjusting price when Processor, RAM, and Storage match.
     *
     * @param customProduct target custom product
     * @param defaultProducts baseline list of CSV products
     */
    public static void checkAndAdjustPrice(Product customProduct, List<Product> defaultProducts) {
        String customProc = customProduct.getSpecs().get("Processor");
        String customRam = customProduct.getSpecs().get("RAM");
        String customStorage = customProduct.getSpecs().get("Storage");

        for (Product defaultProd : defaultProducts) {
            String defaultProc = defaultProd.getSpecs().get("Processor");
            String defaultRam = defaultProd.getSpecs().get("RAM");
            String defaultStorage = defaultProd.getSpecs().get("Storage");

            if (customProc != null && customProc.equalsIgnoreCase(defaultProc) &&
                    customRam != null && customRam.equalsIgnoreCase(defaultRam) &&
                    customStorage != null && customStorage.equalsIgnoreCase(defaultStorage)) {

                customProduct.setPrice(defaultProd.getPrice());
                System.out.println("\nExact hardware match found with '" + defaultProd.getDetails()
                        + "'! Price adjusted from $800.00 to $" + defaultProd.getPrice());
                return;
            }
        }
        System.out.println("\nNo exact match found in CSV. Price remains at default fixed price: $" + customProduct.getPrice());
    }

    /**
     * Application entry point for Problem 3.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== Problem 3: Product Customization & Integration System ===");

        // 1. Read default supplier products from actual products.csv
        List<Product> defaultProducts = readProductsFromCSV("products.csv");

        System.out.println("\n--- Default Supplier Products ---");
        for (Product p : defaultProducts) {
            System.out.println(p.getDetails());
        }

        // 2. Build a custom laptop step-by-step using LaptopBuilder
        LaptopBuilder customBuilder = new LaptopBuilder();
        Product customLaptop = customBuilder.setAttribute("Processor", "Intel i5")
                .setAttribute("RAM", "16")
                .setAttribute("Storage", "512")
                .setAttribute("OS", "Windows 11")
                .build();

        System.out.println("\n--- Customer Customized Product ---");
        System.out.println(customLaptop.getDetails());

        // 3. Compare with CSV products and apply Extra Credit price adjustment
        checkAndAdjustPrice(customLaptop, defaultProducts);

        System.out.println("\n--- Final Customer Customized Product ---");
        System.out.println(customLaptop.getDetails());
    }
}