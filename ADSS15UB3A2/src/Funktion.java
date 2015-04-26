
public interface Funktion {
  boolean istDefiniertFuer(double x);
  //Erweiterung um Exception
  double wert(double x) throws ValueOutOfRangeException;
  String toString(); // ueberfluessig, aber verdeutlichend
}
