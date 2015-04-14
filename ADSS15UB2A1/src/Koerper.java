/*
 * Author Gregor Reimling
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 1, nicht Final getestet
 */

public abstract class Koerper implements Skalierbar {
	private Punkt bp;
	
	public Koerper(Punkt bp) {
		this.bp=new Punkt(bp);
	}
	
	public Punkt bp() {
		return this.bp;
	}
	
	public void verschiebe(double deltax, double deltay, double deltaz) {
		bp.verschiebe(deltax, deltay, deltaz);
	}
	
	public abstract double volumen();
	
	public abstract double oberflaeche();
	
	public abstract double durchmesser();
	
	public abstract void skaliere(double a);
	
	public abstract boolean enthaelt(Punkt p);
	
	
	

}
