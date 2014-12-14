package Tacka;


public class KoordinatniTest {
public static void main(String[] args) {
	
	//int[] tacka1 = {2,3};
	//int[]tacka2 = {5,7};
	
	Koordinatni tacka1 = new Koordinatni(0,0);
	Koordinatni tacka2 = new Koordinatni(0,16);
	//double udaljenost = Koordinatni.getDistance(tacka1, tacka2);
    //System.out.println(udaljenost);
	
	TackaKrug point = new TackaKrug(tacka1, 16);
	int pointer = point.isInside(tacka2);
	
	System.out.println(pointer);
}
}
