package app.dataAccess;


import app.entities.Category;
import app.entities.Course;
import app.entities.Educator;

public class HibernateDao implements BaseDao{

	@Override
	public void add(Category category, Course course, Educator educator) {
		System.out.println("Adý " + course.getName().toUpperCase() +" ve egitimcisi " + educator.getName().toUpperCase() + " olan kurs hibernate veritabanýna eklendi" );
	}

}
