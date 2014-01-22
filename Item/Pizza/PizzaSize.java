package Item.Pizza;

public enum PizzaSize {
	
	large(8.99), medium(7.99), small(6.99);
	
	double Cost;
	
	PizzaSize(double c){
		this.Cost = c;
	}

	public double getCost() {
		return Cost;
	}
	
}
