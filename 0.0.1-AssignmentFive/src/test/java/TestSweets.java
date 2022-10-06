
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.question.six.Sweets;

public class TestSweets {

	@Test
	public void checkSweets() {
		
		assertEquals(2, Sweets.cakes().indexOf("Vanilla Flavour"));
		assertEquals(3, Sweets.chocolates().indexOf("Vanilla Flavour"));
		
	}
	
}
