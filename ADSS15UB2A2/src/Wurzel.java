/*
 * Author Gregor Reimling
 * �bungsblatt 2 AlgoDat SS15
 * m�gliche L�sung Aufgabe 2, nicht Final getestet
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
