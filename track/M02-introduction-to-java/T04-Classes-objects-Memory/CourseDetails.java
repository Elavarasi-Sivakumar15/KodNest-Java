class Course{
String code;
String title;
int durationWeeks;
}
public class CourseDetails{
public static void main(String [] args){

Course javaCourse = new Course();
Course sqlCourse = new Course();

javaCourse.code = "J101";
javaCourse.title = "Java foundations";
javaCourse.durationWeeks = 6;

sqlCourse.code = "S101";
sqlCourse.title ="SQL foundations";
sqlCourse.durationWeeks = 4;

System.out.println("Course 1");
System.out.println(javaCourse.code);
System.out.println(javaCourse.title);
System.out.println(javaCourse.durationWeeks + " weeks");

System.out.println("Course 2");
System.out.println(sqlCourse.code);
System.out.println(sqlCourse.title);
System.out.println(sqlCourse.durationWeeks + " weeks");
}
}





