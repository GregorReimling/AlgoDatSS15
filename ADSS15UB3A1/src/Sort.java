public class Sort {
  // Sortieren durch Auswaehlen
  // vgl. "Einfuehrung in die Programmierung"
  public static void sortiere(Comparable[] a) {
	  
	  
	  for (int i=0;i<a.length-1;i++) {
		  for (int j=0;j<a.length;j++) {
			  if(a[i].compareTo(a[j])==1) {
				  Comparable tmp=a[i];
				  a[i]=a[j];
				  a[j]=tmp;
				  
			  }
		  }
		  
	  }
  }
}
