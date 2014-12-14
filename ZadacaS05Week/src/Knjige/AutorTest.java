package Knjige;

public class AutorTest {
public static void main(String[] args) {
	
//Autor podaciOAutoru = new Autor("Neki lik", "adresa32", "musko");
//	Knjiga podaciOKnjizi = new Knjiga("NEKA KNJIGA", 4, 7, podaciOAutoru);
//Pjesma podaciOPjesmi = new Pjesma("Neka pjesma", 8, podaciOAutoru);
   
   Bookstore imeKnjizare = new Bookstore ("Gorjanova Knjizara");
   imeKnjizare.addABook("Neka knjiga", 5, 12);
   imeKnjizare.addABook("Neka knjiga", 5, 12);
   imeKnjizare.addABook("Neka knjiga", 5, 12);
   imeKnjizare.addABook("Neka knjiga", 5, 12);
   imeKnjizare.addABook("Neka knjiga", 5, 12);
   imeKnjizare.addABook("Neka knjiga", 5, 12);
   imeKnjizare.addABook("Neka knjiga", 5, 12);

   
  System.out.println(imeKnjizare.toString());
}

}