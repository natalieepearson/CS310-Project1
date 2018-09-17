package Tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CS310.flightMap;

public class testFlightMap {

	@Test
	/**
	 * tests the function addStart in the flightMap class by adding a city and seeing if the map contains that city
	 */
	public void testAddStart() {
		flightMap fm = makeFlightMap();
		fm.addStart("P");
		assertEquals(fm.destinationMap.containsKey("P"), true);
	}
	/**
	 * tests the function addDestination in the fligthMap class by adding a new destination and seeing if the city is in the map and the flight has a price
	 */
	public void testAddDestination() {
		flightMap fm = makeFlightMap();
		fm.addDestination("P", "E", 150);
		assertEquals(fm.destinationMap.containsKey("E"), true);
		assertEquals(fm.destinationMap.get("P").neighbors.get(0).price, 150);
	}
	/**
	 * makes a flightMap to use during testing
	 * @return flightMap
	 */
	public static flightMap makeFlightMap() {
		flightMap fm = new flightMap();
		return fm;
	}

}
