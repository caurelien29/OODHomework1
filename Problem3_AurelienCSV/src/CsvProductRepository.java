import java.io.BufferedReader; // Reads the CSV file one line at a time.
import java.io.FileReader;     // Opens the CSV file for reading.
import java.io.IOException;    // Handles errors when reading the file.
import java.util.ArrayList;   // Stores the products loaded from the CSV.

/**
 * Reads product information from a CSV file.
 *
 * Each row in the file represents a supplier product.
 * The repository converts the rows into Product objects
 * so the rest of the program can use them.
 *
 * @author Cooper Aurelien
 */
public class CsvProductRepository {

    /**
     * Loads products from a CSV file.
     *
     * @param fileName the name or path of the CSV file
     * @return a list containing the products that were loaded
     */
    public ArrayList<Product> loadProducts(String fileName) {

        // Create an empty list to store the products.
        ArrayList<Product> products = new ArrayList<Product>();

        /*
         * FileReader opens the file.
         * BufferedReader lets us read it one line at a time.
         *
         * The try-with-resources statement closes the reader
         * automatically when reading finishes.
         */
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            // A line will contain one row from the CSV file.
            String line;

            // The first row contains column names, not a product.
            // Read and skip it.
            reader.readLine();

            // Continue reading until there are no more rows.
            while ((line = reader.readLine()) != null) {

                /*
                 * split(",") separates the row at each comma.
                 *
                 * Example:
                 * "Student Laptop,Intel i5,16,512,649.99"
                 *
                 * becomes:
                 * data[0] = "Student Laptop"
                 * data[1] = "Intel i5"
                 * data[2] = "16"
                 * data[3] = "512"
                 * data[4] = "649.99"
                 */
                String[] data = line.split(",");

                // Each product row must have exactly five values.
                if (data.length == 5) {

                    try {
                        // trim() removes unnecessary spaces.
                        String name = data[0].trim();
                        String processor = data[1].trim();

                        /*
                         * CSV values are read as text.
                         * parseInt converts RAM and storage into integers.
                         * parseDouble converts the price into a double.
                         */
                        int ram = Integer.parseInt(data[2].trim());
                        int storage = Integer.parseInt(data[3].trim());
                        double price = Double.parseDouble(data[4].trim());

                        /*
                         * Create an adapter object using the row's data.
                         * It implements Product, so it can be stored
                         * in our ArrayList<Product>.
                         */
                        Product product = new SupplierProductAdapter(name, processor, ram, storage, price);

                        // Save this product in the list.
                        products.add(product);

                    } catch (NumberFormatException e) {
                        // Skip rows with invalid numbers.
                        System.out.println("Invalid row: " + line);
                    }

                } else {
                    // Skip rows that do not have five columns.
                    System.out.println("Invalid row: " + line);
                }
            }

        } catch (IOException e) {
            // This message appears if the file cannot be read.
            System.out.println("Could not read CSV file: " + fileName);
        }

        // Return all successfully loaded products to the caller.
        return products;
    }
}
