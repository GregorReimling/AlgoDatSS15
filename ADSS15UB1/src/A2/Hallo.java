/*
 * Author Gregor Reimling
 * �bungsblatt 1 AlgoDat SS15
 * m�gliche L�sung, nicht Final getestet
 */

package A2;

public class Hallo {
	
	public Hallo() {
		
	}
	
	public static String hallo() {
		return "Hallo Welt!";
	}
	
	public static String hallo(String zk) {
		return "Hallo " + zk + "!";
	}
	

 	public static void main(String [] args) {
	 
			System.out.println(hallo());
			System.out.println(hallo("test"));
	}

	
}
