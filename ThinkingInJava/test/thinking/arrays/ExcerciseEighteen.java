package thinking.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ExcerciseEighteen {

	@Test
	public void testCopyArrayOfBerylliumSpheres() {
		BerylliumSphere [] fromSpheres = new BerylliumSphere[3];
		Arrays.fill(fromSpheres, new BerylliumSphere());
		assertEquals(3, fromSpheres.length);
		
		BerylliumSphere [] toSpheres = new BerylliumSphere[3];
		System.arraycopy(fromSpheres, 0,toSpheres, 0, fromSpheres.length);
		assertEquals(3, fromSpheres.length);
		assertEquals(fromSpheres[0].getClass().getName(),"thinking.arrays.BerylliumSphere");
		
		assertEquals(fromSpheres[0].hashCode(), toSpheres[0].hashCode());
		assertEquals(fromSpheres, toSpheres);
	}
}

