package app.core; 

public class DataLogger implements Logger{

	@Override
	public void log(String text) {
		System.out.println(text.toUpperCase() + " adl� kurs dataya logland�");
	}

}
