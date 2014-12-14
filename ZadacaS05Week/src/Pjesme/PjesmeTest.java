package Pjesme;
/**
 * Napisati klasu Pjesma koja ima podatke o nazivu i duzini trajanja I autoru (pogledati zadatak 1). 
 * @author Sanela
 *
 */
public class PjesmeTest {
public static void main(String[] args) {
	
Autor sanela = new Autor("sanela", "sanela@gmail.com", "F");
//System.out.println(sanela.toString());
Pjesme nekaPesma = new Pjesme("Vedad", -5, sanela);
System.out.println(nekaPesma.toString());
}	
}
