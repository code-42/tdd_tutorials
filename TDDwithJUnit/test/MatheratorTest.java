import static org.junit.Assert.*;

//tutorial https://www.youtube.com/watch?v=2Ekty7t621k

import org.junit.Before;
import org.junit.Test;

import net.ed.learn.Matherator;

public class MatheratorTest {
	
	// add some scaffolding
	private Matherator classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Matherator();
	}

	@Test
	public void testAdd() {

		// let Java add it up
		long result = 10 + 23 + (-1) + 16;
		
		// Compare that to what the Matherator gives us
	    assertEquals(result, classUnderTest.add(10, 23, -1, 16));

	    result = 100 + 102;
	    assertEquals(result, classUnderTest.add(100 + 102));

	    result = 0;
	    assertEquals(result, classUnderTest.add(0));
	}

	@Test
	public void testSubtract() {

		long result = 100 - 34 - (-17) - 4;

	    assertEquals(result, classUnderTest.subtract(100, 34, -17, 4));

	    result = 0;

	    assertEquals(result, classUnderTest.subtract(0, 0, 0, 0));
	}

}
