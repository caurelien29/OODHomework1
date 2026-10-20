
import java.util.ArrayList;

/**
 * Tests the Product Customization System.
 *
 * Demonstrates the Builder Pattern, Adapter Pattern,
 * CSV loading, and product comparison.
 *
 * @author Cooper Aurelien
 */
public class ProductTest {

    /**
     * Starts the program and demonstrates its functionality.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /*
         * PART 1: BUILDER PATTERN
         *
         * Build a customized laptop by setting each property.
         * The final build() call creates the product object.
         */
        Product customProduct = new ProductBuilder()
                .setName("My Custom Laptop")
                .setProcessor("Intel i7")
                .setRam(16)
                .setStorage(512)
                .setPrice(899.99)
                .build();

        System.out.println("=== Customized Product ===");
        customProduct.displayDetails();

        /*
         * PART 2: CSV FILE
         *
         * Create the repository that knows how to read the CSV.
         * The file name must match the actual CSV file name.
         */
        CsvProductRepository repository = new CsvProductRepository();

        // Load the rows and receive a list of Product objects.
        ArrayList<Product> products = repository.loadProducts("products.csv");

        // Create an object that can compare the loaded products.
        ProductComparison comparison = new ProductComparison();

        /*
         * PART 3: DISPLAY PRODUCTS
         *
         * These products come from the CSV file, not from
         * manually creating each supplier product here.
         */
        System.out.println("=== Supplier Products ===");

        if (products.isEmpty()) {
            System.out.println("No products loaded. Check that products.csv exists.");
        } else {
            comparison.displayProducts(products);

            // PART 4: FIND THE CHEAPEST PRODUCT
            System.out.println("=== Cheapest Product ===");

            Product cheapest = comparison.findCheapestProduct(products);

            if (cheapest != null) {
                cheapest.displayDetails();
            }

            // PART 5: FIND PRODUCTS WITH MATCHING SPECIFICATIONS
            System.out.println("=== Matching Products ===");

            ArrayList<Product> matches = comparison.findMatchingProducts(products, "Intel i5", 16, 512);

            if (matches.isEmpty()) {
                System.out.println("No matching products found.");
            } else {
                comparison.displayProducts(matches);
            }
        }
    }
}
