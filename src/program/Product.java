package program;

public class Product {
    public String name;
    public Cart cart;

    public Product(String n) {
        name = n;
    }

    public String getProductName() {
        return name;
    }
}
