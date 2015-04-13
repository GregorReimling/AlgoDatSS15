/*
 * Author Gregor Reimling
 * Übungsblatt 2 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 */
public class Polynom implements Funktion{
	
	private double []werte;
	
	public Polynom(double [] werte) {
		this.werte=werte.clone();
	}

	  public boolean istDefiniertFuer(double x) {
		  return true;
	  }
	  public double wert(double x) {
		  double erg=0;
		  for (int i=0;i<werte.length;i++) {
			  erg+=werte[i]*Math.pow(x, i);
		  }
		  return erg;
	  }
	  public String toString(){		  // ueberfluessig, aber verdeutlichend
		  
			String ergebnis = werte[werte.length - 1] + "*x^" + (werte.length - 1);
			
			for (int i = werte.length - 2; i >= 0; i--) {
				
				ergebnis += " + " + werte[i] + "*x^" + i;
			}
			
			return ergebnis;
		}

	  
}
