package pack27_08;

import java.util.ArrayList;

public class Liste1 {

	public static void main(String[] args) {

		ArrayList voce = new ArrayList();

		voce.add("Breskva");
		voce.add("Kruska");
		voce.add("Visnja");

		for (int i = 0; i < voce.size(); i++) {
			System.out.println((i + 1) + ". element je " + voce.get(i));
		}

		Object alt = voce.get(1);
		voce.set(1, voce.get(2));
		voce.set(2, alt);

		for (int i = 0; i < voce.size(); i++) {
			System.out.println((i + 1) + ". element je " + voce.get(i));
		}

		// Pogresan nacin
		voce.set(1, voce.get(2));
		voce.set(2, voce.get(1));

		for (int i = 0; i < voce.size(); i++) {
			System.out.println((i + 1) + ". element je " + voce.get(i));

		}
	}
}
