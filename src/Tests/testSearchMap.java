package Tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CS310.destination;
import CS310.flightMap;
import CS310.path;
import CS310.searchMap;

class testSearchMap {

	@Test
	/**
	 * tests the search function in the searchMap class by creating a map and searching the map, outputting the paths
	 */
	public void testSearch() {
		flightMap fm = makeMap();
		searchMap sm = new searchMap();
		String temp = "";
		path p = new path("A");
		String output = sm.search("A", fm, p, temp);
		assertEquals(output, "A                   A                   $0\n" + 
				"B                   A B                   $150\n" + 
				"C                   A B C                   $200\n");
	}
	/**
	 * makes a map for the searchMap testing purposes 
	 * @return a filled flightMap
	 */
	public static flightMap makeMap() {
		flightMap map = new flightMap();
		map.addStart("A");
		map.addDestination("A", "B", 150);
		map.addDestination("B", "C", 50);
		return map;
	}

}
