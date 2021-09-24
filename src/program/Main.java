package program;

import java.util.*;

public class Main {
    public static void main(String args[])
    {
        LinkedList<Product> ProductList = new LinkedList<Product>();
        LinkedList<Cart> CartList = new LinkedList<Cart>();

    }

    public static void initializeDatabase(LinkedList<Product> db, LinkedList<Cart> db2)
    {
        Product prod = new Product("product1");
        db.add(prod);
        prod = new Product("product2");
        db.add(prod);
        prod = new Product("product3");
        db.add(prod);
        prod = new Product("product4");
        db.add(prod);
        prod = new Product("product5");
        db.add(prod);
        prod = new Product("product6");
        db.add(prod);
        prod = new Product("product7");
        db.add(prod);

        for (int i =1; i<3; i++)
        {
            Cart ct = new Cart (i);
            db2.add(ct);
        }
    }
}
