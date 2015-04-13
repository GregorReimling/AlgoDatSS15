public class Kettenfunktion implements Funktion
{
  private Funktion f;
  private Funktion g;

  public Kettenfunktion(Funktion f, Funktion g) {
    this.f = f;
    this.g = g;
  }

  public boolean istDefiniertFuer(double x) {
    return g.istDefiniertFuer(x) && f.istDefiniertFuer(g.wert(x));
  }
  public double wert(double x) {
    return f.wert(g.wert(x));
  }
  public String toString() {
    return "f(g(x)) mit f(x) = " + f + " und g(x) = " + g;
  }
}
