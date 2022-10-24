package kodlamaIODemo.dataAccess;

import kodlamaIODemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {
	public void add(Instructor instructor) {
		System.out.println("JDBC ile eğitmen veri tabanına eklendi");
	}

}
