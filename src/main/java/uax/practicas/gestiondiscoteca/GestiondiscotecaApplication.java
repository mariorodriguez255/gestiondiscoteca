package uax.practicas.gestiondiscoteca;

import uax.practicas.gestiondiscoteca.models.Guest;
import uax.practicas.gestiondiscoteca.utils.tools;

public class GestiondiscotecaApplication {

	public static void main(String[] args) {
		tools t = new tools();
		Guest g1 = new Guest("23874348A", "Pepe", 18, false);
		System.out.println(t.checkAge(g1));
	}

}
