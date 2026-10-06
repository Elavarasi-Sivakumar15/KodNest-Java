import java.util.Scanner;

class Student {
    // Declare id, name, course and javaScore
    int id;
    String name;
    String course;
    double javaScore;
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create one Student object
        Student learner = new Student();
        
        // Read and store all values in the object
        learner.id = scanner.nextInt();
        learner.name = scanner.next();
        learner.course = scanner.next();
        learner.javaScore = scanner.nextDouble();
        
        // Display the values stored in the object
        System.out.println("Student Profile");
        System.out.println("ID: " +learner.id);
        System.out.println("Name: " +learner.name);
        System.out.println("Course: " +learner.course);
        System.out.println("Java Score: " +learner.javaScore);
    }
}