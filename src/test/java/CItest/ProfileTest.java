package CItest;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;



public class ProfileTest {

	@Test
	public void testGetName() {
		Profile profile = new Profile();
		String expected = "リロイ・ジェンキンス";
		String actual = profile.getName();

		assertThat(actual, is(expected));
	}


}
