package CS310;

public class flight {
	public int price;
	public destination start;
	public destination end;
	/**
	 * Contructor for flight class
	 * @param price = price of the flight
	 * @param start = the starting point of the flight
	 * @param end = the ending point of the flight
	 */
	public flight(int price, destination start, destination end) {
		this.price = price;
		this.start = start;
		this.end = end;
	}
}
