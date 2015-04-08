/*
 * Author Gregor Reimling
 * Übungsblatt 1 AlgoDat SS15
 * mögliche Lösung, nicht Final getestet
 */

package A3;

public class Mann extends Person {
	public static int anzahl=0;
	
	public Mann(String name, int alter, int groesse, int gewicht) {
		super(name, alter, groesse, gewicht);
		anzahl++;
	}
	
	public String chromosomen() {
		return "XY";
	}
	
	public int groesse() {
		return super.groesse()+5;
	}
	
	public int preisHaarschnitt() {
		return 10 +(int) (0.25*alter());
	}
	
	
	public static int anzahl() {
		return anzahl;
	}
	
	
	

}
