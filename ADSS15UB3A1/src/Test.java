

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
	    
	    Punkt bp1 = new Punkt(1, 1, 1);
	    KoerperCompVol kugel1 = new KoerperCompVol(new Kugel(bp1, 0));
	    Punkt bp2 = new Punkt(0, -1, 0);
	    KoerperCompVol kugel2 = new KoerperCompVol(new Kugel(bp2, 1));
	    Punkt bp3 = new Punkt(-5, -3, -1);
	    KoerperCompVol quader1 = new KoerperCompVol(new Quader(bp3, 2, 3, 4));
	    Punkt bp4 = new Punkt(0, 0, 0);
	    KoerperCompVol quader2 = new KoerperCompVol(new Quader(bp4, 600, 800, 1000));
	    kugel1.enthaelt(bp1);
	    quader1.enthaelt(bp3);
	    bp1.verschiebe(1, 2, 3);
	    bp3.verschiebe(10, 20, 30);
	    kugel1.enthaelt(bp1);
	    Comparable[] b = new KoerperCompVol[]{
	    		new KoerperCompVol(new Kugel(new Punkt(3, 2, 1), 3)),
	            new KoerperCompVol(new Quader(new Punkt(4, 1, 8), 6, 2, 5)),
	            new KoerperCompVol(new Kugel(new Punkt(2, 2, 2), 4)),
	            new KoerperCompVol(new Kugel(new Punkt(0, -1, -2), 2)),
	            new KoerperCompVol(new Quader(new Punkt(-5, -3, -1), 6, 3, 4)),
	            new KoerperCompVol(new Quader(new Punkt(0, 0, 0), 2, 1, 2)),
	            new KoerperCompVol(new Quader(new Punkt(-5, -3, -1), 1, 3, 7)),
	            new KoerperCompVol(new Kugel(new Punkt(2, 4, 8), 1))};

		 Sort.sortiere(b);
		 
		System.out.println(((KoerperCompVol)GenerischesMin.min(b)).volumen());
	    
	    System.out.println("Kugel 1 enthaelt Punkt p: " + kugel1.enthaelt(bp1));
	    
		//System.out.println("K1 Durchmesser: " + k1.durchmesser() + " Oberflaeche: " + k1.oberflaeche() + " Volumen: " + k1.volumen());
		//System.out.println("K2 Durchmesser: " + k2.durchmesser() + " Oberflaeche: " + k2.oberflaeche() + " Volumen: " + k2.volumen());
		//System.out.println("K1 enthaelt P1?: " + k1.enthaelt(p1));
		//System.out.println("K2 enthaelt P2?: " + k2.enthaelt(p2));
		
		//System.out.println("Durchmesser: " + q1.durchmesser() + " Oberflaeche: " + q1.oberflaeche() + " Volumen: " + q1.volumen());
		//System.out.println("Durchmesser: " + q2.durchmesser() + " Oberflaeche: " + q2.oberflaeche() + " Volumen: " + q2.volumen());
		
		//System.out.println("Q1 enthaelt P1?: " + q1.enthaelt(p1));
		
		//System.out.println("Q2 enthaelt P2?: " + q2.enthaelt(p2));
		//System.out.println("Q2 enthaelt P4?: " + q2.enthaelt(p4));
		//System.out.println("Q1 enthaelt P3?: " + q1.enthaelt(p3));
		
	}

}
