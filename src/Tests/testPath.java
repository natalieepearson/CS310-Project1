package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CS310.destination;
import CS310.flight;
import CS310.path;

class testPath {

	@Test
	/**
	 * tests the addToPath function in the path class by adding a flight to the path and making sure the path is not empty 
	 */
	public void testAddToPath() {
		path p = makePath();
		assertEquals(p.totalPath.isEmpty(), false);
		
	}
	@Test
	/**
	 * tests printPath function in path class by printing out the path 
	 */
	public void testPrintPath() {
		path p = makePath();
		String output = "";
		assertEquals(p.printPath(output, "B"), "B                   A B                   $150\n");
	}
	@Test
	/**
	 * tests pop function in path class by poping from the path and making sure the total cost is less that cost 
	 */
	public void testPop() {
		path p = makePath();
		p.pop(150);
		assertEquals(0, p.totalCost);
	}
	/**
	 * makes a static path for testing purposes
	 * @return
	 */
	public static path makePath() {
		path p = new path("A");
		destination a = new destination("A");
		destination b = new destination("B");
		flight f = new flight(150, a, b);
		p.addToPath(f);
		return p;
	}

}
