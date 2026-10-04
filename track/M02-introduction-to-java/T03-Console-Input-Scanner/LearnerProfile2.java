import java.util.Scanner;
public class LearnerProfile2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int solvedProblems = scanner.nextInt();
    double percentage = scanner.nextDouble();
    scanner.nextLine();

    String fullName = scanner.nextLine();
    String target = scanner.nextLine();
    System.out.println("Name: "+fullName);
    System.out.println("Target: "+target);
    System.out.println("Solved Problems: "+solvedProblems);
    System.out.println("Percentage: "+percentage+ "%");
    scanner.close();
}
}
