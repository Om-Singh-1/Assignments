import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.question.two.Asus;
import com.question.two.IQOO;
import com.question.two.Iphone;
import com.question.two.Nokia;
import com.question.two.NothingPhone;
import com.question.two.OnePlus;
import com.question.two.Samsung;
import com.question.two.Techno;

import static org.hamcrest.core.IsEqual.equalTo;

public class TestAllPhones {

	@Test
	public void checkAllPhones() {
		
		Nokia nokia = new Nokia();
		assertEquals("Nokia", nokia.name());
		
		Asus asus = new Asus();
		assertEquals(true, asus.isBrandPopular());
		
		Iphone iphone = new Iphone();
		assertEquals(10, iphone.lifespan());
		
		IQOO iqoo = new IQOO();
		assertEquals(true, iqoo.isBrandPopular());
		
		NothingPhone nothingPhone = new NothingPhone();
		assertThat(15.2, equalTo(nothingPhone.version()));
		
		OnePlus oneplus = new OnePlus();
		assertEquals(5, oneplus.lifespan());
		
		Samsung samsung = new Samsung();
		assertThat(0.1, equalTo(samsung.version()));
		
		Techno techno = new Techno();
		assertEquals("Techno", techno.name());
		
	}
	
}
