package firma.angajati;

public class AngajatCuOra extends Angajati {
	private String numeAngajat;
	private int nrOre;
	private double pretOra;

	public AngajatCuOra() {
	}

	public AngajatCuOra(String name, int ore, double salarFix) {
		this.numeAngajat = numeAngajat;
		this.nrOre = nrOre;
		this.pretOra = salarFix;
		System.out.println("salatriu angajatului " + name + " = " + calculSalar());
	}

	public double calculSalar() {
		return pretOra * nrOre;
	}

	public String getNumeAngajat() {
		return numeAngajat;
	}

	public void setNumeAngajat() {
		this.numeAngajat = numeAngajat;
	}

	public int getNrOre() {
		return nrOre;
	}

	public void setNrOre(int nrOre) {
		this.nrOre = nrOre;
	}

	public double getPretOra() {
		return pretOra;
	}

	public void schimbaSalarPeOra(double pretOra) {
		this.pretOra = pretOra;
	}

	public void adaugaOre(int oreAvans) {
		this.nrOre += oreAvans;
	}

	@Override
	public String toString() {
		return "Angajat platit pe ora: " + numeAngajat + "nr ore = " + nrOre + "salariu pe ora = " + pretOra;
	}

}
