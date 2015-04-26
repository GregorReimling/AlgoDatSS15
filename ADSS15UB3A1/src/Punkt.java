/*
 * Author Gregor Reimling www.reimling.eu
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 1, nicht Final getestet
 */

public class Punkt {
	
	private double x, y, z;
	
	public Punkt(double x, double y, double z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	public Punkt(Punkt p) {
		p.x=x;
		p.y=y;
		p.z=z;
	}
	
	
	public void verschiebe(double deltax, double deltay, double deltaz){
		this.x*=deltax;
		this.y*=deltay;
		this.z*=deltaz;
	}
	
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double getZ() {
		return this.z;
	}
	
	

}
