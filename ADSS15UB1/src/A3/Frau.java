/*
 * Author Gregor Reimling
 * Übungsblatt 1 AlgoDat SS15
 * mögliche Lösung, nicht Final getestet
 */

package A3;

public class Frau extends Person {
	
	public static int anzahl=0;
	
	public Frau(String name, int alter, int groesse, int gewicht) {
		super(name, alter, groesse, gewicht);
		anzahl++;
	}
	
	public String chromosomen() {
		return "XX";
	}
	
	public int gewicht() {
		return super.gewicht()-5;
	}
	
	public int preisHaarschnitt() {
		return 20 + (int)(0.66*alter());
	}
	
	

}
