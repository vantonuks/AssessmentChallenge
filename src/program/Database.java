package program;

import java.util.LinkedList;

public class Database implements DatabaseInterface{
    LinkedList<Product> productList;
    LinkedList<Cart> cartList;

    Database(){
        productList = new LinkedList<Product>();
        cartList = new LinkedList<Cart>();
        initializeDatabase();
    }

    @Override
    public void getAllProducts() {
        System.out.println("Printing all products in database");
        for (int i=0; i<productList.size(); i++) {
            System.out.println(productList.get(i).getName());
        }
    }

    @Override
    public void getAllProductsInCart(int id) {
        System.out.println("Getting all products belonging to cart with id" + id);
        boolean isCartEmpty = true;
        for (int i=0; i<productList.size(); i++) {
            Product temp = productList.get(i);
            if (temp.getCartID() == 0) continue;
            if (temp.getCartID() == id) {
                isCartEmpty = false;
                System.out.println(temp.getName());
            }
        }
        if (isCartEmpty){
            System.out.println("Cart with id" + id + " is empty!");
        }
    }

    @Override
    public void addProductToCart(Product prod, Cart c) {
        System.out.println("Adding product " + prod.getName() + " to cart " + c.getPK());
        prod.setCart(c.getPK());
    }

    @Override
    public void initializeDatabase() {
        for (int i=1; i<=8; i++) {
            Product temp = new Product(i, "product" + i);
            productList.add(temp);
        }

        for (int i=1; i<=3; i++)
        {
            Cart ct = new Cart (i, "cart "+i);
            cartList.add(ct);
        }

    }
}
