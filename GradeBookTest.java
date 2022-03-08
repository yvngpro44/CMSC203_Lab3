import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class GradeBookTest {
	//Task 3
	private GradeBook g1;
	private GradeBook g2;

	@BeforeEach
	void setUp() throws Exception 
	{
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(80);
		g2.addScore(90);
	}
	@AfterEach
	void tearDown() throws Exception 
	{
		g1 = null;
		g2 = null;
	}
	@Test
	void testAddScore() 
	{
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("80.0 90.0 "));
		assertEquals(2,g1.getScoreSize(), .0001);
		assertEquals(2,g2.getScoreSize(), .0001);
	}

	@Test
	void testSum() 
	{
		assertEquals(125,g1.sum(), .0001);
		assertEquals(170,g2.sum(), .0001);
	}

	@Test
	void testMinimum() 
	{
		assertEquals(50,g1.minimum(), .0001);
		assertEquals(80,g2.minimum(), .0001);
	}

	@Test
	void testFinalScore() 
	{
		assertEquals(75,g1.finalScore(), .0001);
		assertEquals(90,g2.finalScore(), .0001);
	}

}

