import java.util.Scanner;
public class LearnerProgressSummary {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the learner details
        String fullName = scanner.nextLine();
        int days = scanner.nextInt();
        int solved =0;
        for(int i=1;i<=days;i++){

            solved += scanner.nextInt();
        }
        // Calculate and display the progress summary
        double dailyAverage = solved / days;
        String status="";

        if(dailyAverage>=5.0){
            status="Consistent";
        }
        else{
            status="Needs consistency";
        }
        System.out.println("Name: "+fullName);
        System.out.println("Total Solved: "+ solved);
        System.out.println("Daily average: "+ dailyAverage);
        System.out.println("Status: "+ status);
    }
}

