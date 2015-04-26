
public class Test {
	  public static void main(String[] args) throws ValueOutOfRangeException {
		    //Funktion f = new Parabel(2, 0, 0);     // f(x) = x^2
		  //Funktion g = new Sinus();              // f(x) = sin(x)
		  // Funktion fg = new Kettenfunktion(f,g); // f(x) = (sin(x))^2

		    Funktion rw = new RezWurzel();
		    Funktion rp = new Reziprok();
		    Funktion abs = new Abs();
		    Funktion rw1 = new RezWurzel();
		    Funktion w = new Wurzel();
	        
		    System.out.println(rw.wert(-16) + " erwartet 0.25");
		    System.out.println(rp.wert(-4) + " erwartet -0.25");
		    System.out.println(abs.wert(-4) + " erwartet 4.0");
		    System.out.println(rw1.wert(-16) + " erwartet 0.25");
		    System.out.println(w.wert(-10) + " erwartet null");
		    
		    
		    
		    System.out.println(AbgeschlosseneAuswertung.auswertung(rw, -16) + " erwartet: 0.25");
	        System.out.println(AbgeschlosseneAuswertung.auswertung(rp, -4) + " erwartet: -0.25");
	        System.out.println(AbgeschlosseneAuswertung.auswertung(w, -10) + " erwartet: null");
	        System.out.println(AbgeschlosseneAuswertung.auswertung(abs, -4) + " erwartet: 4.0");
	        System.out.println(rp.toString() + " erwartet: 1/x");
	        
	        
	        
	        
	  }



}
