package Knjige;

public class AutorTest {
public static void main(String[] args) {
	
Autor prvi = new Autor();
//System.out.println(prvi);

Autor drugi = new Autor("Sanela" , "sanela@mail.com", "F");
System.out.println(drugi.toString());

System.out.println();

Knjiga prva = new Knjiga("knjiga", 20, 20, drugi);

System.out.println(prva.toString());

}

}