public class PercentageDemo {
    public static void main(String[] args) {
      int obtainedMarks = 421;
      int totalMarks = 500;
      double incorrect = obtainedMarks/totalMarks*100;
      double correct= obtainedMarks*100.0/totalMarks;
      System.out.println("Incorrect:"+incorrect);
      System.out.println("Correct:"+correct);
    }
}
