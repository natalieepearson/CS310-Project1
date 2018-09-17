package CS310;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Stack;

public class flightMap {
	public HashMap<String, destination> destinationMap;
	public flightMap() {
		this.destinationMap = new HashMap<String, destination>();
	}
	
	/**
	 * This function adds a new city to the destinationMap while also updating the neighbor list of the start city. 
	 * @param start = The city name that the flight takes off from
	 * @param end = The destination city that the flight goes to 
	 * @param price = the price of the flight
	 */
	public void addDestination(String start, String end, int price) {
		if(!this.destinationMap.containsKey(end)) {
			destination newDest = new destination(end);
			this.destinationMap.put(end, newDest);
		}
		flight f = new flight(price, this.destinationMap.get(start), this.destinationMap.get(end));
		this.destinationMap.get(start).addNeighbor(f);
	}
	/**
	 * This function adds the starting point of the map
	 * @param start = the city that you start on
	 */
	public void addStart(String start) {
		destination d = new destination(start);
		destinationMap.put(start, d);
	}
	
	
}
