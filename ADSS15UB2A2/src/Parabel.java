/**
 * Funktion der Form f(x) = a*x^2 + b*x + c
 */
public class Parabel implements Funktion {
  private double a;
  private double b;
  private double c;

  public Parabel(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public boolean istDefiniertFuer(double x) {
    return true;
  }
  public double wert(double x) {
    return a*x*x + b*x + c;
  }
  public String toString() {
    return a + "*x^2 + " + b + "*x + " + c;
  }
}
