
public class Toys {

	

	private String toyName;
	private String toyType;
	private int toyPrice;
	private int toyBuiltYear;
	private int toyAgeRes;
	
	
	
      /**
       * Konstruktor za default vrijednosti.
       */
	public Toys() {
		
		this.toyName = "unknown";
		this.toyType = "unknown";
		this.toyPrice = 0;
		this.toyBuiltYear = 2014;
		this.toyAgeRes = 0;
	}
	/**
	 * Konstruktor za unesene vrijednosti.
	 * @param toyName
	 * @param toyType
	 * @param toyPrice
	 * @param toyBuiltYear
	 * @param toyAgeRes
	 */
	public Toys(String toyName, String toyType, int toyPrice, int toyBuiltYear,
			int toyAgeRes) {
		
		this.toyName = toyName;
		this.toyType = toyType;
		this.toyPrice = toyPrice;
		this.toyBuiltYear = toyBuiltYear;
		this.toyAgeRes = toyAgeRes;
	}
	
	//Geter i seter toyName
	public String getToyName() {
		return toyName;
	}
	public void setToyName(String toyName) {
		this.toyName = toyName;
	}
	//Geter i setter toyType
	public String getToyType() {
		return toyType;
	}
	public void setToyType(String toyType) {
		this.toyType = toyType;
	}
	// Get i set za toyPrice
	public int getToyPrice() {
		return toyPrice;
	}
	public void setToyPrice(int toyPrice) {
		this.toyPrice = toyPrice;
	}
	//Get i set za toyBui...
	public int getToyBuiltYear() {
		return toyBuiltYear;
	}
	public void setToyBuiltYear(int toyBuiltYear) {
		this.toyBuiltYear = toyBuiltYear;
	}
	//Get i set za toyAgesRes...
	public int getToyAgeRes() {
		return toyAgeRes;
	}
	public void setToyAgeRes(int toyAgeRes) {
		if(toyAgeRes < 0 || toyAgeRes >100)
			throw new IllegalArgumentException("ERROR");
		this.toyAgeRes = toyAgeRes;
	}
	
	public String toString() {
		
		String toyString ="Name: " + toyName + "\nType: " + toyType
				+ "\nPrice: " + toyPrice + "\nBuilt Year: " + toyBuiltYear
				+ "\nAge Restriction: " + toyAgeRes +"\n";
		
		return toyString;
	}
	
	
}
