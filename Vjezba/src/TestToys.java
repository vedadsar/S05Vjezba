public class TestToys {
	public static void main(String[] args) {

		String enterNewToy = "d";
		ToysStore prodavnica = new ToysStore("Vedad");
		while (enterNewToy.equalsIgnoreCase("d")) {

			System.out.println("Unesite ime igracke ");
			String toyName = TextIO.getln();

			System.out.println("Unesite tip igracke ");
			String toyType = TextIO.getln();

			System.out.println("Unesite cijenu igracke ");
			int toyPrice = TextIO.getlnInt();

			System.out.println("Unesite godinu proizvodjne igracke igracke ");
			int toyBuiltYear = TextIO.getlnInt();

			System.out.println("Unesite dobnu restrikciju igracke ");
			int toyAgeRes = TextIO.getlnInt();

			prodavnica.addToy(toyName, toyType, toyPrice, toyBuiltYear,
					toyAgeRes);
          
			System.out.println("Dodati novu igracku ? (upisati d za nastavak");
			enterNewToy = TextIO.getln();
		}
		
	    //prodavnica.sortByBuiltYear();	   
		System.out.println(prodavnica.toString());
		
	}
}
