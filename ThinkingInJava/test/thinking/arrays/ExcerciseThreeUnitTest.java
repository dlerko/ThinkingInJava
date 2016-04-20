package thinking.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ExcerciseThreeUnitTest {
	
	@Test
	public void testCreateArrayOfDoubleSimple() {
		double [][] arrayOfDouble = createArrayOfDoubles(2, 2, 0, 0);
		assertEquals(2, arrayOfDouble.length);
		assertEquals(2, arrayOfDouble[0].length);
	}
	
	@Test
	public void testCreateArrayOfDoubleEmpty() {
		double [][] arrayOfDouble = createArrayOfDoubles(0, 0, 0, 0);
		assertEquals(0, arrayOfDouble.length);
	}
	
	@Test
	public void testCreateArrayOfDoubleMedium() {
		double [][] arrayOfDouble = createArrayOfDoubles(4, 6, 0, 0);
		assertEquals(4, arrayOfDouble.length);
		assertEquals(6, arrayOfDouble[3].length);
	}

	@Test
	public void testFillArrayOfDoublesEmpty() {
		double [][] arrayOfDouble = createArrayOfDoubles(4, 6, 0, 0);
		assertEquals(0, arrayOfDouble[0][0], 0);
	}
	
	@Test
	public void testFillArrayOfDoublesSimpleRange() {
		double [][] arrayOfDouble = createArrayOfDoubles(4, 6, 0, 1);
		assertEquals(0, arrayOfDouble[0][0], 0);
	}
	
	private double[][] createArrayOfDoubles(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		double [][] arrayOfDouble = new double[i][j];
//		Arrays.fill(
		return arrayOfDouble;
	}
}
