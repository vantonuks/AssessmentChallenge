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
    public static void initializeDatabase(LinkedList<Product> productList, LinkedList<Cart> cartList){
        Product prod = new Product(1, "product1");
        productList.add(prod);
        prod = new Product(2, "product2");
        productList.add(prod);
        prod = new Product(3, "product3");
        productList.add(prod);
        prod = new Product(4, "product4");
        productList.add(prod);
        prod = new Product(5, "product5");
        productList.add(prod);
        prod = new Product(6,"product6");
        productList.add(prod);
        prod = new Product(7, "product7");
        productList.add(prod);

        for (int i =1; i<=3; i++)
        {
            Cart ct = new Cart (i);
            cartList.add(ct);
        }
    }

    //get all products from database.
    public static void getAllProducts(LinkedList<Product> productList){
        System.out.println("Printing all products in database");
        for (int i=0; i<productList.size(); i++) {
            System.out.println(productList.get(i).getProductName());
        }
    }

    //get all products from database with certain cart id.
    public static void getAllProductsCart(LinkedList<Product> productList, int id){
        System.out.println("Getting all products belonging to cart with id" + id);
        for (int i=0; i<productList.size(); i++) {
            Product temp = productList.get(i);
            if (temp.getCart() == null) continue;
            if (temp.getCart().getId() == id) {
                System.out.println(temp.getProductName());
            }
        }
    }

    //Add product to cart (Assign product to specific cart)
    public static void addProductToCart (Cart c, Product prod){
        System.out.println("Adding product " + prod.getProductName() + " to cart " + c.getId());
        prod.setCart(c);
    }
}
