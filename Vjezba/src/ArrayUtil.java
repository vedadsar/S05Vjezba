public class ArrayUtil {
	/**
	 * Funkcija koja ispisuje uneseni niz
	 * 
	 * @param array
	 *            niz koji cemo ispisati
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * Funkcija prima parametar size(velicinu niza), i od korisnika trazi da u
	 * niz unese toliko brojeva.
	 * 
	 * @param size
	 *            velicina niza
	 * @return popunjen niz.
	 */
	public static int[] getUserArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Unesite " + (i + 1) + " clan niza");
			array[i] = TextIO.getInt();
		}

		return array;
	}

	/**
	 * Funkcija prima velicinu niza, i vrijednost kojom ce ispuniti niz. Ako je
	 * unesena vrijednost -1, funkcija ce popuniti niz sa -1.
	 * 
	 * @param size
	 *            velicina niza
	 * @param defaultVal
	 *            vrijednost kojom zelimo popuniti niz
	 * @return popunjen niz
	 */
	public static int[] getArray(int size, int defaultVal) {
		int[] array = new int[size];

		for (int i = 0; i < array.length; i++) {
			array[i] = defaultVal;
		}
		return array;
	}

	/**
	 * Funkcija kopira drugi niz u prvi niz.(vrijednosti prvog niza copiramo u
	 * drugi niz.)
	 * 
	 * @param niz1
	 *            = niz koji kopiramo
	 * @param niz2
	 *            = niz preko kojeg cemo kopirati.
	 * @return = kopirani niz1.
	 */
	public static int[] copyArray(int[] niz1, int[] niz2) {

		// Kada su nizovi jednaki
		if (niz1.length <= niz2.length) {
			copyNiz(niz1, niz2);
		}

		// Kada je prvi niz veci od drugog.
		if (niz1.length > niz2.length) {
			niz2 = new int[niz1.length];
			copyNiz(niz1, niz2);
		}

		return niz2;
	}

	/**
	 * Funkcija kopira niz 1 preko niza 2.
	 * @param niz1 niz kojeg cemo kopirati
	 * @param niz2 niz preko kojeg kopiramo.
	 */
	private static void copyNiz(int[] niz1, int[] niz2) {

		for (int i = 0; i < niz1.length; i++) {
			niz2[i] = niz1[i];
		}

	}
/**
 * Funkcija pomjera neki niz u desno, svaki index niza ce se pomjeriti za jedno
 * mjesto u desno, a prvi clan ce biti 0.
 * @param niz niz kojeg cemo pomjeriti
 * @return pomjereni niz.
 */
	public static int[] pomjeriUDesno(int[] niz) {
		int[] nizPomjerenUDesno = new int[niz.length];
		for (int i = 1; i < nizPomjerenUDesno.length; i++) {
			nizPomjerenUDesno[0] = 0;
			nizPomjerenUDesno[i] = niz[i - 1];
		}
		return nizPomjerenUDesno;
	}
/**
 * Funkcija pomjera niz u lijevo,  svaki clan ce se pomjeriti za jedan index u lijevo,
 * a zadnji clan ce biti 0.
 * @param niz neki niz kojeg cemo pomjeriti
 * @return pomjereni niz
 */
	public static int[] pomjeriULijevo(int[] niz) {
		int[] nizPomjerenULijevo = new int[niz.length];
		for (int i = 0; i < nizPomjerenULijevo.length - 1; i++) {
			nizPomjerenULijevo[i] = niz[i + 1];
		}
		return nizPomjerenULijevo;
	}
