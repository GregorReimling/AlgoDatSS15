/*
 * Author Gregor Reimling
 * Übungsblatt 1 AlgoDat SS15
 * mögliche Lösung, nicht Final getestet
 */

package A3;

public class Test {
	
	public static void main(String [] args) {
		Frau f1 = new Frau("Christina", 18, 155, 69);
		Frau f2 = new Frau("Jana", 22, 166, 66);
		Frau f3 = new Frau("Jennifer", 16, 170, 65);
		
		System.out.println(f1.toString());
		System.out.println(f1.istVolljaehrig());
		System.out.println("Personenanzahl " + Person.anzahl() + "Frauenanzahl " + Frau.anzahl + "Maenneranzahl " + Mann.anzahl);
		f2.toString();
		f3.toString();
	}

}
