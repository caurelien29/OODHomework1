
import java.util.ArrayList;

/**
 * Displays and compares products.
 *
 * It can display a list of products, find the cheapest
 * product, and search by processor, RAM, and storage.
 *
 * @author Cooper Aurelien
 */
public class ProductComparison {

    /**
     * Displays every product in the list.
     *
     * @param products the products to display
     */
    public void displayProducts(ArrayList<Product> products) {

        // Visit each product and call its display method.
        for (Product product : products) {
            product.displayDetails();
        }
    }

    /**
     * Finds the product with the lowest price.
     *
     * @param products the list of products to compare
     * @return the cheapest product, or null if the list is empty
     */
    public Product findCheapestProduct(ArrayList<Product> products) {

        // There is no cheapest product if the list is empty.
        if (products == null || products.isEmpty()) {
            return null;
        }

        // Start by assuming the first product is the cheapest.
        Product cheapest = products.get(0);

        // Compare every product's price with the current cheapest.
        for (Product product : products) {
            if (product.getPrice() < cheapest.getPrice()) {
                cheapest = product;
            }
        }

        return cheapest;
    }

    /**
     * Finds products with the requested specifications.
     *
     * @param products list of products to search
     * @param processor required processor
     * @param ram required RAM in GB
     * @param storage required storage in GB
     * @return a list of products matching all three specifications
     */
    public ArrayList<Product> findMatchingProducts(ArrayList<Product> products, String processor, int ram, int storage) {

        // Store matching products in a separate list.
        ArrayList<Product> matches = new ArrayList<Product>();

        if (products == null) {
            return matches;
        }

        // Check every product against the requested specifications.
        for (Product product : products) {

            if (product.getProcessor().equalsIgnoreCase(processor) && product.getRam() == ram && product.getStorage() == storage) {

                // Add a product only if all three values match.
                matches.add(product);
            }
        }

        return matches;
    }
}
