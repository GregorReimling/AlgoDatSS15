/*
 * Author Gregor Reimling www.reimling.eu
 * Übungsblatt 3 AlgoDat SS15
 * mögliche Lösung Aufgabe 1, nicht Final getestet
 */



public class KoerperCompVol implements Skalierbar, Comparable {
	
	//um einen Wrapper zu erzeugen wird zunächt eine Referenz auf Koerper erzeugt
	private Koerper k;
		
	public KoerperCompVol(Koerper k) {
		this.k=k;
	}
	//die vorhandenen Methoden werden übernommen
	public Punkt bp(){
		return this.k.bp();
	}
	
	public void skaliere(double a) {
		this.k.skaliere(a);
	}
	
	public double volumen() {
		return this.k.volumen();
	}
	
	public double oberflaeche() {
		return this.k.oberflaeche();
	}
	
	public double durchmesser() {
		return this.k.durchmesser();
	}
	
	public void verschiebe(double deltax, double deltay, double deltaz) {
		this.k.verschiebe(deltax, deltay, deltaz);
	}
	
	public boolean enthaelt(Punkt p) {
		return this.k.enthaelt(p);
	}
	//hier wird der Comparator zum vergleichen der einzelnen Koerper Elemente anhand der Volumen implementiert
	public int compareTo(Object o) {
		if (this.k.volumen()<((KoerperCompVol)o).volumen()) {
			return -1;
		}
		else if (this.k.volumen()>((KoerperCompVol)o).volumen()) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}
