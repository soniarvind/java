import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.ivl.Calculate;



public class CalculateTest {
	
	@Test
	public void sum() {
		Calculate add = new Calculate();
	
		assertEquals(4, add.sum(2, 2));
	}

}
