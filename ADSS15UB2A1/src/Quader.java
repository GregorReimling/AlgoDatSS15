/*
 * Author Gregor Reimling www.reimling.eu
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 1, nicht Final getestet
 * Formeln: http://de.wikibooks.org/wiki/Formelsammlung_Mathematik:_Geometrie
 */


public class Quader extends Koerper{ 
	
	private double b, h,t;
	//private Punkt bz;
	
	public Quader(Punkt bz, double b, double t, double h) {
		super(bz);
		this.b=b;//a
		this.t=t;//b
		this.h=h;//c
	}
	
	public double volumen() {
		return b*h*t;
	}
	//O = 2 · ( a · b + b · c + a · c )
	public double oberflaeche() {
		return 2*((b*t)+(t*h)+(b*h));
		
	}
	//Formel Durchmesser = Wurzel aus (b²+t²+h²)
	public double durchmesser() {
		return Math.sqrt((b*b)+(t*t)+(h*h));
	}
	
	public void skaliere(double a) {
		this.b*=a;
		this.h*=a;
		this.t*=a;
		
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
