import java.util.Scanner;

class Student {
    int registrationId;
    String name;
    double attendancePercentage;
}

public class StudentDetails2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        s1.registrationId = scanner.nextInt();
        s1.name = scanner.next();
        s1.attendancePercentage = scanner.nextDouble();

        Student s2 = new Student();
        s2.registrationId = scanner.nextInt();
        s2.name = scanner.next();
        s2.attendancePercentage = scanner.nextDouble();

        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;
        if (selectedId == s1.registrationId) {
            selectedStudent = s1;
        } else if (selectedId == s2.registrationId) {
            selectedStudent = s2;
        }

        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println(s1.registrationId + " - " + s1.name + " - " + s1.attendancePercentage + "%");

        System.out.println(s2.registrationId + " - " + s2.name + " - "+ s2.attendancePercentage + "%");

        scanner.close();
    }
}