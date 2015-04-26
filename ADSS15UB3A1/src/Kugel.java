
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
	//Kugel Volumen = (4/3)*rr*r³ wichtig, nicht 4/3 sondern 4.0/3.0, sonst werden die Stellen hinterm Komma abgeschnitten, ERgebnis verfälscht
	public double volumen() {
		
		return (4.0/3.0) * Math.PI*(r*r*r);
		
	}
	//Kugel Oberflaeche = 4 * rr * r²
	public double oberflaeche() {
		return 4.0*Math.PI*(r*r);
		
	}
	
	public double durchmesser() {
		return 2.0 *r;
	}
	
	public void skaliere(double a) {
		r*=a;
	}
	//Um zu prüfen, ob ein Punkt innerhalb der Kugel liegt, Anwendung des Satz des Pythagoras: 
	//Wurzel aus ((x-x)*2+(y-y)*2+(z-z)*2)
	public boolean enthaelt(Punkt p) {
		
//		if(Math.sqrt(Math.pow(p.x() - this.bp().x(), 2) + Math.pow(p.y() - this.bp().y(), 2) + Math.pow(p.z() - this.bp().z(), 2)) <= this.r)
//		return true;
//		return false;
		double absX = this.bp().getX() - p.getX();
		double absY = this.bp().getY() - p.getY();
		double absZ = this.bp().getZ() - p.getZ();
		boolean isOutside = Math.sqrt(Math.pow(absX, 2) + Math.pow(absY, 2) + Math.pow(absZ, 2)) > r;
			
		return !isOutside;
		}

//		
//		double erg=0;
//		erg=Math.sqrt((p.x()-p.x()*2)+(p.y()-p.y()*2)+p.z()*p.z()*2);
//		
//		if (erg<=r){
//			return true;
//		}
//		else {
//			return false;
//		}
		
		
	}


