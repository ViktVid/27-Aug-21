package pack27_08;

import java.util.ArrayList;

public class Liste {

	public static void main(String[] args) {

		ArrayList imena = new ArrayList();
		imena.add("Aca");
		imena.add("Milan");
		imena.add("Milica");
		imena.add("Jovana");
		imena.add("Aca");
		imena.add(4);
		imena.add('w');
		imena.add(true);
		int duzinaListe = imena.size();
		System.out.println(duzinaListe);

		duzinaListe = imena.size();
		System.out.println("Duzina liste pre brisanja " + duzinaListe);
		imena.remove(4);
		duzinaListe = imena.size();
		System.out.println("Duzina liste pre brisanja " + duzinaListe);

		String[] imenaZaDodavanje = { "Jana", "Aleksandra", "Djordje" };
		for (int i = 0; i < imenaZaDodavanje.length; i++) {
			imena.add(imenaZaDodavanje[i]);
		}

		for (int i = 0; i < imena.size(); i++) {
			System.out.println((i + 1) + ". element je " + imena.get(i));
		}

	}

}
