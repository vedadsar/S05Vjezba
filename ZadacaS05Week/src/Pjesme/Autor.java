package Pjesme;

public class Autor {

	private String ime;
	private String mail;
	private String spol;

	public Autor() { // konstruktor prazni
		this.ime = "NN";
		this.mail = "example@example.ba";
		this.spol = "F/M";

	}

	public Autor(String ime, String mail, String spol) { // konstruktor 2
		this.ime = ime;
		this.mail = mail;
		this.spol = spol;

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

	public String toString() {
		String autor = "ime: " + ime + ";\nMail: " + mail + "; \nSpol: " + spol;
		return autor;
	}
}
