public class Employee { 
		  private String mName, mSSN, mBDay, mDiversity; 
		     
		  public   Employee(String name, String SSN, String BDay, String Diversity) { 
		       mName = name; 
		       mSSN = SSN; 
		        mBDay = BDay; 
		        mDiversity = Diversity; 
		    } 
		     
		    public String getKey() { 
		        return mSSN + mDiversity; 
		    } 
		     
		    public String getBDay() { 
		        return mBDay; 
		    } 
		} 