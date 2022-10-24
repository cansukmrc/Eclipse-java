package kodlamaIODemo.business;

import java.util.List;

import kodlamaIODemo.core.logging.Logger;
import kodlamaIODemo.dataAccess.InstructorDao;
import kodlamaIODemo.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private List<Logger> loggers;

	public InstructorManager(InstructorDao instructorDao,List<Logger> loggers) {
		
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		System.out.println("Eğitmen eklendi");
		
		for(Logger logger:loggers) {
			logger.log(instructor.getInstructionName());
		}
	}
}
