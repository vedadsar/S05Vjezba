package Gorjan;

public class Test {
	public static void main(String[] args) {

		Autor podaciOAutoru = new Autor("Neki lik", "adresa32", "musko");
		Knjiga podaciOKnjizi = new Knjiga("NEKA KNJIGA", 4.00, 7, podaciOAutoru);
		Pjesma podaciOPjesmi = new Pjesma("Neka pjesma", 8, podaciOAutoru);
       Knjizara imeKnjizare = new Knjizara ("Gorjanova Knjizara",podaciOKnjizi);
		
		System.out.println(podaciOAutoru.toString());
		System.out.println(podaciOKnjizi.toString());
		System.out.println(podaciOPjesmi);
	}
}