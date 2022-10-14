package app.dataAccess;

import app.entities.Category;
import app.entities.Course;
import app.entities.Educator;

public interface BaseDao {

	void add(Category category , Course course , Educator educator);
}
