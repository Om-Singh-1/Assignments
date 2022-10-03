import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.question.six.Employee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestEmployee {

	@Test
	public void checkEmployeeData() {
		
		Map<Integer, String> expectedData = new HashMap<Integer, String>();
		
		expectedData.put(1, "Dio Brando");
		expectedData.put(2, "Joesph Joestar");
		expectedData.put(3, "Kira yoshikage");
		
		assertTrue(Employee.addMap().containsKey(3) && expectedData.get(3) != null);
		assertEquals(Employee.addMap().containsValue("Dio Brando"), expectedData.containsValue("Dio Brando"));
	}
	
}
