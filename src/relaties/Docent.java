package relaties;

import java.util.ArrayList;

public class Docent extends Persoon {

	private ArrayList<Student> studenten = new ArrayList<Student>();
	private Opleiding opleiding;

	public Docent(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

}