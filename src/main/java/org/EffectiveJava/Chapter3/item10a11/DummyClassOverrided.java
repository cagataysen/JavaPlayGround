package org.EffectiveJava.Chapter3.item10a11;

public class DummyClassOverrided {
    private int a,b;

    public DummyClassOverrided(int a, int b) {

        this.a = a;
        this.b = b;
    }


//	@Override
//	public boolean equals(Object o) { 
//		  
//        // If the object is compared with itself then return true   
//        if (o == this) { 
//            return true; 
//        } 
//  
//        /* Check if o is an instance of DummyClassOverrided or not 
//          "null instanceof [type]" also returns false */
//        if (!(o instanceof DummyClassOverrided)) { 
//            return false; 
//        } 
//          
//        // typecast o to DummyClassOverrided so that we can compare data members  
//        DummyClassOverrided c = (DummyClassOverrided) o; 
//          
//        // Compare the data members and return accordingly  
//        return Integer.compare(a, c.a) == 0
//                && Integer.compare(b, c.b) == 0; 
//    } 

//	@Override
//	public int hashCode() {
//		int result = Integer.hashCode(b);
//		result = 31*result + Integer.hashCode(a);
//		return result;
//	}


//	@Override
//	public int hashCode() {
//	    return Objects.hash(a, b);
//	} 
}
