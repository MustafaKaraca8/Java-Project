package app.bussines;

import java.util.ArrayList;

import app.entities.Category;
import app.entities.Course;

public class �sValid {
	
	ArrayList<String> List = new ArrayList<String>();

	public void add(Category category , Course course) throws Exception {
		if(List.contains(course.getName()) || List.contains(category.getName()) ) {
			throw new Exception("Bu de�erde kurs ad� ve ya kategori ad� bulunmakta!!"); 
	}
		else {
			List.add(course.getName());
			List.add(category.getName());
			System.out.println(course.getName().toUpperCase() + " adl� kursunuz " + category.getName().toUpperCase() + " kategorisine ba�ar�yla eklendi");
		}

	}
		
}
