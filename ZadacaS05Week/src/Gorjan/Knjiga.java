package Gorjan;

public class Knjiga {
	private String nazivKnjige;
	private double cijenaKnjige;
	private int stanje;
	private Autor autor;

	public Knjiga() {
		this.nazivKnjige = "NN";
		this.cijenaKnjige = 0.00;
		this.stanje = 0;
	}

	public Knjiga(String nazivKnjige, double cijenaknjige, int stanje,
			Autor podaci) {
		this.nazivKnjige = nazivKnjige;
		this.cijenaKnjige = cijenaknjige;
		this.stanje = stanje;
		//this.autor = new Autor(podaci);
		Autor(podaci);

	}

	public Knjiga(Knjiga podaci) {
		
	}

	private void Autor(Autor podaci) {
		this.autor = podaci;

	}

	public String toString() {
		String printOut = "";
		String autor = this.autor.getImeAutora();
		printOut = "Naziv knjige: " + nazivKnjige + ", Cijena knjige: "

		+ cijenaKnjige + ", Na lageru komada: " + stanje + " "
				+ this.autor.toString() + autor;
		return printOut;
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}

	public void setNazivKnjige(String nazivKnjige) {
		this.nazivKnjige = nazivKnjige;
	}

	public double getCijenaKnjige() {
		return cijenaKnjige;
	}

	public void setCijenaKnjige(double cijenaKnjige) {
		this.cijenaKnjige = cijenaKnjige;
	}

	public int getStanje() {
		return stanje;
	}

	public void setStanje(int stanje) {
		this.stanje = stanje;
	}

}