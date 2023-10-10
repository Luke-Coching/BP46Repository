import java.util.*;
public class IntersectionCode {
	public static void main(String[] args) {
	    Set<String> s1 = new HashSet<String>( ); //Create s1
	    s1.add("Bill"); s1.add("Larry"); s1.add("Adolph"); s1.add("Regina"); s1.add("Susie");
	    
	    Set<String> s2 = new HashSet<String>( ); //Create s2
	    s2.add("Larry"); s2.add("Jack"); s2.add("Alice"); s2.add("June"); s2.add("Benny"); s2.add("Susie");
	    //Build the intersection set, s3
	        Set<String> s3 = new HashSet<String>();
	        Iterator<String> iter1 = s1.iterator();
	    while(iter1.hasNext())
	    {
	      Object obj = iter1.next();
	      if(s2.contains(obj)){
	        s3.add((String) obj);
	      }
	    }

	    Iterator<String> iter3 = s3.iterator();
	      while(iter3.hasNext())
	      {
	        System.out.println(iter3.next());
	      }
	  }
}