/**
 * Funkcija u dvodimnenzionalnom nizu pronalazi kolonu pod nekim indexom, i tu kolonu
 * ubacuje u jednodimenzionalni niz.
 * @param matrica bilo koja matrica.
 * @param indexKolone integer, indeks kolone koju zelimo izdvojiti
 * @return niz, kolona pod rednim brojem indexKolone koju cemo izdvojiti u niz.
 */
	public static int[] ispisiKolonuMatrice(int[][] matrica, int indexKolone) {
		int[] kolona = new int[matrica.length];
		
		for (int i = 0; i < matrica.length; i++) {
			kolona[i] = matrica[i][indexKolone];
		}
		return kolona;
	}
	/**
	 * Funkcija kreira matricu.
	 * @param brojRedova broj redova matrice
	 * @param brojKolona broj kolona matrice
	 * @return matrica koju smo unijeli
	 */
	public static int[][] getTwoDimArray ( int brojRedova, int brojKolona){
		int[][] matrica = new int [brojRedova][brojKolona];
		
		for(int i=0; i<matrica.length;i++){
			for(int j=0; j<matrica[i].length;j++){
				matrica[i][j]=TextIO.getInt();
			}
		}
		return matrica;
	}
/**
 * Funkcija ispisuje dvodimenzionalni niz ( matricu )
 * @param matrica
 */
	public static void printTwoDimArray(int[][] matrica){
		for(int i=0; i<matrica.length;i++){
			for(int j=0;j<matrica[i].length;j++){
				System.out.print(matrica[i][j] +" ");
			}
			System.out.println();
		}
	}
/**
 * Funkcija trazi broj unutar nekog niza i ispisuje index tog broja u nizu.
 * Ukoliko broj ne postoji u nizu, funkcija vraca -1.
 * @param niz bilo koji niz integera
 * @param trazeniBroj broj koji trazimo u nizu
 * @return index trazenog broja u nizu.
 */
	public static int trazenjeBrojaUNizu( int[] niz, int trazeniBroj){
		
		for(int i=0;i<niz.length;i++){
			if(niz[i] == trazeniBroj)
				return i;
		}
		return -1;
	}
	/**
	 * Funkcija sortira niz po vrijednostima, u zavisnosti od parametra poredak
	 * sortirat ce ili od veceg ka manjem ili obrnuto.
	 * @param niz niz koji cemo sortirati
	 * @param poredak boolean vrijednost, true za od manjeg ka vecem, false za obrnuto.
	 * @return sortirani niz.
	 */
	public static int [] sortiranjeNiza ( int[] niz, boolean poredak){
			if(poredak){
			sortiranjeOdManjeg(niz);
			return niz;
		}
			sortiranjeOdVeceg(niz);
			return niz;
	}
/**
 * private funkcija za sortiranje niza, od veceg broja ka manjem
 * @param niz niz koji cemo sortirati
 * @return sortirani niz
 */
	private static int []  sortiranjeOdVeceg(int[] niz) {

		int temp; // Privremeni broj koji ce nam pomoci da zamjenimo vrijednosti dva broja.
		for (int i = 0; i < (niz.length - 1); i++) {
			for (int j = 0; j < niz.length - i - 1; j++) {
			// If petlja provjerava ako je niz(j) < niz(j+1). Ako jeste zamjeni im mjesta i nastavlja dalje.
				if (niz[j] < niz[j + 1]) {
					temp = niz[j]; // spasimo vrijednost pod j u temp
					niz[j] = niz[j + 1]; // j+1 premjestimo u j.
					niz[j + 1] = temp; // j+1 damo proslu vrijednost j koju smo spremili u temp.
				}
			}
		}

		return niz;
	}
	/**
	 * Funkcija za sortiranje niza, od manjeg ka vecem.
	 * @param niz niz koji cemo sortirati
	 * @return sortirani niz
	 */
	private static int []  sortiranjeOdManjeg(int[] niz) {

		int temp; // Privremeni broj koji ce nam pomoci da zamjenimo vrijednosti dva broja.
		for (int i = 0; i < (niz.length - 1); i++) {
			for (int j = 0; j < niz.length - i - 1; j++) {
			// If petlja provjerava ako je niz(j) > niz(j+1). Ako jeste zamjeni im mjesta i nastavlja dalje.
				if (niz[j] > niz[j + 1]) {
					temp = niz[j]; // spasimo vrijednost pod j u temp
					niz[j] = niz[j + 1]; // j+1 premjestimo u j.
					niz[j + 1] = temp; // j+1 damo proslu vrijednost j koju smo spremili u temp.
				}
			}
		}

		return niz;
	}
}
