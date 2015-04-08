/*
 * Author Gregor Reimling
 * Übungsblatt 1 AlgoDat SS15
 * mögliche Lösung, nicht Final getestet
 */

package A3;

public abstract class Person {
	private static int anzahl=0;
	
	private String name;
	private int alter;
	private int groesse, gewicht;
	
	public Person(String name, int alter, int gewicht, int groesse) {
		
		this.name=name;
		this.alter=alter;
		this.gewicht=gewicht;
		this.groesse=groesse;
		anzahl++;
	}
	
	public String name() {
		return this.name;
	}
	
	public abstract String chromosomen();
	
	public int alter() {
		return this.alter;
	}
	
	public static int volljaehrigkeitsAlter() {
		return 18;
	}
	
	public boolean istVolljaehrig(){
		return volljaehrigkeitsAlter()>=alter() ? true : false;
	}
	
	public int groesse() {
		return this.groesse;
	}
	
	public int gewicht() {
		return this.gewicht;
	}
	
	public abstract int preisHaarschnitt();
	
	public String toString(){
		return name() + " "+ chromosomen()+ " " + alter()+ " " + istVolljaehrig()+ " " + groesse()+ " " + gewicht()+" " + preisHaarschnitt(); 
	}
	
	public static int anzahl() {
		return anzahl;
	}

}
