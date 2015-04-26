/*
 * Author Gregor Reimling
 * �bungsblatt 2 AlgoDat SS15
 * m�gliche L�sung Aufgabe 2, nicht Final getestet
 */
public class Wurzel implements Funktion{
	  public boolean istDefiniertFuer(double x) {
		  return x>=0;
	  }
	  //Wenn x<0 dann muss dies ebenfalls als Fehler abgefangen werden, daher hier ebenfalls Fehlerbehandlung �ber eigens erstellte Klasse
	  public double wert(double x) throws ValueOutOfRangeException {
		  if(!istDefiniertFuer(x)) throw new ValueOutOfRangeException("nicht definiert");
		  		  	  
		  return Math.sqrt(x);
	  }
	  public String toString() {// ueberfluessig, aber verdeutlichend
		  return "sqrt(x)";
	  }

}
