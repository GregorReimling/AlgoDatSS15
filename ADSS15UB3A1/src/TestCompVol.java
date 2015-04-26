/**
 * @author Felix
 *
 */
public class TestCompVol {

	public static void main(String[] args) {
		Koerper k1 = new Kugel(new Punkt(1, 1, 1), 3);
		Koerper k2 = new Kugel(new Punkt(1, 1, 1), 3);
		Koerper k3 = new Kugel(new Punkt(1, 1, 1), 2);
		Koerper q1 = new Quader(new Punkt(2, 2, 2), 3, 4, 5);
		Koerper q2 = new Quader(new Punkt(2, 2, 2), 5, 7, 6);

		KoerperCompVol kcv1 = new KoerperCompVol(k1);
		KoerperCompVol kcv2 = new KoerperCompVol(q1);
		KoerperCompVol kcv3 = new KoerperCompVol(q2);
		KoerperCompVol kcv4 = new KoerperCompVol(k2);
		KoerperCompVol kcv5 = new KoerperCompVol(k3);
		
		System.out.println("Basics:");
		System.out.println(k1.volumen());
		System.out.println(q1.volumen());
		System.out.println(kcv1.compareTo(kcv2));
		
		System.out.println();
		System.out.println("Test fuer Allgemeinnuetzigkeit von Comparable:");
		Integer[] foo = { 8, 4, 9, 1, 30, 42, 99, 23, 3, -5 };

		Sort.sortiere(foo);

		for (int i = 0; i < foo.length; i++) {
			System.out.println(foo[i]);
		}

		System.out.println("---\n");
		
		System.out.println("Volumina");
		System.out.println("unsortierte:");
		KoerperCompVol[] kcvA = { kcv1, kcv2, kcv3, kcv4, kcv5 };

		for (int i = 0; i < kcvA.length; i++) {
			System.out.println(kcvA[i]);
		}

		System.out.println();
		Sort.sortiere(kcvA);

		System.out.println("sortierte:");

		for (int i = 0; i < kcvA.length; i++) {
			System.out.println(kcvA[i]);
		}
		
		System.out.println("---\n");
		System.out.println("Praktomat-Tests:");
		
		Punkt bp1 = new Punkt(1, 1, 1);
		KoerperCompVol kugel1 = new KoerperCompVol(new Kugel(bp1, 0));
		Punkt bp2 = new Punkt(0, -1, 0);
		KoerperCompVol kugel2 = new KoerperCompVol(new Kugel(bp2, 1));
		Punkt bp3 = new Punkt(-5, -3, -1);
		KoerperCompVol quader1 = new KoerperCompVol(new Quader(bp3, 2, 3, 4));
		Punkt bp4 = new Punkt(0, 0, 0);
		KoerperCompVol quader2 = new KoerperCompVol(new Quader(bp4, 600, 800, 1000));

		System.out.println("SOLL: true / IST:" + kugel1.enthaelt(bp1));
		System.out.println("SOLL: true / IST:" + quader1.enthaelt(bp3));

		System.out.println("bp1:" + bp1 + " (vorm verschieben)");
		bp1.verschiebe(1, 2, 3);
		System.out.println("bp1:" + bp1);

		System.out.println("bp3: " + bp3 + " (vorm verschieben)");
		bp3.verschiebe(10, 20, 30);
		System.out.println("bp3: " + bp3);

		System.out.println("SOLL: false / IST: " + kugel1.enthaelt(bp1));

	}
}