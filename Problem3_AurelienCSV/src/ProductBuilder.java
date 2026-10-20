/**
 * Builds customized products.
 *
 * @author Cooper Aurelien
 */
public class ProductBuilder {

    private String name;
    private String processor;
    private int ram;
    private int storage;
    private double price;

    public ProductBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProductBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ProductBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public ProductBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public ProductBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    /**
     * Builds the customized product.
     *
     * @return customized product
     */
    public Product build() {
        return new CustomizedProduct(name, processor, ram, storage, price);
    }
}