package junittest;


import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstrings {

	@Test
	public void test() {
		junitfunctions junit = new junitfunctions();
		String result = junit.AddStrings("Hello", " World");
		assertEquals("Hello World",result);
	}

}
