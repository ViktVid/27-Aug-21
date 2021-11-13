package pack27_08;

public class VezbaDvaMain {

	public static void main(String[] args) {

	    VezbaDva r1 = new VezbaDva(1234567890123L, "Radnik Radic", 3, 4, 3);
        r1.stampanje();
        VezbaDva r2 = new VezbaDva(1231231231231L, "Milica Jovanovic", 8, 21, 4);
        r2.stampanje();
	}

}
/*package KlaseRadnik;

public class GlavnaKlasaAlt {
    public static void main(String[] args) {

        RadnikAlt ra1 = new RadnikAlt();
        ra1.setImeIPrezime("Zeljko Ilic");
        ra1.setJmbg(1231231231L);
        ra1.setBrojDece(3);
        ra1.setRadniStaz(19);
        ra1.setStepenStrucneSpreme(3);
        ra1.stampanjeAlt();


    }
} */