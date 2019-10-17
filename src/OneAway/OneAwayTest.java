package oneaway;

import static org.junit.Assert.*;

import org.junit.Test;

class OneAwayTest {

	@Test
	public void testOneEditAway() {
		String s1 = "pale";
		String s2 = "bale";
		String s3 = "bae";
		String s4 = "ple";
		String s5 = "pales";

		// OneAway away = new OneAway();
		// away.

		assertTrue(OneAway.oneEditAway(s1, s2));
		assertTrue(OneAway.oneEditAway(s5, s1));
		assertTrue(OneAway.oneEditAway(s1, s4));
		assertFalse(OneAway.oneEditAway(s1, s3));

	}

}
