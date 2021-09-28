package program;

public class Product implements RecordInterface {
    private String name;
    private int cartFK;
    private int pk;

    public Product(int n, String s) {
        name = s;
        pk = n;
        cartFK = 0;
    }
    /*
    public void setProductName(String s) {
        name = s;
    }
    */
    public String getName() {
        return name;
    }

    public int getPK() {
        return pk;
    }

    public int getCartID() {
        return cartFK;
    }

    public void setCart(int n){
        cartFK = n;
    }
}
