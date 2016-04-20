package thinking.arrays;

import org.junit.Test;

public class ExerciseOneUnitTest {
	
	@Test
	public void testPassBerylliumSpheresDynamicArgument() {
		
		BerylliumSpheres.passArrayOfBerylliumSpheres(new BerylliumSphere [] { new BerylliumSphere(), new BerylliumSphere()});
	}
	
	@Test
	public void testPassBerylliumSpheresStaticArgument() {
		
		BerylliumSphere [] spheres = new BerylliumSphere[2];
		spheres[0] = new BerylliumSphere();
		spheres[1] = new BerylliumSphere();
		BerylliumSpheres.passArrayOfBerylliumSpheres(new BerylliumSphere [] { new BerylliumSphere(), new BerylliumSphere()});
	}
}
