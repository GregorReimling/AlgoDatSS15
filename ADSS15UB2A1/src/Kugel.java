
/*
 * Author Gregor Reimling www.reimling.eu
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 1, nicht Final getestet
 * Formeln: http://de.wikibooks.org/wiki/Formelsammlung_Mathematik:_Geometrie
 */


public class Kugel extends Koerper{
	
	//private Punkt bz;
	private double r;
	
	public Kugel(Punkt bp, double r) {
		super(bp);
		this.r=r;
	}
	//Kugel Volumen = (4/3)*rr*r³
	public double volumen() {
		return (4/3) * Math.PI*r*r*r;
		
	}
	//Kugel Oberflaeche = 4 * rr * r²
	public double oberflaeche() {
		return 4*Math.PI*(r*r);
		
	}
	
	public double durchmesser() {
		return 2 *r;
	}
	
	public void skaliere(double a) {
		r*=a;
	}
	public boolean enthaelt(Punkt p) {
			
		if (super.bp().equals(p)){
			return true;
		}
		else {
			return false;
		}
		//return bp.equals(p)? true : false;
		
	}

}
