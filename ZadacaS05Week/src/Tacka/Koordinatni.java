package Tacka;


public class Koordinatni {

	private int koordinataX;
	private int koordinataY;
	
	public Koordinatni(){
		this.koordinataX = 0;
		this.koordinataY = 0;
	}
	
	public Koordinatni(int koordinataX, int koordinataY){
		this.koordinataX = koordinataX;
		this.koordinataY = koordinataY;
		
	}

	public int getKoordinataX() {
		return koordinataX;
	}

	public void setKoordinataX(int koordinataX) {
		this.koordinataX = koordinataX;
	}

	public int getKoordinataY() {
		return koordinataY;
	}

	public void setKoordinataY(int koordinataY) {
		this.koordinataY = koordinataY;
	}
	
	public String toString(){
		String tackaToString = "koordinataX" + koordinataX + ", koordinataY: " +koordinataY;
		return tackaToString; 
	}
	
	public static double getDistance(Koordinatni tacka1,Koordinatni tacka2){
		double udaljenost = 0;
		int zbir = (tacka2.getKoordinataX()-tacka1.getKoordinataX())*(tacka2.getKoordinataX()-tacka1.getKoordinataX()) 
				+ (tacka2.getKoordinataY()-tacka1.getKoordinataY())*(tacka2.getKoordinataY()-tacka1.getKoordinataY());
		udaljenost = Math.sqrt(zbir);
		return udaljenost;
	}
}
