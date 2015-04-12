/*
 * Author Gregor Reimling
 * Übungsblatt 1 AlgoDat SS15
 * mögliche Lösung, nicht Final getestet
 */


package A3;

public class Test {
	
	public static void main(String [] args) {
		Frau f1 = new Frau("Christina Hoff", 18, 155, 69);
		Frau f2 = new Frau("Jana", 22, 166, 66);
		Frau f3 = new Frau("Jennifer", 18, 192, 76);
		Mann m1 = new Mann("Holger Schwicht", 32, 182, 77);
		Frau britt = new Frau("Britt-Marie Hellendal", 18, 192, 76);
		Frau zazie = new Frau("Zazie Queneau", 67, 157, 65);
		Frau anna = new Frau("Anna Carolina zu Seidlitz-Benrath", 17, 168, 58);
		//Frau britt = new Frau("Britt-Marie Hellendal", 18, 192, 76);
		
		System.out.println(f1.toString());
		System.out.println(f1.istVolljaehrig());
		System.out.println("Personenanzahl " + Person.anzahl() + "Frauenanzahl " + Frau.anzahl + "Maenneranzahl " + Mann.anzahl);
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(m1.toString());
		System.out.println("Zazie Preis Haarschnitt " + zazie.preisHaarschnitt());
		System.out.println("Ann Haarschnitt "+anna.preisHaarschnitt());
		
		
		
		System.out.println(Mann.anzahl);

		System.out.println(f1.istVolljaehrig());
		System.out.println("Groesse: " + f1.groesse());
		System.out.println(f3.preisHaarschnitt());
	}

}
