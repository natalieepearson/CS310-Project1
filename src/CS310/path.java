package CS310;
import java.util.ArrayList;
import java.util.Vector;

public class path {
	public int totalCost;
	public ArrayList<String> totalPath;
	
	public path(String start) {
		totalCost = 0;
		totalPath = new ArrayList<String>();
		totalPath.add(start);
	}
	
	public void addToPath(flight f) {
		totalPath.add(f.end.name);
		totalCost += f.price;
	}
	
	public String printPath(String output) {
		for(int i = 0; i < totalPath.size(); i++) {
			output += totalPath.get(i) + " ";
		}
		output += "    $" + totalCost;
		System.out.println(output);
		return output;
	}
	
	public void pop(int cost) {
		totalPath.remove(totalPath.size()-1);
		totalCost -= cost;
	}
	
	
}
