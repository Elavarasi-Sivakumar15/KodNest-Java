
public class WeeklyPreparation {
   public static void main(String[] args) {
       int javaHours = 2;
       int aptitudeHours = 1;
       int weekDays = 5;
       int weeklyJavaHours = javaHours*weekDays;
       int weeklyAptitudeHours = aptitudeHours*weekDays;
       int totalHours = weeklyJavaHours+weeklyAptitudeHours;

       System.out.println("Weekly java hours: "+weeklyJavaHours);
       System.out.println("Weekly aptitude hours: "+weeklyAptitudeHours);
       System.out.println("Total hours: "+totalHours);
   }   
}
