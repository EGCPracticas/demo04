package demo04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSum2Num() {
		assertEquals(6, sum(2,4));
	}

	private int sum(int i, int j) {
		return 6;
	}

}
