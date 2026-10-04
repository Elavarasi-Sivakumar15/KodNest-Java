import java.util.Scanner;
public class ExpenseCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read income and expenses
        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();
         // Calculate and display the budget details  
        double totalAmount = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalAmount;
     
        String status = "";
        if(remainingAmount>=0){
            status="Within budget";
        }
        else {
            status="Over budget";
        }
        System.out.println("Total expense: "+totalAmount);
        System.out.println("Remaining: "+remainingAmount);
        System.out.println("Status: "+status);
        scanner.close();
    }
}
