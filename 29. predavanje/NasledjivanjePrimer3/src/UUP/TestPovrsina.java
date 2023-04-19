package UUP;

public class TestPovrsina {

	public static void main(String[] args) {
		
		Krug k = new Krug(1);
		
		System.out.println("Povrsina kruga: " + k.uzmiPovrsinu());
		
		Pravougaonik p = new Pravougaonik(4, 5);
		
		
		System.out.println("Povrsina pravougaonika: " + p.uzmiPovrsinu());
		

	}

}
