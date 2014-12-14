package Tacka;

public class TackaKrug {
	private Koordinatni tacka;
	private double radijus;
	
	
	public TackaKrug(){
		this.tacka = new Koordinatni();
		this.radijus = 0;
	}
	
	public TackaKrug(Koordinatni tacka, double radijus){
		this.tacka = tacka;
		this.radijus=radijus;
	}

	public int isInside (Koordinatni other){
		int isInside = 0;
		
		double fromCenterToOther = Koordinatni.getDistance(this.tacka, other);
		
		if(fromCenterToOther>this.radijus)
			isInside = -1;
		if(fromCenterToOther==this.radijus)
			isInside=0;
		if(fromCenterToOther<this.radijus)
			isInside=1;
		
		return isInside;
	}
	
	public Koordinatni getTacka() {
		return tacka;
	}

	public void setTacka(Koordinatni tacka) {
		this.tacka = tacka;
	}

	public double getRadijus() {
		return radijus;
	}

	public void setRadijus(double radijus) {
		this.radijus = radijus;
	}
	
}
