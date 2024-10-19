package Lab3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {

		private GradeBook gradeb1;
		private GradeBook gradeb2; 
		
	@BeforeEach
	void setUp() throws Exception {
		gradeb1= new GradeBook(5); 
		gradeb2= new GradeBook (5);
		
		gradeb1.addScore(60);
		gradeb1.addScore(78);
		
		gradeb2.addScore(90);
		gradeb2.addScore(98);
	}

	@AfterEach
	void tearDown() throws Exception {
		gradeb1=null;
		gradeb2=null;
	}

	@Test
	void testAddScore() {
		
	
		
		assertTrue(gradeb1.toString().equals("60.0 78.0"));
		assertEquals(2, gradeb1.getScoreSize());
		
		assertTrue(gradeb2.toString().equals("90.0 98.0"));
		assertEquals(2, gradeb2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(138, gradeb1.sum(), .0001);
		assertEquals(188, gradeb2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(60.0, gradeb1.minimum(), 0.001);
		assertEquals(90.0, gradeb2.minimum(), 0.001);
		
	}

	@Test
	void testFinalScore() {
		assertEquals(78.0, gradeb1.finalScore(), 0.0001);
		assertEquals(98.0, gradeb2.finalScore(), 0.0001);
		
	}

}
