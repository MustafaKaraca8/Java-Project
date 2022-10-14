package app.entities;

public class Course extends Abstract{
	
	private double price;

	public Course(int id, String name, double price) {
		super(id, name);
		this.price=price;
	}
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
