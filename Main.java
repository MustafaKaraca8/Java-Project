package app;

import app.bussines.BaseManager;
import app.bussines.ÝsValid;
import app.core.DataLogger;
import app.core.Logger;
import app.core.MailLogger;
import app.dataAccess.HibernateDao;
import app.entities.Category;
import app.entities.Course;
import app.entities.Educator;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ÝsValid isValid = new ÝsValid();
		Logger [] loggers = {new DataLogger(),new MailLogger()};
		BaseManager baseManager = new BaseManager(new HibernateDao(), loggers);
		
		Course course1 = new Course(1,"Java",100);
		Category category1 = new Category(1, "Backend");
		Educator educator1 = new Educator(1, "Mustafa");
		isValid.add(category1, course1);
		baseManager.add(course1, category1, educator1);
		
		Course course2 = new Course(2,"Pyhton",3);
		Category category2 = new Category(2, "Frontend");
		Educator educator2 = new Educator(2, "Samet");
		isValid.add(category2, course2);
		baseManager.add(course2, category2, educator2);
		
		
		
		
	}

}





















