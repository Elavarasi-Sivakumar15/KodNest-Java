import java.util.Scanner;

class Rectangle {
    int calculateArea(int length, int breadth) {
        return length*breadth;
    }
}

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        Rectangle r = new Rectangle();

        int area = r.calculateArea(length, breadth);

        System.out.println("Area: "+area);
    }
}