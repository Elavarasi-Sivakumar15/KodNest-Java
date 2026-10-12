import java.util.Scanner;

class Student {
    int mark;

    void showFinalMark(int bonus) {

        int finalMark=0;
        finalMark = this.mark+bonus;
        System.out.println(this.mark);
        System.out.println(finalMark);
    }
}

public class Practice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.mark = scanner.nextInt();
        int bonus = scanner.nextInt();

        student.showFinalMark(bonus);

        scanner.close();
    }
}