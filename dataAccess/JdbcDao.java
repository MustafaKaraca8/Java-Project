package app.dataAccess;

import app.entities.Category;
import app.entities.Course;
import app.entities.Educator;

public class JdbcDao implements BaseDao{

	@Override
	public void add(Category category, Course course, Educator educator) {
		System.out.println("Kurs ad� " + course.getName() +"ve egitimcisi " + educator.getName() + "olan kurs Jdbc veritaban�na eklendi" );
	}

}
