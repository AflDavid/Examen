package firma.angajati;

public class Main {

	public static void main(String[] args) {
		Angajati id1 = new AngajatCuSalarFix("Costel", 8000);
		Angajati id2 = new AngajatCuSalarFix("Iulia", 7000);

		Angajati idOra1 = new AngajatCuOra("Ionatan", 40, 450);
		Angajati idOra2 = new AngajatCuOra("Sami", 45, 400);
	}
}
