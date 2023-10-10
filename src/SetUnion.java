import java.util.*;

public class SetUnion {
	public static void main(String[] args) {
	    Set<String> s1 = new HashSet<String>( ); //Create s1
	    s1.add("Bill"); s1.add("Larry"); s1.add("Adolph"); s1.add("Regina"); s1.add("Susie");
	    
	    Set<String> s2 = new HashSet<String>( ); //Create s2
	    s2.add("Larry"); s2.add("Jack"); s2.add("Alice"); s2.add("June"); s2.add("Benny"); s2.add("Susie");
	    
	    Set<Object> s3 = new HashSet<Object>();
	    
	    Iterator<String> iter1 = s1.iterator();
	    while(iter1.hasNext()){
	      Object obj = iter1.next();
	      s3.add(obj);
	    }

	    Iterator<String> iter2 = s2.iterator();
	    while(iter2.hasNext()){ //Traverses s2 and adds objects into s3
	      Object obj2 = iter2.next();
	      s3.add(obj2);
	    }
	    
	    Iterator<Object> iter3 = s3.iterator();
	      while(iter3.hasNext())
	      {
	        System.out.println(iter3.next());
	      }
	  }
}
