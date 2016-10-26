package demo04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSum {

	@Test
	public void testSum2Num() {
		assertEquals(6, sum(2,4));
	}

	@Test
	public void testSumCero() {
		assertEquals(4, sum(4, 0));
		assertEquals(4, sum(0, 4));
	}

	
	@Test
	public void testSumNeg() {
		assertEquals(7, sum(10, -3));
		assertEquals(7, sum(-3, 10));
		assertEquals(-8, sum(-4, -4));
	}
	
	private int sum(int i, int j) {
		return i+j;
	}

}
