/*
 * Author Gregor Reimling
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 */
public class Wurzel implements Funktion{
	  public boolean istDefiniertFuer(double x) {
		  return x>=0;
	  }
	  //Wenn x<0 dann muss dies ebenfalls als Fehler abgefangen werden, daher hier ebenfalls Fehlerbehandlung über eigens erstellte Klasse
	  public double wert(double x) throws ValueOutOfRangeException {
		  if(!istDefiniertFuer(x)) throw new ValueOutOfRangeException("nicht definiert");
		  		  	  
		  return Math.sqrt(x);
	  }
	  public String toString() {// ueberfluessig, aber verdeutlichend
		  return "sqrt(x)";
	  }

}
