/*
 * Author Gregor Reimling
 * Übungsblatt 3 AlgoDat SS15
 * mögliche Lösung Aufgabe 2, nicht Final getestet
 * geforderte Exception Klasse 
 */

public class ValueOutOfRangeException extends Exception {
	
	public ValueOutOfRangeException() {
		
	}
	
	
	public ValueOutOfRangeException(String e) {
		super(e);
	}

}
