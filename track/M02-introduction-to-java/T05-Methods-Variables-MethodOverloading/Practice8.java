import java.util.Scanner;

class StudentResult {
    void showTitle() {
        System.out.println("Student Result");
    }

    void displayName(String name) {
        System.out.println("Name: " +name);
    }

    int getPassingMark() {
        return 40;
    }

    int calculateAverage(int first, int second) {
        int a = (first+second)/2;
        return a;
    }
}

public class Practice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        StudentResult sr = new StudentResult();

        sr.showTitle();
        sr.displayName(name);
        int passMark = sr.getPassingMark();
        int average = sr.calculateAverage(first,second);

        System.out.println("Passing Mark: "+passMark);
        System.out.println("Average: "+average);
    }
}