# AssessmentChallenge
Assessment coding challenge

This program simulates interaction with product and cart database (with 1:N relation between carts and products), and provides capabilities of getting all products, getting all products of a single cart, and adding the product to a cart.

Database is simulated by creating linked lists consisting of Product and Cart objects (named as db and db2)
  Product object has name, and a reference to the Cart
  Cart object has an id, represented by integer.
Database is initialized at the start of runtime, by envoking method initializeDatabase.

method getAllProducts prints the contains of Product object list, in the order, by which database is filled.

method getAllProductsCart prints only those members of Product object list, that have cart assigned to them (Cart attribute being not NULL) with id equaling the number passed as an argument

method addProductToCart adds product to a certain cart. Since relation (according to task) between carts and products is 1:N, this is represented by Product objects having attribute cart - reference to the cart they belong to. Therefore, addProductToCart assigns the cart reference to the passed Product object.





  
