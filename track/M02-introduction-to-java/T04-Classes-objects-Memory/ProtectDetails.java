
class Product {
    int productId;
    String productName;
    double price;
}

public class ProtectDetails {
    public static void main(String[] args) {
       
        Product prod1;
 
        prod1 = new Product();
        Product prod2 = new Product();

        prod1.productId = 101;
        prod1.productName = "Laptop";
        prod1.price = 750.00;

        prod2.productId = 102;
        prod2.productName = "Smartphone";
        prod2.price = 450.00;

        System.out.println("Product 1: ID = " + prod1.productId + ", Name = " + prod1.productName + ", Price = " + prod1.price);
        System.out.println("Product 2: ID = " + prod2.productId + ", Name = " + prod2.productName + ", Price = " + prod2.price);

    }
}