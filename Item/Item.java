package Item;

public class Item {

	protected static double TotalCost = 0.0;
	
	public double getTotalCost() {
		return TotalCost;
	}
	
	public static void addToTotalCost(double amount) {
		TotalCost += amount;
	}
	
	public static void subFromTotalCost(double amount) {
		TotalCost -= amount;
	}
	
	
}

