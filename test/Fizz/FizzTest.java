package Fizz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzTest {

	Fizz fb;
	
	@BeforeEach
	void setUp() throws Exception {
		fb = new Fizz();
	}

	@Test
	void testFizzUn() {
		assertEquals(1, fb.fizzBuzz(1));
	}

}
