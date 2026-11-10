
// Product.java
public class Product {
    static int totalProducts = 0;   // static variable: one copy shared by all products
    String name;                    // instance variables: each product has its own
    double price;
    int quantity;
    // 1. No-argument constructor: sets default values
    Product() {
        name = "Unknown";
        price = 0;
        quantity = 0;
        totalProducts++;
    }
    // 2. Parameterized constructor
    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }
    // 3. Copy constructor
    Product(Product other) {
        // TODO: copy name, price and quantity from other into this object
        // TODO: remember to increase totalProducts too
        this.name=other.name;
        this.price=other.price;
        this.quantity=other.quantity;
        totalProducts++;
    }
    // price * quantity (the int quantity is widened to double automatically)
    double stockValue() {
        // TODO: return the total value of this product's stock
        return  price*quantity;
    }
    void display() {
        // TODO: print one line, for example:  Samosa | Rs 15.0 | qty 20
        System.out.println(this.name+ " | Rs "+this.price+ " | qty " +this.quantity);
    }
}