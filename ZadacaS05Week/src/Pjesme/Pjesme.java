package Pjesme;

/**
 * ) Napisati klasu Pjesma koja ima podatke o nazivu i duzini trajanja I autoru
 * (pogledati zadatak 1).
 * 
 * @author Sanela
 *
 */
public class Pjesme {

	private String imePjesme;
	private double duzinaTrajanja;
	private Autor autorPjesme;

	public Pjesme() {
		this.imePjesme = "nn";
		this.duzinaTrajanja = 0;
		this.autorPjesme = new Autor();
	}

	public Pjesme(String imePjesme, double duzinaTrajanja) {
		this.imePjesme = imePjesme;
		setDuzinaTrajanja(this.duzinaTrajanja);;
		this.autorPjesme = new Autor();
	}

	public Pjesme(String imePjesme, double duzinaTrajanja, Autor autorNeki) {
		this.imePjesme = imePjesme;
        setDuzinaTrajanja(this.duzinaTrajanja);
		this.autorPjesme = autorNeki;
	}

	


	public String toString() {
		String pjesmaToString = "ime Pjemse: " + imePjesme
				+ "\n duzina trajanja:" + duzinaTrajanja + "\n autor:" + autorPjesme;
				
		return pjesmaToString;
	}

	public String getImePjesme() {
		return imePjesme;
	}

	public void setImePjesme(String imePjesme) {
		this.imePjesme = imePjesme;
	}

	public double getDuzinaPjesme() {
		return duzinaTrajanja;
	}

	public void setDuzinaTrajanja(double duzinaTrajanja) {
		if (this.duzinaTrajanja < 0) {
			duzinaTrajanja = 0.0;

		}
		this.duzinaTrajanja = duzinaTrajanja;
	}

}
