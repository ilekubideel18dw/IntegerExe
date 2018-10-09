public class IntegerExe {
	public static void main(String args[]) {
		
		// We are going to declare two Integers, and we are going to compare with compareTO().
		Integer num1 = new Integer("14");
		Integer num2 = new Integer("7");
		int comp = num1.compareTo(num2);
		
		// To know the compare, we use a if. 
		if(comp > 0) {
	         System.out.println("num1 is greater than num2");
	    } else if(comp < 0) {
	         System.out.println("num1 is less than num2");
	    } else {
	         System.out.println("num1 is equal to num2");
	    }
		
		//
		
		// intValue() returns the value of this Integer as an int.
		int iv = num1.intValue();
	    System.out.println("Value = " + iv);
	    
	    // 
	    
	    // shortValue() returns the value of this Integer as an short.
	    short sv = num1.shortValue();
	    System.out.println("Value = " + sv);
	}
}