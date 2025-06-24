package instanceoffline;

public class Executor {

	public static void main (String args[]) {
		Phone p1 = Phonefactory.createphone("Samsung");
		p1.call();
		p1.sms();
		
		Phone P1 = Phonefactory.createphone("Jio");
		p1.call();
		p1.sms();
		
	}

}
