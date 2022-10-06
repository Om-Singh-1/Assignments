import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import org.junit.Test;

import com.question.seven.NumbersSet;

public class TestNumbersSet {

	@SuppressWarnings("deprecation")
	@Test
	public void checkNumbersSet() {
				
		assertThat(10, equalTo(NumbersSet.numbers().stream().toList().get(NumbersSet.numbers().size() - 1)));
		
	}

}
