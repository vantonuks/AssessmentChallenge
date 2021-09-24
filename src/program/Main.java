package program;

import java.util.*;

public class Main {
    public static void main(String args[]){

        //Setting up a mockup database
        LinkedList<Product> ProductList = new LinkedList<Product>();
        LinkedList<Cart> CartList = new LinkedList<Cart>();
        initializeDatabase(ProductList, CartList);

        //get products list
        getAllProducts(ProductList);
        addProductToCart(CartList.get(0),ProductList.get(2));
        addProductToCart(CartList.get(0),ProductList.get(6));
        addProductToCart(CartList.get(1),ProductList.get(5));
        addProductToCart(CartList.get(1),ProductList.get(4));
        addProductToCart(CartList.get(2),ProductList.get(1));
        addProductToCart(CartList.get(2),ProductList.get(0));

        getAllProductsCart(ProductList, 1);
        getAllProductsCart(ProductList, 2);
        getAllProductsCart(ProductList, 3);


    }

    //Database initialization.
    public static void initializeDatabase(LinkedList<Product> db, LinkedList<Cart> db2){
        Product prod = new Product("product0");
        db.add(prod);
        prod = new Product("product1");
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

        for (int i =1; i<=3; i++)
        {
            Cart ct = new Cart (i);
            db2.add(ct);
        }
    }

    //get all products from database.
    public static void getAllProducts(LinkedList<Product> db){
        System.out.println("Printing all products in database");
        for (int i=0; i<db.size(); i++) {
            System.out.println(db.get(i).getProductName());
        }
    }

    //get all products from database with certain cart id.
    public static void getAllProductsCart(LinkedList<Product> db, int id){
        System.out.println("Getting all products belonging to cart with id" + id);
        for (int i=0; i<db.size(); i++) {
            Product temp = db.get(i);
            if (temp.cart == null) continue;
            if (temp.cart.getId() == id) {
                System.out.println(temp.getProductName());
            }
        }
    }

    //Add product to cart (Assign product to specific cart)
    public static void addProductToCart (Cart c, Product prod){
        System.out.println("Adding product " + prod.name + " to cart " + c.getId());
        prod.setCart(c);
    }
}
