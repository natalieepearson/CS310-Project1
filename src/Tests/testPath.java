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
		destination a = new destination("A");
		destination b = new destination("B");
		flight f = new flight(150, a, b);
		p.addToPath(f);
		assertEquals(p.totalPath.isEmpty(), false);
		
	}
	/**
	 * tests printPath function in path class by printing out the path 
	 */
	public void testPrintPath() {
		path p = makePath();
		String output = "";
		assertEquals(p.printPath(output, "B"), "A B     $150");
	}
	/**
	 * tests pop function in path class by poping from the path and making sure the total cost is less that cost 
	 */
	public void testPop() {
		path p = makePath();
		p.pop(150);
		assertEquals(p.totalCost, 0);
	}
	/**
	 * makes a static path for testing purposes
	 * @return
	 */
	public static path makePath() {
		path p = new path("A");
		return p;
	}

}
