
public class Operators {
    public static void main(String[] args) {
        int completed = 18;
        int total = 25;
        int practiceHours = 12;
        boolean projectSubmitted = true;

        int remaining = total - completed;
        double progress = 
            completed * 100.0 / total;

        boolean consistent = 
            practiceHours >= 10;
        boolean ready = 
            progress >= 70
            && consistent
            && projectSubmitted;

        System.out.println("Remaining topics: " + remaining);
        System.out.println("Progress: " + progress + "%");
        System.out.println("Ready: " + ready);
    }
}