package app.bussines;

import app.core.Logger;
import app.dataAccess.BaseDao;
import app.entities.Category;
import app.entities.Course;
import app.entities.Educator;

public class BaseManager {

	
	private BaseDao data ;
	private Logger [] loggers;
	 �sValid isValid;
		
		public BaseManager(BaseDao data, Logger[] loggers) {
			super();
			this.data = data;
			this.loggers = loggers;
		}
		
		
		public void add(Course course,Category category , Educator educator) throws Exception{
			if(course.getPrice()<0) {
				throw new Exception("Kurs fiyat� 0TL'den b�y�k olmal�");
			}
			else {
				data.add(category, course, educator);
				for (Logger logger : loggers) {
					logger.log(course.getName());
				}
			}
		}
		
	}
		
		
