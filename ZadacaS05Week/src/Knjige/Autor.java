package Knjige;

public class Autor {

	private String ime;
	private String mail;
	private String spol;

	public Autor() { // KONSTRUKTOR PRAZAN
		ime = "NN";
		mail = "NNmail";
		spol = "non";
	}

	public Autor(String ime, String mail, String spol) {
		this.ime = ime;
		this.mail = mail;
		this.spol = spol;

	}

	public String toString() { // TO STRING RADI ISPISA
		String autorlString = "Name: " + ime + "\nMail: " + mail + "\nSpol: "
				+ spol;
		return autorlString;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSpol() {
		return spol;
	}

	public void setSpol(String spol) {
		this.spol = spol;
	}

}
