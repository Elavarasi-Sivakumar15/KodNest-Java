public class LearningReport {
    public static void main(String[] args) {
        String learner = "Meera";
        String language = "Java";
        int completedTopics = 22;
        int totalTopics = 25;
        int solvedProblems = 48;

        double progress = 
                completedTopics * 100.0 / totalTopics;

        String report = 
                learner + " is learning " + language 
                + ". Topics completed: " 
                + completedTopics + "/" + totalTopics 
                + " (" + progress + "%). " 
                + "Problems solved: " 
                + solvedProblems + ".";

        System.out.println(report);
    }
}