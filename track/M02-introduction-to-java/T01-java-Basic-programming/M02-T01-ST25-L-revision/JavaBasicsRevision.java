public class JavaBasicsRevision {
    public static void main(String[] args) {
        String name = "Elavarasi";
        String targetRole = "Java Developer";

        int completedTopics = 32;
        int totalTopics = 35;
        int codingDays = 6;
        int solvedProblems = 58;

        double dailyCodingHours = 2.5;

        int remainingTopics =
                totalTopics - completedTopics;

        double weeklyCodingHours =
                codingDays * dailyCodingHours;

        double progressPercentage =
                completedTopics * 100.0 / totalTopics;

        double averageProblemsPerDay =
                (double) solvedProblems / codingDays;

        boolean readyForPractice =
                progressPercentage >= 80
                && averageProblemsPerDay >= 8;

        System.out.println("JAVA LEARNING REPORT");
        System.out.println("Name: " + name);
        System.out.println("Target role: " + targetRole);
System.out.println(
    "Topics completed: "
    + completedTopics + "/" + totalTopics
);
System.out.println(
    "Remaining topics: " + remainingTopics
);
System.out.println(
    "Weekly coding hours: " + weeklyCodingHours
);
System.out.println(
    "Progress: " + progressPercentage + "%"
);
System.out.println(
    "Average problems per day: "
    + averageProblemsPerDay
);
System.out.println(
    "Ready for practice: " + readyForPractice
);
}
}