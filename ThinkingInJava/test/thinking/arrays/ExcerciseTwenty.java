package thinking.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ExcerciseTwenty {

	@Test
	public void testCreateMultiDimensionalArray() {
		
		Integer[][] myArray = new Integer[2][2];
		assertEquals(2, myArray.length);
	}
	
	@Test
	public void testFillMultiDimensionalArray() {
		
		Integer[][] myArray = new Integer[2][2];
		assertEquals(2, myArray.length);
		Arrays.fill(myArray[0], 1);
		Arrays.fill(myArray[1], 2);
//		System.out.println(Arrays.deepToString(myArray));
		
	}
	
	@Test
	public void testEqualityMultiDimensionalArrays() {
		Integer[][] myArray = new Integer[2][2];
		assertEquals(2, myArray.length);
		Arrays.fill(myArray[0], 1);
		Arrays.fill(myArray[1], 2);
		
		Integer[][] myArrayTwo = new Integer[2][2];
		assertEquals(2, myArrayTwo.length);
		Arrays.fill(myArrayTwo[0], 1);
		Arrays.fill(myArrayTwo[1], 2);
		
		assertTrue(Arrays.deepEquals(myArray, myArrayTwo));
	}
}
