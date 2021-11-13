package pack27_08;

import java.util.ArrayList;

public class ListaVezba {

	public static void main(String[] args) {

		/*
		 * Napraviti listu od 4 elementa ovim redom: Voli, 3, Ana, Milovana. Potrebno je
		 * obrisati element i sortirati listu da na ispisu pise "Ana Voli Milovana"
		 */

		ArrayList ljubav = new ArrayList();

		ljubav.add("voli");
		ljubav.add(3);
		ljubav.add("Ana");
		ljubav.add("Milovana");

		for (int i = 0; i < ljubav.size(); i++) {
			System.out.println((i + 1) + ". Izjava je " + ljubav.get(i));
		}

		ljubav.remove(1);
		
		Object voli = ljubav.get(0);
		ljubav.set(0, ljubav.get(1));
		ljubav.set(1, voli);

		Object Ana = ljubav.get(2);
		ljubav.set(2, ljubav.get(0));
		ljubav.set(0, Ana);

		for (int i = 0; i < ljubav.size(); i++) {
			System.out.println((i + 1) + ". element je " + ljubav.get(i));
		}
	}

}

/*package Liste;

import java.util.ArrayList;

public class ListeZadatak {
    public static void main(String[] args) {

        ArrayList elementi = new ArrayList();
        elementi.add("Voli");
        elementi.add(3);
        elementi.add("Ana");
        elementi.add("Milovana");

        elementi.remove(1);

        Object voli = elementi.get(0);
        elementi.set(0, elementi.get(1));
        elementi.set(1, voli);

        for (int i = 0 ; i < elementi.size(); i++) {
            System.out.print(elementi.get(i) + " ");
        }


    }
}*/
