import java.util.Scanner;

class Result {
    void show(int mark) {
        String message;
        if (mark >= 60) {
            message = "Eligible";
        } else {
            message = "Keep Practising";
        }
        System.out.println(message);
    }
}

public class Practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = scanner.nextInt();

        Result result = new Result();
        result.show(mark);

        scanner.close();
    }
}