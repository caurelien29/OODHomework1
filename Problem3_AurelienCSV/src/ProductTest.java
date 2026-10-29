import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Driver class demonstrating CSV file reading, Adapter conversion,
 * step-by-step Builder customization, price matching, and dynamic search.
 *
 * @author Cooper Aurelien
 */
public class ProductTest {

    /**
     * Reads all default products directly from professor's CSV file.
     *
     * @param filePath path to the CSV file
     * @return list of parsed Product instances
     */
    public static List<Product> readProductsFromCSV(String filePath) {
        List<Product> defaultProducts = new ArrayList<>();
        CSVProductAdapter adapter = new CSVProductAdapter();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();

                // Skip empty lines
                if (line.isEmpty() || line.startsWith("ProductName") || line.startsWith("Name")) {
                    continue;
                }

                ExternalCSVRow csvRow = new ExternalCSVRow(line);
                ProductSpec spec = adapter.toSpec(csvRow);

                if (spec != null) {
                    ProductBuilder builder = spec.getType().equalsIgnoreCase("Smartphone")
                            ? new SmartphoneBuilder()
                            : new LaptopBuilder();
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
     * Matching algorithm adjusting price when Processor, RAM, and Storage match.
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
                        + "'! Price adjusted to $" + defaultProd.getPrice());
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

        // 1. Read default products from downloaded CSV file
        List<Product> defaultProducts = readProductsFromCSV("Sample CSV.csv");

        // 2. Display all products and their characteristics directly from the CSV
        System.out.println("\n--- Default Supplier Products Loaded From CSV ---");
        for (Product p : defaultProducts) {
            System.out.println(p.getDetails());
        }

        // 3. Build custom product step-by-step
        LaptopBuilder customBuilder = new LaptopBuilder();
        Product customLaptop = customBuilder.setAttribute("Processor", "Intel i5")
                .setAttribute("RAM", "8")
                .setAttribute("Storage", "256")
                .setAttribute("OS", "Windows 10")
                .build();

        System.out.println("\n--- Customer Customized Product ---");
        System.out.println(customLaptop.getDetails());

        checkAndAdjustPrice(customLaptop, defaultProducts);

        // 4. Accept user input to search for any product name (e.g., Smartphone Model X)
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a product name to search for in the data: ");

        String searchQuery = scanner.nextLine().trim();

        System.out.println("\n--- Search Result ---");
        boolean found = false;
        for (Product product : defaultProducts) {
            if (product.getName().equalsIgnoreCase(searchQuery)) {
                System.out.println("Product found! Labeled components:");
                product.printLabeledComponents();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No product found matching: '" + searchQuery + "'");
        }

        scanner.close();
    }
}