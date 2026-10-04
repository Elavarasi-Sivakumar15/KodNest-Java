import java.util.Scanner;
public class StudentTotalMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the student name and two marks
        String name = scanner.next();
        int javaMark = scanner.nextInt();
        int sqlMark = scanner.nextInt();

        // Calculate and print the total
        int total = javaMark + sqlMark;
        System.out.println("Student: " +name);
        System.out.println("Total: " +total);
        scanner.close();
    }
}

