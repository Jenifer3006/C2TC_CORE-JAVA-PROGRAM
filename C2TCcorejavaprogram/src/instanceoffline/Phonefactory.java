package instanceoffline;

public class Phonefactory {

	public static Phone createphone(String company) {
	if (company.equalsIgnoreCase("Samsung"))
	  return new Samsung();
	else if (company.equalsIgnoreCase("Jio"))
		return new Jio();
	return null;
	
	
}

}
