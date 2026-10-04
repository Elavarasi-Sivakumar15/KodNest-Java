import java.util.Scanner;
public class ReadNameandAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // consume the pending newline
        scanner.nextLine();
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
