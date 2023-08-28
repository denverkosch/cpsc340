public class TinyCode2 {
	/** tripleChars is a recursive function that 
     * returns a contenation of a triple of each
     * list element, with | after each. 
     * The function should be initially called with index i 
     * value of zero. 
     * Input of {"a", "bb", "ccc"} should return the string
     * aaa|bbbbbb|ccccccccc|
     * Input of {} should return the empty string */
    public String tripleChars(String [] strings, int i ) {
    	if (i >= strings.length) return "";
    	
    	String triple = strings[i] + strings[i] + strings[i] + "|";
    	
		return triple + tripleChars(strings, ++i);
    }
    

    public static void main(String [] args) {
    	TinyCode2 tc = new TinyCode2();
	// Write a unit test with an array  containing strings of various lengths
        // Write a unit test for an empty array
    	String[] testArr = {"app","apple","grapple"};
	    String test = tc.tripleChars(testArr,0);
	    tc.verify(!test.equals("appappapp|appleappleapple|grapplegrapplegrapple|"), "Returned wrong array");
    	
    	String[] emptyArr = {};
    	
    	tc.verify(!tc.tripleChars(emptyArr, 0).equals(""), "Return non-empty String");
    	
    }
    
    public void verify(boolean incorrect, String error) {
    	if (incorrect) {
    		System.out.println(error); 
    		return;
    	}
    	System.out.println("Passed");
    	
    }
    
}
