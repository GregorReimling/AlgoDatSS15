/*
 * Author Gregor Reimling
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 */
public class Wurzel implements Funktion{
	  public boolean istDefiniertFuer(double x) {
		  return x>=0;
	  }
	  public double wert(double x) {
		  return Math.sqrt(x);
	  }
	  public String toString() {// ueberfluessig, aber verdeutlichend
		  return "sqrt(x)";
	  }

}
