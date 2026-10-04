import java.util.Scanner;
public class LearnerProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.next();
        int solvedProblems = scanner.nextInt();
        double assessmentPercentage = scanner.nextDouble();
        boolean profileVerified = scanner.nextBoolean();

        System.out.println("Learner: " + learnerName);
        System.out.println("Problems solved: " + solvedProblems);
        System.out.println("Assessment: " + assessmentPercentage);
        System.out.println("Verified: " + profileVerified);

        scanner.close();
    }
}
