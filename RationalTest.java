import static org.junit.Assert.*;
import org.junit.Test;

public class RationalTest {
	
	@Test
	public void testConstructor() {
		try {
			new Rational();
			new Rational(1,2);
			new Rational(-10, -5);
		} catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	/* add more test cases below */

}
