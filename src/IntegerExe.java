public class IntegerExe {
	public static void main(String args[]) {
		
		// We are going to declare two Integers, and we are going to compare with compareTo().
		Integer num1 = 14;
		Integer num2 = 10;
		int comp = num1.compareTo(num2);
		
		// To know do the comparison, we use a if. 
		if(comp > 0) {
	         System.out.println("num1 is greater than num2");
	    } else if(comp < 0) {
	         System.out.println("num1 is less than num2");
	    } else {
	         System.out.println("num1 is equal to num2");
	    }
		
		// getInteger() method determines the integer value of the system property with the specified name.
		String sgt = "sun.arch.data.model";
		System.out.println("Value = " + Integer.getInteger(sgt));
		
		// intValue() returns the value of this Integer as an int.
		int iv = num1.intValue();
	    System.out.println("Value = " + iv);
	    
	    // parseInt().
	    
	    // shortValue() returns the value of this Integer as an short.
	    short sv = num1.shortValue();
	    System.out.println("Value = " + sv);
	    
	    // toString().
	 	String tst = num2.toString(30, 10);
	    System.out.println("Value = " + tst);
	 
	    tst = num2.toString(30, 18);
	    System.out.println("Value = " + tst);

	    tst = num2.toString(30, 7);
	    System.out.println("Value = " + tst);
	    
	    // valueOf() method returns an Integer object holding the value of the specified String.
	    String stv = "50";
	    System.out.println("Value = " + num1.valueOf(stv));
	}
}