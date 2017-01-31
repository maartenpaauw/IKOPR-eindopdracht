package relaties;

import java.util.ArrayList;

public class Onderwijsmanager extends Persoon {

	private ArrayList<Docent> docenten = new ArrayList<Docent>();
	private Secretaresse secretaresse;
	private Opleiding opleiding;

	public Onderwijsmanager(String naam, int leeftijd, double lengte, double gewicht) {
		super(naam, leeftijd, lengte, gewicht);
	}

}