package CS310;
import java.util.ArrayList;
import java.util.Vector;

public class destination {
	public String name;
	public boolean find;
	public ArrayList<flight> neighbors;
	/**
	 * The constructor for destination class
	 * @param name = the name of the city you are creating
	 */
	public destination(String name) {
		this.name = name;
		this.find = false;
		this.neighbors = new ArrayList<flight>();
	}
	/**
	 * addNeighbor takes a flight and adds it to the destination to create an edge in the graph
	 * @param f = the flight connecting the destination and the neighbor
	 */
	public void addNeighbor(flight f) {
		this.neighbors.add(f);
	}
}
