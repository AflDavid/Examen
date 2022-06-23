package firma.angajati;

public abstract class Angajati {

	private String numeAngajat;
	private double salariu;

	public void setNumeAngajat(String numeAngajat) {
		this.numeAngajat = numeAngajat;
	}

	public void setSalariu(double salariu) {
		this.salariu = salariu;
	}

	public String getNumeAngajat() {
		return numeAngajat;
	}

	public double getSalariu() {
		return salariu;
	}

	public abstract double calculSalar();

	@Override
	public String toString() {
		return "Nume angajat: " + numeAngajat;
	}

}
