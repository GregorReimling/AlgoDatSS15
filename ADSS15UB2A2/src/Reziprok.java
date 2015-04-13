/*
 * Author Gregor Reimling
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 */
public class Reziprok implements Funktion{
	
	  public boolean istDefiniertFuer(double x) {
		  return x != 0;
	  }
	  public double wert(double x) {
		  return (1/x);
	  }
	  public String toString(){// ueberfluessig, aber verdeutlichend
		  return "1/x";
	  }

}
