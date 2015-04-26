
public class AbgeschlosseneAuswertung {
	
	public static Double auswertung(Funktion f, double x) {
		try {
			Double b = new Double(f.wert(x)); 
			return b;
		}
		catch (ValueOutOfRangeException e) {
			return null;
		}

		
	}


}
