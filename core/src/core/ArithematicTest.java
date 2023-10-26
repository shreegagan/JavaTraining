package core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Arithematic test")
class ArithematicTest {
	private Arithematic arithematic ;//= new ArithematicImpl();
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All..");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All..");
	}
	
	@BeforeEach
	void anything() {
		System.out.println("Init..");
		arithematic = new ArithematicImpl();
	}
	@AfterEach
	void anything1() {
		System.out.println("Destroy..");
		
	}
	

	@Test @DisplayName("Addithion test")
	void testAdd() {
		assertEquals(5, arithematic.add(2, 3));
		assertEquals(5, arithematic.add(3, 2));
		assertEquals(5, arithematic.add(5, 0));
		assertEquals(5, arithematic.add(5, -0));
		assertEquals(-5, arithematic.add(-2, -3));
		assertEquals(-5, arithematic.add(-8, 3));

	}

	@Test
	void testSub() {
		
		
	}

	@Test
	void testMul() {
	}
	@Test
	void testDivideByZero() {
		assertThrows(DivideByZero.class,()->arithematic.div(5,0));
	}

	@Test
	void testDiv() {
		assertEquals(1.6666, 5.0/3,0.001,"value not in range");

		assertEquals(2, arithematic.div(4, 2));
		assertEquals(2, arithematic.div(-6, -3));
		try {
			assertEquals(5, arithematic.div(4, 0));
			fail("Should have through exception");
		} catch (DivideByZero ex) {

		}
	}

}
