package Gorjan;

public class Pjesma {
	private String pjesmaIme;
	private int pjesmaDuzina;
	private Autor autorPodaci;

	public Pjesma(String imePjesme, int duzinaPjesme, Autor podaciOAutoru) {
		this.pjesmaIme = imePjesme;
		this.pjesmaDuzina = duzinaPjesme;
		
		autorPodaci(podaciOAutoru);

	}

	public String getPjesmaIme() {
		return pjesmaIme;
	}

	public void setPjesmaIme(String pjesmaIme) {
		this.pjesmaIme = pjesmaIme;
	}

	public int getPjesmaDuzina() {
		return pjesmaDuzina;
	}

	public void setPjesmaDuzina(int pjesmaDuzina) {
		this.pjesmaDuzina = pjesmaDuzina;
	}

	public Autor getAutorPodaci() {
		return autorPodaci;
	}

	public void setAutorPodaci(Autor autorPodaci) {
		this.autorPodaci = autorPodaci;
	}

	private void autorPodaci(Autor podaciAutor) {
		this.autorPodaci = podaciAutor;

	}

	public String toString() {
		String ispis = "";
		ispis = "Ime pjesme:  " + pjesmaIme + "  Duzina pjesme:  "
				+ pjesmaDuzina + "  " + autorPodaci.getImeAutora();

		return ispis;
	}

}