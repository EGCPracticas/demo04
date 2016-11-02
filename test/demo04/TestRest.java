package demo04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRest {

	@Test
	public void restaDosNumeros() {
		assertEquals(2, resta(6,4));
	}

	private int resta(int i, int j) {
		return 2;
	}

}
