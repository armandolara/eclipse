package Item.Pizza;

public enum IngredientAmount {
	
	REGULAR(0.10), EASY(0.05), EXTRA(0.25), NONE(0.0);
	
	double Cost;
	
	IngredientAmount(double d) {
		this.Cost = d;
	}
		
	
	public double getCost() {
		return Cost;
	}
	
}

//	USED FOR CHEESE AND SAUCE
