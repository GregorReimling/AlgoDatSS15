/*
 * Author Gregor Reimling
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 */
public class RezWurzel implements Funktion{
	
	private Reziprok r = new Reziprok();
	private Wurzel w = new Wurzel();
	private Abs a = new Abs();
	private Kettenfunktion k = new Kettenfunktion(r, new Kettenfunktion(w,a));
	
	public boolean istDefiniertFuer(double x) {
		  return x > 0 || x < 0;
	}
	
	public double wert(double x){
		  return k.wert(x);
	}
	
	public String toString() {// ueberfluessig, aber verdeutlichend
		return k.toString();
		
	}

}
