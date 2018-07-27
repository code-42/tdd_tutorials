import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import net.ed.learn.Template;

public class TemplateTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRender() {
		
		String thePattern = "your test score was: %d";
		int score = 90;
		
		Template template = new Template(thePattern);
		assertNotNull(template.render(score));
		
		String expectedMsg = "your test score was: " + score;
		assertEquals(expectedMsg, template.render(score));
	}
	
	@Test
	public void canInstantiateATemplate() {
		
		Template template = new Template();
		assertNotNull(template);
	}

}
