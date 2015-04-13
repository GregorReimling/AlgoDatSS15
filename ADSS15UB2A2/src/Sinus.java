public class Sinus implements Funktion
{
  public boolean istDefiniertFuer(double x) {
    return true;
  }
  public double wert(double x) {
    return Math.sin(x);
  }
  public String toString() {
    return "sin(x)";
  }
}
