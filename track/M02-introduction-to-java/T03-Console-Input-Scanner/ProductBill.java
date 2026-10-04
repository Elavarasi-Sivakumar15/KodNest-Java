import java.util.Scanner;

public class ProductBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read product name
        String product = scanner.next();
        // Read price
        double price = scanner.nextDouble();
        // Read quantity
        int quantity = scanner.nextInt();
        // Calculate and print the total
        double total = price * quantity;
        System.out.println("Product: " + product);
        System.out.println("Total: " + total);
        
        scanner.close();
    }
}
