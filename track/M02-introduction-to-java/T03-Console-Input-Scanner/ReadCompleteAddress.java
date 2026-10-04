 import java.util.Scanner;

public class ReadCompleteAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the complete address
        String address = scanner.nextLine();
        // Print the address
        System.out.println("Address: "+address);
        scanner.close();
    }
} 
