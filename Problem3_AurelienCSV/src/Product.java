/**
 * Represents a product in the system.
 *
 * @author Cooper Aurelien
 */
public interface Product {

    /**
     * Returns the product name.
     *
     * @return product name
     */
    String getName();

    /**
     * Returns the processor.
     *
     * @return processor
     */
    String getProcessor();

    /**
     * Returns the RAM.
     *
     * @return RAM in GB
     */
    int getRam();

    /**
     * Returns the storage.
     *
     * @return storage in GB
     */
    int getStorage();

    /**
     * Returns the price.
     *
     * @return product price
     */
    double getPrice();

    /**
     * Displays product details.
     */
    void displayDetails();
}