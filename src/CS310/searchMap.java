package CS310;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class searchMap {
	public static String search(String point, flightMap map, path totalPath, String output) {
		destination d = map.destinationMap.get(point);
		if(d.find == false) {
			d.find = true;
			totalPath.printPath(output);
			for(int i =0; i < d.neighbors.size(); i++) {
				totalPath.addToPath(d.neighbors.get(i));
				search(d.neighbors.get(i).end.name, map, totalPath, output);
				totalPath.pop(d.neighbors.get(i).price);
			}
		}
		return output;
	}
	
	/**
	 * Main will take in the input file and parse it, adding each flight to the map
	 */
	public static void main(String[] args) {	
		flightMap map = new flightMap();
		FileReader fr = null;
		BufferedReader br = null;
		String startingPoint = null;
		try {
			fr = new FileReader("input.txt");
			br = new BufferedReader(fr);
			startingPoint = br.readLine();
			map.addStart(startingPoint);
			String buffer = null;
			int price;
			String dests[];
			while((buffer = br.readLine()) != null) {
				dests = buffer.split(" ");
				price = Integer.parseInt(dests[2]);
				if(!map.destinationMap.containsKey(dests[0])) {
					destination d = new destination(dests[0]);
					map.destinationMap.put(dests[0], d);
				}
				map.addDestination(dests[0], dests[1], price);
			}
			
		} catch (FileNotFoundException fnfe) { 
			System.out.println("This file does not exist");
		}  catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException ioe) {
					System.out.print(ioe.getMessage());
				}
			}
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException ioe) {
					System.out.print(ioe.getMessage());
				}
			}
		}
		path p = new path(startingPoint);
		String output = " ";
		String finalOutput = search(startingPoint, map, p, output);
		
		FileWriter fw;
		try {
			fw = new FileWriter("output.txt");
			System.out.println(finalOutput);
			fw.write(finalOutput);
			fw.close();
		} catch (IOException e) {
			System.out.println("ioe exception");
		}
	}
}
