/*
 * Author Gregor Reimling
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 */


public class Abs implements Funktion{
	
	  public boolean istDefiniertFuer(double x) {
		  return true;
	  }
	  public double wert(double x) {
		  return x < 0 ? -x : x;
	  }
	  public String toString() {// ueberfluessig, aber verdeutlichend
		  return "|x|";
	  }

}
