package Knjige;

public class Knjiga {

	private String naziv;
	private int cijena;
	private int stanje;
	private Autor autorKnjige;
	private String ime;
	private String mail;
	private String spol; 
	
	

	Knjiga(){ // konstruktor
	naziv = "nemaNaziva";
	cijena = 0;
	stanje = 0;
	this.autorKnjige = new Autor();
	}
	
	public Knjiga(String naziv, int cijena, int stanje){ // konstruktor 2
		this.setNaziv(naziv);
		this.setCijena(cijena);
		this.setStanje(stanje);
		this.autorKnjige = new Autor();
		}
	

	/**
	 * Konstruktor kopija
	 * @param other
	 * @return
	 */
	public Autor otherAutor(Autor other){
		this.ime = other.getIme();
		 this.mail = other.getMail();
		 this.spol = other.getSpol();	
		 return other;
		}
	
	
	Knjiga(String naziv, int cijena, int stanje, Autor autorKnjige){ // konstruktor 2
	this.naziv = naziv;
	this.cijena = cijena;
	this.stanje = stanje;
     this.autorKnjige = otherAutor(autorKnjige);
	
	
	
			
	
	}
	
	
	public String toString() { // TO STRING RADI ISPISA
		String knjigaToString = "Name: " + naziv + "\nCijena: " + cijena + "\nStanje: "
				+ stanje + "\nAutor"+ autorKnjige +"\n\n";
		return knjigaToString;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getCijena() {
		return cijena;
	}

	public void setCijena(int cijena) {
		this.cijena = cijena;
	}

	public int getStanje() {
		return stanje;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}

	public Autor getAutorKnjige() {
		return autorKnjige;
	}

	public void setAutorKnjige(Autor autorKnjige) {
		this.autorKnjige = autorKnjige;
	}
	
	
}
