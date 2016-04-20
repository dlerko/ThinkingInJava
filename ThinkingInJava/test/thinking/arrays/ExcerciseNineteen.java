package thinking.arrays;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ExcerciseNineteen {

	@Test
	public void testPOJObject() {
		
		assertNotNull(new ExcerciseNineteenPojo(0));
	}
	
	@Test
	public void testArraOfPOJOs() {
		ExcerciseNineteenPojo [] pojos = new ExcerciseNineteenPojo[6];
		Arrays.fill(pojos, new ExcerciseNineteenPojo(5));
		assertEquals(6, pojos.length);
		assertEquals(5, pojos[0].value);
	}

	@Test
	public void testArrayEquallity() {
		ExcerciseNineteenPojo [] pojosLeft = new ExcerciseNineteenPojo[6];
		Arrays.fill(pojosLeft, new ExcerciseNineteenPojo(5));
		
		ExcerciseNineteenPojo [] pojosRight = new ExcerciseNineteenPojo[6];
		Arrays.fill(pojosRight, new ExcerciseNineteenPojo(5));
		
		assertTrue(Arrays.equals(pojosLeft, pojosRight));
	}
	
}

class ExcerciseNineteenPojo {
	int value;
	
	public ExcerciseNineteenPojo(int value) {
		this.value = value;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExcerciseNineteenPojo other = (ExcerciseNineteenPojo) obj;
		if (value != other.value)
			return false;
		return true;
	}



	public boolean equals(ExcerciseNineteenPojo obj) {
		return value == obj.value;
	}
}