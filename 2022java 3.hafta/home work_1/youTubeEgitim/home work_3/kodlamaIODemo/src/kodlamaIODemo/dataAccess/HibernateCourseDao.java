package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Course;

public class HibernateCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Hibernate ile kurs veri tabanına eklendi");
	}
}
