package thinking.arrays;

public class BerylliumSpheres {

	public static void passArrayOfBerylliumSpheres(BerylliumSphere[] berylliumSpheres) {
//		 TODO Auto-generated method stub
		
	}

	public static BerylliumSphere[] createArrayOfSpheres(int i) {
		// TODO Auto-generated method stub
		BerylliumSphere [] spheres = new BerylliumSphere[i];
		for(int x = 0; x < i; x++) {
			spheres[x] = new BerylliumSphere();
		}
		return spheres;
	}

}
