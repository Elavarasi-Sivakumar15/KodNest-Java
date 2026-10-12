import java.util.Scanner;

class NumberUtility {
    int getLarger(int first, int second) {
        if(first>second){
            return first;
        }
        else if(second>first){
            return second;
        }
        return first;
    }
}

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        NumberUtility utility = new NumberUtility();
        int result = utility.getLarger(first,second);
        System.out.println(result);
    }
}