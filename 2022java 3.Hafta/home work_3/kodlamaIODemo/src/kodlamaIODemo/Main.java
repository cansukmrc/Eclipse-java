package kodlamaIODemo;

import java.util.ArrayList;
import java.util.List;

import kodlamaIODemo.business.CategoryManager;
import kodlamaIODemo.business.CourseManager;
import kodlamaIODemo.core.logging.DatabaseLogger;
import kodlamaIODemo.core.logging.FileLogger;
import kodlamaIODemo.core.logging.Logger;
import kodlamaIODemo.core.logging.MailLogger;
import kodlamaIODemo.dataAccess.HibernateCategoryDao;
import kodlamaIODemo.dataAccess.HibernateCourseDao;
import kodlamaIODemo.dataAccess.JdbcCourseDao;
import kodlamaIODemo.entities.Category;
import kodlamaIODemo.entities.Course;
import kodlamaIODemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new MailLogger(), new FileLogger(), new DatabaseLogger() };

		System.out.println("************Kategori**************");

		List<Category> categories = new ArrayList<>();
		Category category1 = new Category();
		category1.setCategoryId(1);
		category1.setCategoryName(" Programlama Kategorisi ");
		Category category2 = new Category();
		category2.setCategoryId(2);
		category2.setCategoryName(" Tasarım Kategorisi ");

		CategoryManager categoryManager = new CategoryManager(categories, new HibernateCategoryDao(), loggers);
		categoryManager.add(category1);
		
		List<Course> courses = new ArrayList<>();
		Course course1 = new Course();
		course1.setCourseName("Java");
		course1.setId(01);
		course1.setUnitPrice(-1);
		
	CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses, loggers);
	courseManager.add(course1);
	
		

	}
}