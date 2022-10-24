package kodlamaIODemo.business;

import java.util.List;

import kodlamaIODemo.core.logging.Logger;
import kodlamaIODemo.dataAccess.CourseDao;
import kodlamaIODemo.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao,List<Course> courses,Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {
		for (Course newCourse : courses) {
			if (course.getCourseName() == newCourse.getCourseName()) {
				throw new Exception("Kurs adı tekrarlanamaz");
			}
			  if (course.getUnitPrice() < 10) {
				throw new Exception("Kursun fiyatı 0 dan küçük olamaz");
			   }
			courseDao.add(course);
			courses.add(course);
			

			for (Logger logger : loggers) {
				logger.log(course.getCourseName());
			}
		}

	}

}
