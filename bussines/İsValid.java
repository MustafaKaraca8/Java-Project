package app.bussines;

import java.util.ArrayList;

import app.entities.Category;
import app.entities.Course;

public class ÝsValid {
	
	ArrayList<String> List = new ArrayList<String>();

	public void add(Category category , Course course) throws Exception {
		if(List.contains(course.getName()) || List.contains(category.getName()) ) {
			throw new Exception("Bu deðerde kurs adý ve ya kategori adý bulunmakta!!"); 
	}
		else {
			List.add(course.getName());
			List.add(category.getName());
			System.out.println(course.getName().toUpperCase() + " adlý kursunuz " + category.getName().toUpperCase() + " kategorisine baþarýyla eklendi");
		}

	}
		
}
