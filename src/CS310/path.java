package CS310;
import java.util.ArrayList;
import java.util.Vector;

public class path {
	public int totalCost;
	public ArrayList<String> totalPath;
	
	/**
	 * Constructor for path class
	 * @param start = the starting point of the searchMap
	 */
	public path(String start) {
		totalCost = 0;
		totalPath = new ArrayList<String>();
		totalPath.add(start);
	}
	/**
	 * This function grows the path 
	 * @param f = flight that is added to the path
	 */
	public void addToPath(flight f) {
		totalPath.add(f.end.name);
		totalCost += f.price;
	}
	/**
	 * printPath prints the current path and the price accociated with the path
	 * @param output = the string that is building and in the end written to the file
	 * @return the string to write to file
	 */
	public String printPath(String output) {
		for(int i = 0; i < totalPath.size(); i++) {
			output += totalPath.get(i) + " ";
		}
		output += "    $" + totalCost;
		System.out.println(output);
		return output;
	}
	/**
	 * pop removes the city from the path and decreases the cost accociated with that city
	 * @param cost = the cost of the flight that you are removing 
	 */
	public void pop(int cost) {
		totalPath.remove(totalPath.size()-1);
		totalCost -= cost;
	}
	
	
}
