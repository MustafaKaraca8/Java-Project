package app.core;

public class MailLogger implements Logger{

	@Override
	public void log(String text) {
		System.out.println(text.toUpperCase() + " adl� kurs maile logland�");
	}
}
