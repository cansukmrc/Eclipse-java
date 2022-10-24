package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Course;

public class JdbcCourseDao implements CourseDao{
 public void add(Course course) {
	 System.out.println("JDBC ile kurs veri tabanına eklendi");
 }
}
