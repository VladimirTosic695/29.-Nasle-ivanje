package UUP;

public class Pravougaonik extends Oblik {
	
	double duzina;
	double sirina;
	
	public Pravougaonik(double duzina, double povrsina) {
		this.duzina = duzina;
		this.sirina = povrsina;
	}

	public double uzmiPovrsinu() {
		povrsina = duzina * sirina;
		return povrsina;
	}
	
	

}
