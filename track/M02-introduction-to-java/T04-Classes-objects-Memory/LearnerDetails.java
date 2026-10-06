import java.util.Scanner;

class Student {
    // Declare id, name and javaScore
    int id;
    String name;
    int javaScore;
}

public class LearnerDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate the first Student object
        Student learner1 = new Student();
        learner1.id = scanner.nextInt();
        learner1.name = scanner.next();
        learner1.javaScore = scanner.nextInt();

        // Create and populate the second Student object
        Student learner2 = new Student();
        learner2.id = scanner.nextInt();
        learner2.name = scanner.next();
        learner2.javaScore = scanner.nextInt();

        // Display both records
        System.out.println(learner1.id + " - " + learner1.name + " - " + learner1.javaScore);
        System.out.println(learner2.id + " - " + learner2.name + " - " + learner2.javaScore);

        // Compare both scores and print one result
        if(learner1.javaScore > learner2.javaScore){
            System.out.println(learner1.name + " has the higher Java score.");
        }
        else if(learner1.javaScore < learner2.javaScore){
            System.out.println(learner2.name + " has the higher Java score.");
        }
        else{
            System.out.println("Both students have the same Java score.");
        }
    }
}