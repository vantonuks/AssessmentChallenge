package program;

public class Product {
    private String name;
    private Cart cart;
    private int id;

    public Product(int n, String s) {
        name = s;
        id = n;
    }
    /*
    public void setProductName(String s) {
        name = s;
    }
    */
    public String getProductName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart x){
        cart = x;
    }
}
