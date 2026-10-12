import java.util.Scanner;

class Student {
    String name;

    void setName(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Student Name: "+name);
    }
}

public class Practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Student st = new Student();
        st.setName(name);
        st.displayName();
        scanner.close();
    }
}