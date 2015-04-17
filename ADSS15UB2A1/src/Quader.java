/*
 * Author Gregor Reimling www.reimling.eu
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 1, nicht Final getestet
 * Formeln: http://de.wikibooks.org/wiki/Formelsammlung_Mathematik:_Geometrie
 */


public class Quader extends Koerper{ 
	
	private double b, h,t;
	//private Punkt bz;
	
	public Quader(Punkt bp, double b, double t, double h) {
		super(bp);
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
		
		double erg=0;
		//System.out.println("Vor Initialisierung: " + erg);
		//erg=((super.bp().x()-p.x())*2)+((super.bp().y()-p.y())*2)+((super.bp().z()-p.z())*2);
		erg=(((p.x()-b)*2)+((p.y()-t)*2)+(p.z()*h)*2);
		
		if (p.x()<super.bp().x()) {
			return false;
		}
		else if (p.x()>(super.bp().x()+b)) {
			return false;
		}
		else if (p.y()<super.bp().y()) {
			return false;
		}
		else if (p.y()>(super.bp().y()+h)) {
			return false;
		}
		else if (p.z()<super.bp().z()) {
			return false;
		}
		else if(p.z()>(super.bp().z()+t)) {
			return false;
		}
		
		else {
			return true;
		}
		
		//erg=Math.sqrt(Math.pow((super.bp().x()-p.x()), 2)+Math.pow((super.bp().y()-p.y()), 2)+Math.pow((super.bp().z()-p.z()), 2));
		//System.out.println("Nach Ergebnis: " + erg + "b*h*t: "+b*h*t);
		
		
	}

	

}
