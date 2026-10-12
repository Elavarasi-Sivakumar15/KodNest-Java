class NumberUtility {
    int getNumber() {
        return 10;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Create object
        NumberUtility n = new NumberUtility();

        int num = n.getNumber();
        System.out.println(num);
    }
}