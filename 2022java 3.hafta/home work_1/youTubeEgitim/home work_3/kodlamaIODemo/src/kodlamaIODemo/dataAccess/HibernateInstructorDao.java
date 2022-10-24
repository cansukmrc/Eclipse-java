package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eğitmen veri tabanına eklendi");
	}
}
