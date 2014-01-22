package Item.Pizza;

import Item.Item;


public class Pizza extends Item {
	
	Topics pepperoni = 		new Topics("pepperoni",		false, 0.25);	// MEATS
	Topics ham = 			new Topics("ham", 			false, 0.25);
	Topics beef = 			new Topics("beef",			false, 0.25);
	Topics italian_ham = 	new Topics("italian_ham",	false, 0.25);
	Topics bacon = 			new Topics("bacon", 		false, 0.25);
	Topics anchovies = 		new Topics("anchovies",		false, 0.25);
	Topics chicken = 		new Topics("chicken", 		false, 0.25);
	Topics mushrooms = 		new Topics("mushrooms", 	false, 0.25);	// VEGGIES
	Topics peppers = 		new Topics("peppers", 		false, 0.25);
	Topics onions = 		new Topics("onions", 		false, 0.25);
	Topics olives = 		new Topics("olives", 		false, 0.25);
	Topics tomato = 		new Topics("tomato", 		false, 0.25);
	Topics jalapenos = 		new Topics("jalapenos",		false, 0.25);
	Topics pineapple = 		new Topics("pineapple", 	false, 0.25);
	
	
	Topics [] topicsArray = {pepperoni, ham, beef, italian_ham, bacon, anchovies, chicken, mushrooms, peppers, onions, olives, tomato, jalapenos, pineapple};	
	
	IngredientAmount cheese = IngredientAmount.REGULAR;
	IngredientAmount sauce = IngredientAmount.REGULAR;
	
	Crust crust = Crust.Hand;
	PizzaSize size = PizzaSize.large;
	
	public Pizza() {
		TotalCost += cheese.getCost();
		TotalCost += sauce.getCost();
		TotalCost += size.getCost();
		
	}
	
	public void setCheese(int i) {
		switch (i) {
		case 0:	TotalCost -= cheese.getCost();
				cheese = IngredientAmount.NONE;
				TotalCost += cheese.getCost();
				break;
		case 1:	TotalCost -= cheese.getCost();
				cheese = IngredientAmount.EASY;
				TotalCost += cheese.getCost();
				break;
		case 2:	TotalCost -= cheese.getCost();
				cheese = IngredientAmount.REGULAR;
				TotalCost += cheese.getCost();
				break;
		case 3:	TotalCost -= cheese.getCost();
				cheese = IngredientAmount.EXTRA;
				TotalCost += cheese.getCost();
				break;
		}
		
	}
	
	public void setSauce(int i) {
		switch (i) {
		case 0:	TotalCost -= sauce.getCost();
				sauce = IngredientAmount.NONE;
				TotalCost += sauce.getCost();
				break;
		case 1:	TotalCost -= sauce.getCost();
				sauce = IngredientAmount.EASY;
				TotalCost += sauce.getCost();
				break;
		case 2:	TotalCost -= sauce.getCost();
				sauce = IngredientAmount.REGULAR;
				TotalCost += sauce.getCost();
				break;
		case 3:	TotalCost -= sauce.getCost();
				sauce = IngredientAmount.EXTRA;
				TotalCost += sauce.getCost();
				break;
		}
		
	}
	
	public void setCrust(int i){
		switch (i) {
		case 1: crust = Crust.Hand;
				break;
		case 2: crust = Crust.Pan;
				break;
		case 3: crust = Crust.Stuffed;
				break;
		case 4: crust = Crust.Thin;
				break;
		case 5: crust = Crust.Cheese;
				break;
		}
	}
	
	
	public void setIngredient(String s, boolean x) {
		for(Topics z : topicsArray) {
			if(z.getID() == s) {
				z.setSelected(x);
			}
		}
	}
	
	public double getCheeseCost() {
		return cheese.getCost();
		
	}
	
	public double getSauceCost() {
		return sauce.getCost();
		
	}
	
	public void setSize(int i) {
		switch (i) {
		case 1:	TotalCost -= size.getCost(); 
				size = PizzaSize.small;
				TotalCost += size.getCost();
				break;
		case 2:	TotalCost -= size.getCost(); 
				size = PizzaSize.medium;
				TotalCost += size.getCost();
				break;
		case 3:	TotalCost -= size.getCost(); 
				size = PizzaSize.large;
				TotalCost += size.getCost();
				break;
		}
	}
	
	public double getTotalCost() {
		return super.getTotalCost();		// Redundant(?), already have method in Item.
	}
	

	public void setPizzaDefault() {
		setCheese(2);
		setSauce(2);
		setSize(3);
		setCrust(1);
		
		for (Topics x : topicsArray) {
			x.setSelected(false);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}

	




















