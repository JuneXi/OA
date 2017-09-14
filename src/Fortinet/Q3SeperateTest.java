import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SeperateTest {
	
	@Test
	public void testSeperate(){
		ArrayList<Integer> case1 = new ArrayList<Integer>();
		case1.add(1);
		case1.add(2);
		case1.add(3);
		case1.add(6);
		case1.add(3);
		case1.add(3);
		Seperate sep = new Seperate();
		//true
		assertTrue(sep.separate(case1, 1));
		//true   (3, 6) (1, 2, 3, 3)
		assertTrue(sep.separate(case1, 2));
		//true   (1, 2, 3) (6) (3, 3)
		assertTrue(sep.separate(case1, 3));
		
		assertFalse(sep.separate(case1, 4));
		assertFalse(sep.separate(case1, 10));
		
	}
	

}
