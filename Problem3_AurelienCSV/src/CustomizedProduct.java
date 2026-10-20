/**
 * Represents a customized product.
 *
 * @author Cooper Aurelien
 */
public class CustomizedProduct implements Product {

    private String name;
    private String processor;
    private int ram;
    private int storage;
    private double price;

    /**
     * Creates a customized product.
     *
     * @param name product name
     * @param processor processor name
     * @param ram RAM in GB
     * @param storage storage in GB
     * @param price product price
     */
    public CustomizedProduct(String name, String processor, int ram, int storage, double price) {

        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }

    /**
     * Displays product information.
     */
    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.printf("Price: $%.2f%n", price);
        System.out.println();
    }
}