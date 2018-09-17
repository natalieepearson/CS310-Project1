package CS310;
import java.util.ArrayList;
import java.util.Vector;

public class destination {
	public String name;
	public boolean find;
	public ArrayList<flight> neighbors;
	public destination(String name) {
		this.name = name;
		this.find = false;
		this.neighbors = new ArrayList<flight>();
	}
	public void addNeighbor(flight f) {
		this.neighbors.add(f);
	}
}
