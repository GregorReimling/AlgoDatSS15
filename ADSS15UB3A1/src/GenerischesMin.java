public class GenerischesMin {
  public static Comparable min(Comparable[] c) {
    if (c.length == 0) { return null; }
    Comparable minval = c[0];
    for (int i=1 ; i<c.length ; i++) {
      if (c[i].compareTo(minval) < 0) {
        minval = c[i];
      }
    }
    return minval;
  }
  public static void main(String[] args) {
    System.out.println((String)min(args));
  }
}
