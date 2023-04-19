package UUP;

public class Krug {
	
	private double poluprecnik;
	
	Krug(double poluprecnik){
		this.poluprecnik = poluprecnik;
	}
	
	public double uzmiPovrsinu() {
		return poluprecnik * poluprecnik * Math.PI;
	}

}
