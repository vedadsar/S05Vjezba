package Gorjan;

public class Knjizara {
	private String imeKnjizare;
	private int brojKnjiga;
	private Knjiga[] nizKnjiga;
	private Knjiga knjiga;

	private Autor autor;

	public Knjizara(String imeKnjizare, Knjiga podaci) {
		this.imeKnjizare = imeKnjizare;
		knjigaPodaci(podaci);
		brojKnjiga = 0;
		//add();
	}

	public void knjigaPodaci(Knjiga podaci) {
		this.knjiga = podaci;

	}

	public void add() {
    	nizKnjiga[brojKnjiga] = new Knjiga();
       
	}

	public String getImeKnjizare() {
		return imeKnjizare;
	}

	public void setImeKnjizare(String imeKnjizare) {
		this.imeKnjizare = imeKnjizare;
	}

	public int getBrojKnjiga() {
		return brojKnjiga;
	}

	public void setBrojKnjiga(int brojKnjiga) {
		this.brojKnjiga = brojKnjiga;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public String toString(String imeKnjizare, int brojKnjiga) {
		String ispis = "";
		ispis = "Ime knjizare: " + imeKnjizare + " Kolicina knjiga na stanju: "
				+ brojKnjiga + "Ime autora: " + this.autor.getImeAutora();
		return ispis;
	}
}