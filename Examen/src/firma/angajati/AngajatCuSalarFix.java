package firma.angajati;

public class AngajatCuSalarFix extends Angajati {

	private String numeAngajat;
	private double salariuFix;

	public AngajatCuSalarFix() {
	}

	public AngajatCuSalarFix(String name, double salarFix) {
		this.numeAngajat = numeAngajat;
		this.salariuFix = salarFix;
		System.out.println("Nume angajat " + numeAngajat + " salariu " + calculSalar());
	}

	public String getNumeAngajat() {
		return numeAngajat;
	}

	public void setNumeAngajat(String numeAngajat) {
		this.numeAngajat = numeAngajat;
	}

	public double calculSalar() {
		return salariuFix;
	}

	public double getSalarFix() {
		return salariuFix;
	}

	public void schimbaSalarFix(double salarNou) {
		this.salariuFix = salarNou;
	}

	@Override
	public String toString() {
		return "angajat cu salariul fix" + numeAngajat + " salariu = " + salariuFix;
	}
}
