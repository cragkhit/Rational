
public class Rational {
	    long numerator,denominator; 

	    class Illegal extends Exception { 
	        String reason; 
	        Illegal (String reason) { 
	            this.reason = reason; 
	        } 
	    } 
	    
	    Rational() {
	    	super();
	    }

	    Rational(long numerator, long denominator) throws Illegal {
	    	/* add your implementation here */
	    } 

	    // find the reduce form 
	    private void simplestForm() { 
	        long computeGCD; 
	        computeGCD = GCD(Math.abs(numerator), denominator); 
	        numerator /= computeGCD; 
	        denominator /= computeGCD; 
	    } 

	    // find the greatest common denominator 
	    private long GCD(long a, long b) { 
	        if (a%b ==0) return b; 
	        else return GCD(b,a%b); 
	    } 

	    public void add(Rational x) { 
	        numerator = (numerator * x.denominator) + (x.numerator * denominator);
	        denominator = (denominator * x.denominator); 
	        simplestForm(); 
	    }

	    public void subtract(Rational x) {
	    	/* add your implementation here */
	    }

	    public void multiply(Rational x) { 
	    	/* add your implementation here */
	    }

	    public void divide(Rational x) {
	        /* add your implementation here */
	    }

	    public boolean equals(Object x) {
	    	/* add your implementation here */
	    }

	    public long compareTo(Object x) {
	    	/* add your implementation here */
	    }

	    public String toString() { 
	        /* add your implementation here */
	    }
	}
