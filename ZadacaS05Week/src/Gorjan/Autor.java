package Gorjan;

public class Autor {
	private String imeAutora;
	private String mailAutora;
	private String spolAutora;

	public Autor() { // KONSTRUKTOR PRAZAN
		imeAutora = "nema unosa";
		mailAutora = "NNmail";
		spolAutora = "non";
	}

	public Autor(String ime, String mail, String spol) {
		this.imeAutora = ime;
		this.mailAutora = mail;
		this.spolAutora = spol;

	}

	public String toString() { // TO STRING RADI ISPISA
		String autorlString = "Name: " + imeAutora + ", mail: " + mailAutora
				+ ", spol: " + spolAutora;
		return autorlString;
	}

	public String getImeAutora() {
		return imeAutora;
	}

	public void setImeAutora(String imeAutora) {
		this.imeAutora = imeAutora;
	}

	public String getMailAutora() {
		return mailAutora;
	}

	public void setMailAutora(String mailAutora) {
		this.mailAutora = mailAutora;
	}

	public String getSpolAutora() {
		return spolAutora;
	}

	public void setSpolAutora(String spolAutora) {
		this.spolAutora = spolAutora;
	}

}