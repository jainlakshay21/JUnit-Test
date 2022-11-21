package junittest;



import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		junitfunctions junit = new junitfunctions();
		int result = junit.AddNumbers(100, 200);
		assertEquals(300,result);
	}

}