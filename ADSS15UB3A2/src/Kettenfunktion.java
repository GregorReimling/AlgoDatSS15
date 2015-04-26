/*
 * Teil-Author Gregor Reimling
 * Übungsblatt 3 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 */


public class Kettenfunktion implements Funktion
{
  private Funktion f;
  private Funktion g;

  public Kettenfunktion(Funktion f, Funktion g) {
    this.f = f;
    this.g = g;
  }

  public boolean istDefiniertFuer(double x)  {
	  try {
		  return g.istDefiniertFuer(x) && f.istDefiniertFuer(g.wert(x));
	  }
	  catch (ValueOutOfRangeException m) {
		  return false;
	  }
  }
  public double wert(double x) throws ValueOutOfRangeException{
    return f.wert(g.wert(x));
  }
  public String toString() {
    return "f(g(x)) mit f(x) = " + f + " und g(x) = " + g;
  }
}
