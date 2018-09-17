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
		assertEquals(true, fm.destinationMap.containsKey("P"));
	}
	@Test
	/**
	 * tests the function addDestination in the fligthMap class by adding a new destination and seeing if the city is in the map and the flight has a price
	 */
	public void testAddDestination() {
		flightMap fm = makeFlightMap();
		fm.addDestination("P", "E", 150);
		assertEquals(fm.destinationMap.containsKey("E"), true);
		assertEquals(150, fm.destinationMap.get("P").neighbors.get(0).price);
	}
	/**
	 * makes a flightMap to use during testing
	 * @return flightMap
	 */
	public static flightMap makeFlightMap() {
		flightMap fm = new flightMap();
		fm.addStart("P");
		return fm;
	}

}
