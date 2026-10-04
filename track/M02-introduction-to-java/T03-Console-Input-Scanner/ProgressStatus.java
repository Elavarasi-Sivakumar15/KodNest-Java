import java.util.Scanner;
public class ProgressStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int days = scanner.nextInt();
        int total=0;
        for(int i=1;i<= days;i++){
            int solved = scanner.nextInt();
            total+=solved;
        }
        scanner.close();
        if(total>=20){
            System.out.println("Total solved: "+ total);
            System.out.println("Status: Strong progress");
        }
        else if(total>=10){
            System.out.println("Total solved: "+ total);
            System.out.println("Status: Keep improving");
        }
        else{
            System.out.println("Total solved: " + total);
            System.out.println("Status: Needs more practice");
        }
    }
}

