
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
	    	if (denominator == 0)
	    		throw new Illegal("Divide by zero.");
	        this.numerator = numerator;
	        this.denominator = denominator;
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
	    	numerator = (numerator * x.denominator) - (x.numerator * denominator);
	        denominator = (denominator * x.denominator); 
	        simplestForm(); 
	    }

	    public void multiply(Rational x) { 
	    	numerator = numerator * x.numerator;
	        denominator = denominator * x.denominator; 
	        simplestForm(); 
	    }

	    public void divide(Rational x) {
	        numerator = numerator * x.denominator;
	        denominator = denominator * x.numerator;
	        simplestForm();
	    }

	    public boolean equals(Object x) {
	    	if (x == this) { 
	    		return true; 
	    	} 
	    	
	    	if (x == null || x.getClass() != this.getClass()) { 
	    		return false; 
	    	}

	    	Rational r = (Rational) x;
	    	r.simplestForm();
	    	
	    	return this.numerator == r.numerator && this.denominator == r.denominator;
	    }

	    public long compareTo(Object x) {
	    	Rational r = (Rational) x;
	    	
	    	if (this.equals(r)) {
	    		return 0;
	    	} else if (numerator * r.denominator > r.numerator * denominator) {
	    		return 1;
	    	} else {
	    		return -1;
	    	}
	    }

	    public String toString() { 
	        return this.numerator + "/" + this.denominator;
	    }
	}
