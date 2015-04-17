

public class Test {
	
	public static void main(String[] args) {
//		Punkt bz = new Punkt(30,30,30);
		Kugel k1 = new Kugel(new Punkt(1, 1, 1), 0);
		Kugel k2 = new Kugel(new Punkt(0, -1, 2), 1);
		Quader q1 = new Quader(new Punkt(-5, -3, -1), 2, 3, 4);
	    Quader q2 = new Quader(new Punkt(0, 0, 0), 600, 800, 1000);
	    
	    Punkt p1 = new Punkt(1, 1, 1);
	    Punkt p2 = new Punkt(-2, 1, 2);
	    Punkt p3 = new Punkt(-1, 0, 0);
	    Punkt p4 = new Punkt(2, 0, 2);
	    
		System.out.println("K1 Durchmesser: " + k1.durchmesser() + " Oberflaeche: " + k1.oberflaeche() + " Volumen: " + k1.volumen());
		System.out.println("K2 Durchmesser: " + k2.durchmesser() + " Oberflaeche: " + k2.oberflaeche() + " Volumen: " + k2.volumen());
		System.out.println("K1 enthaelt P1?: " + k1.enthaelt(p1));
		System.out.println("K2 enthaelt P2?: " + k2.enthaelt(p2));
		
		System.out.println("Durchmesser: " + q1.durchmesser() + " Oberflaeche: " + q1.oberflaeche() + " Volumen: " + q1.volumen());
		System.out.println("Durchmesser: " + q2.durchmesser() + " Oberflaeche: " + q2.oberflaeche() + " Volumen: " + q2.volumen());
		
		System.out.println("Q1 enthaelt P1?: " + q1.enthaelt(p1));
		
		System.out.println("Q2 enthaelt P2?: " + q2.enthaelt(p2));
		System.out.println("Q2 enthaelt P4?: " + q2.enthaelt(p4));
		System.out.println("Q1 enthaelt P3?: " + q1.enthaelt(p3));
		
	}

}
