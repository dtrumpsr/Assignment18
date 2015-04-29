

import junit.framework.*;

public class HashTester extends TestCase {
  
   // assigning the values
   protected void setUp(){
	  
   }

   
   public void testHashPut() {
		HashLinkedChaining<String, Employee> hash = 
		new HashLinkedChaining<String, Employee>();
		
		hash.put("123-45-6789Vulcan",
		new Employee("Dan", "123-45-6789", "01-01-2000", "Vulcan"));
		hash.put("123-45-6000Human",
		new Employee("Captian Kirk", "123-45-6000", "01-01-2263", "Human"));
		hash.put("123-45-5000Human",
		new Employee("Uhura", "123-45-5000", "01-02-2263", "Human"));
		
		assertTrue(hash.get("123-45-6789Vulcan").getBDay().equals("01-01-2000"));
		assertTrue(hash.get("123-45-5000Human").getBDay().equals("01-02-2263"));
		
		
		}
		}
  

