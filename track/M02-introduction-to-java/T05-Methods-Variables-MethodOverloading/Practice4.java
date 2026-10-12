import java.util.Scanner;

class Studentutility {
    void displayName(String name) {
        System.out.println("Student: "+name);
    }
}

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        Studentutility utility = new Studentutility();
        utility.displayName(name);
    }
}