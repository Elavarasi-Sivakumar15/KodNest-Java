import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javaScore;
}

public class LearnerDetails2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input details for the first learner
        Learner firstLearner = new Learner();
        firstLearner.id = scanner.nextInt();
        firstLearner.name = scanner.next();
        firstLearner.javaScore = scanner.nextInt();

        // Input details for the second learner
        Learner secondLearner = new Learner();
        secondLearner.id = scanner.nextInt();
        secondLearner.name = scanner.next();
        secondLearner.javaScore = scanner.nextInt();

        // Read the new score for the first learner
        int newScore = scanner.nextInt();

        // Display data before update
        System.out.println("Before Update");
        System.out.println(firstLearner.id + "-" + firstLearner.name + "-" + firstLearner.javaScore);
        System.out.println(secondLearner.id + "-" + secondLearner.name + "-" + secondLearner.javaScore);

        // Update the score of the first learner
        firstLearner.javaScore = newScore;

        // Display data after update
        System.out.println("After Update");
        System.out.println(firstLearner.id + "-" + firstLearner.name + "-" + firstLearner.javaScore);
        System.out.println(secondLearner.id + "-" + secondLearner.name + "-" + secondLearner.javaScore);
        
        scanner.close();
    }
}