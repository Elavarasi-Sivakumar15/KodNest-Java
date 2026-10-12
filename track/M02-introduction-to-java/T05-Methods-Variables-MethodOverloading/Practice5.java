import java.util.Scanner;

class MethodPractice {
    void showTitle() {
        System.out.println("Method Practice");
    }

    void showName(String name) {
        System.out.println("Name: " + name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateTotal(int first, int second) {
        return first + second;
    }
}

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        // Create object and call all methods
        MethodPractice practice = new MethodPractice();
        practice.showTitle();
        practice.showName(name);
        
        int mark = practice.getPassingMark();
        System.out.println("Passing Mark: " + mark);
        int total = practice.calculateTotal(first, second);
        System.out.println("Total: " + total);
    }
}