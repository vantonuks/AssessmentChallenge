package program;

interface DatabaseInterface {
    void getAllProducts();

    void getAllProductsInCart(int id);

    void addProductToCart(Product prod, Cart c);

    void initializeDatabase();

}
