import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.question.three.Numbers;

public class TestNumbers {

	@Test
	public void checkNumbers() {
		
		Numbers num = new Numbers();
		
		assertEquals(13, num.Odd(13));
	}
	
}
