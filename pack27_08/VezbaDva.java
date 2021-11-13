package pack27_08;

import java.util.Scanner;

public class VezbaDva {

	/*
	 * Program prima 5 privatnih atributa (jmbg, ime i prezime, broj dece, stepen
	 * strucne spreme i radni staz). Potrebno je da nam program izracuna platu, da
	 * li je korisniku odobren kredit na osnovu plate i koliko ima slobodnih dana.
	 * Platu racunamo tako sto saberemo koeficijent i minuli rad, to pomnozimo sa
	 * 10000 i na to dodamo 2500. Koeficijent racunamo zavisno od stepena strucne
	 * spreme. Za stepen 1 koeficijent je 1.03, za 2 je 1.65, za 3 je 2, za 4 je
	 * 2.27, za 5 je 2.88, za 6 je 3.09, za 7 je 3.40, za 8 je 4.12. Minuli rad je
	 * 0.05 ako je radni staz ispod 10 godina, 0.75 ako je ispod 20 godina, 1 ako je
	 * preko 20 godina. Kredit je odobren ako korisnik ima platu preko 50 000.
	 * Korisnik ima slobodnih dana zavisno od broja dece, svako ima 22 slobodna
	 * dana, a ljudi sa decom imaju dodatna 2 dana po detetu.
	 */

	Scanner s = new Scanner(System.in);

	private long jmbg;
	private String imePrezime;
	private int stepenStrucneSpreme;
	private int radniStaz;
	private int brojDece;

	public VezbaDva(long jmbg, String imePrezime, int stepenStrucneSpreme, int radniStaz, int brojDece) {
		this.brojDece = brojDece;
		this.imePrezime = imePrezime;
		this.radniStaz = radniStaz;
		this.stepenStrucneSpreme = stepenStrucneSpreme;
		this.jmbg = jmbg;
	}

	public double koeficijent() {
		double koeficijent = 0;
		switch (this.stepenStrucneSpreme) {
		case 1:
			koeficijent = 1.03;
			break;
		case 2:
			koeficijent = 1.65;
			break;
		case 3:
			koeficijent = 2.00;
			break;
		case 4:
			koeficijent = 2.27;
			break;
		case 5:
			koeficijent = 2.88;
			break;
		case 6:
			koeficijent = 3.89;
			break;
		case 7:
			koeficijent = 4.12;
			break;
		}
		return koeficijent;

	}

	public double minuliRad() {
		if (this.radniStaz < 10) {
			return 0.05;
		} else if (this.radniStaz < 20) {
			return 0.75;
		} else {
			return 1.00;
		}
	}

	public double plata() {
		double k = this.koeficijent();
		double mr = this.minuliRad();
		return (k + mr) * 10000 + 2500;
	}

	public boolean kreditOdobren() {
		double plata = this.plata();
		return plata > 50000;
	}

	public int slobodniDani() {
		return (this.brojDece + 2) + 22;
	}

	public void stampanje() {
		System.out.println("Zaposleni " + this.imePrezime + " sa maticnim brojem " + this.jmbg + " ima platu "
				+ this.plata() + " za " + this.radniStaz + " godina radnog staza. Zaposleni je "
				+ this.stepenStrucneSpreme + ", stepen strucne spreme." + "Da li je kredit odobren?"
				+ this.kreditOdobren() + ". I ima " + this.slobodniDani() + " slobodnih dana godisnje.");
	}
}

/* public double koeficijent() {
        double koeficijent = 0;
        switch (this.stepenStrucneSpreme) {
            case 1:
                koeficijent = 1.03;
                break;
            case 2:
                koeficijent = 1.65;
                break;
            case 3:
                koeficijent = 2.00;
                break;
            case 4:
                koeficijent = 2.27;
                break;
            case 5:
                koeficijent = 2.88;
                break;
            case 6:
                koeficijent = 3.09;
                break;
            case 7:
                koeficijent = 3.40;
                break;
            case 8:
                koeficijent = 4.12;
                break;

        } return koeficijent;
    }

    public double minuliRad() {
        if (this.radniStaz < 10) {
            return 0.05;
        } else if (this.radniStaz < 20) {
            return 0.75;
        } else {
            return 1.0;
        }
    }

    public double plata() {
        double k = this.koeficijent();
        double mr = this.minuliRad();
        return 2500 + (k + mr) * 10000;
    }

    public boolean kreditSposoban() {
        double plata = this.plata();
        return plata > 5000;
    }

    public int daniGodisnje() {
        return 22 + (this.brojDece * 2);
    }
} */
