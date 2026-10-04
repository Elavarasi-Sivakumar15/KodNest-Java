import java.util.Scanner;

public class MinutesToHour{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read total minutes
        int totalMinutes = scanner.nextInt();
        // Calculate hours and remaining minutes
        int hours = totalMinutes/60;
        int minutes = totalMinutes % 60;
        // Print both results
        System.out.println("Hours: " +hours);
        System.out.println("Minutes: "+minutes);
        scanner.close();
    }
} 