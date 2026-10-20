/**
 * Adapts supplier products to the Product interface.
 *
 * @author Cooper Aurelien
 */
public class SupplierProductAdapter implements Product {

    private String name;
    private String processor;
    private int ram;
    private int storage;
    private double price;

    public SupplierProductAdapter(String name, String processor, int ram, int storage, double price) {

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
     * Displays supplier product information.
     */
    public void displayDetails() {
        System.out.println("Supplier Product: " + name);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.printf("Price: $%.2f%n", price);
        System.out.println();
    }
}