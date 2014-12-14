import java.util.Arrays;

public class ToysStore {

	private String storeName;
	private Toys[] inventar;// Niz igracaka, unosit cemo ih poslije...
	private int numOfToys;

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public Toys[] getInventar() {
		return inventar;
	}

	public void setInventar(Toys[] inventar) {
		this.inventar = inventar;
	}

	public int getNumOfToys() {
		return numOfToys;
	}

	public void setNumOfToys(int numOfToys) {
		this.numOfToys = numOfToys;
	}

	public ToysStore() {

		this.storeName = "Uknown";
		inventar = new Toys[2];
		this.numOfToys = 0;
	}

	public ToysStore(String storeName) {
		this.storeName = storeName;
		inventar = new Toys[2];
		numOfToys = 0;
	}

	public void addToy(String toyName, String toyType, int toyPrice,
			int toyBuiltYear, int toyAgeRes) {

		inventar[numOfToys] = new Toys(toyName, toyType, toyPrice,
				toyBuiltYear, toyAgeRes);
		numOfToys++;

		if (inventar.length == numOfToys)
			resizeInventar();

	}

	public void resizeInventar() {

		int newLenght = 2 * inventar.length;
		Toys[] temp = new Toys[newLenght];

		for (int i = 0; i < inventar.length; i++) {
			temp[i] = inventar[i];
		}

		inventar = temp;

	}

	public String toString() {

		String printStore = "";

		System.out.println("U prodavnici " + this.storeName + " nalaze se: ");

		for (int i = 0; i < numOfToys; i++) {
			printStore += inventar[i].toString();

		}
		return printStore;
	}

	public void sortByBuiltYear() {
          
		Toys temp = new Toys();
		for (int i = 0; i < (inventar.length - 1); i++) {
			for (int j = 0; j < inventar.length - 1; j++) {
				
				if (inventar[j].getToyBuiltYear() > inventar[j + 1]
						.getToyBuiltYear()) {
					temp = inventar[j];
					inventar[j] = inventar[j + 1];
					inventar[j + 1] = temp;
				}
			}

		}
	}
}
