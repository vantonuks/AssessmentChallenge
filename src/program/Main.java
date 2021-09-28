package program;

import java.util.*;

public class Main {
    public static void main(String args[]){
        Database db = new Database();

        db.getAllProducts();

        db.addProductToCart(db.productList.get(0), db.cartList.get(1));
        db.addProductToCart(db.productList.get(2), db.cartList.get(1));
        db.addProductToCart(db.productList.get(3), db.cartList.get(1));
        db.addProductToCart(db.productList.get(1), db.cartList.get(2));
        db.addProductToCart(db.productList.get(4), db.cartList.get(2));
        db.addProductToCart(db.productList.get(5), db.cartList.get(2));

        db.getAllProductsInCart(1);
        db.getAllProductsInCart(2);
        db.getAllProductsInCart(3);
    }
}
