package thinking.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExcerciseTwoUnitTest {

	@Test
	public void testCreateArrayOfBerylliumSpheresTwo() {
		BerylliumSphere [] spheres = BerylliumSpheres.createArrayOfSpheres(2);
		assertEquals(2, spheres.length);
		assertEquals("thinking.arrays.BerylliumSphere", spheres[0].getClass().getName());
//		assertEquals(new BerylliumSphere[] { new BerylliumSphere(),  new BerylliumSphere()}, spheres);
	}
	
	@Test
	public void testCreateArrayOfBerylliumSpheresZero() {
		BerylliumSphere [] spheres = BerylliumSpheres.createArrayOfSpheres(0);
		assertEquals(0, spheres.length);
	}
	
	@Test
	public void testCreateArrayOfBerylliumSpheresTwoThousand() {
		BerylliumSphere [] spheres = BerylliumSpheres.createArrayOfSpheres(2000);
		assertEquals(2000, spheres.length);
		assertEquals("thinking.arrays.BerylliumSphere", spheres[153].getClass().getName());
	}
	
	
}
