import java.util.Scanner;

class Calculator {
    int add(int first, int second) {
        int sum = first + second;
        return sum;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object
        Calculator c = new Calculator();

        int result = c.add(first,second);

        System.out.println(result);
    }
}