package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CS310.destination;
import CS310.flight;

class testDestination {

	@Test
	/**
	 * tests if addNeighbor function in the destination class works by adding a neighbor and making sure that the destination's neighbor list is not empty
	 */
	public void testAddNeighbor() {
		destination a = new destination("A");
		destination b = new destination("B");
		flight f = new flight(150, a, b);
		a.addNeighbor(f);
		assertEquals(a.neighbors.isEmpty(), false);
	}

}
