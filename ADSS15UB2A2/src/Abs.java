/*
 * Author Gregor Reimling
 * �bungsblatt 2 AlgoDat SS15
 * m�gliche L�sung Aufgabe 2, nicht Final getestet
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
