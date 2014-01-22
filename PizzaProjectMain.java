/*	This is PizzaProjectMain. The main object created and used here is 'Pizza' but other
 * 	objects can exist, such as 'Drinks'.
 * 
 *  The total cost of the pizza (and drinks/etc if existing) is held in the parent class 'Item'
 *  which holds the variable TotalCost (double) where this value is stored.
 * 
 * 	Pizza uses:	Topics 				[ class Topics(String name, boolean yes/no-onPizza, double Cost)]
 * 				Cheese & sauce 		[ enum IngredientAmount() 	Regular/Extra/Easy/None]
 *		[X]		Pizza size		 	[ enum PizzaSize()   		Large/Medium/Small]
 *		[X]		Crust				[ enum Crust()			Hand/Pan/Stuffed/Thin/Cheese]
 * 
 * 	Drinks use:	CURRENTLY NONE EXISTING
 * 
 * 	# Method setPizzaDefault() restores pizza to default settings
 * 
 *  Packages are constructed as follows: ( '+' Packages and '-' java files ) 
 *  	
 *  	+ Item
 *  		- Item
 *  		+ Pizza
 *  			- Pizza
 *  			- IngredientAmount
 *  			- Crust
 *  			- PizzaSize
 *  			- Topics
 *  
 *  	+ Frame
 *  		- PizzaFrame
 *  		+ Panels
 *  			- CPanel
 *  			- EPanel
 *  			- NPanel
 *  			- WPanel
 * 
 */

import Frame.PizzaFrame;
import Item.Pizza.Pizza;

public class PizzaProjectMain {
	
	public static void main(String[] args) {
		//System.out.println("Chuck testaaaaa");
		
		PizzaFrame myFrame = new PizzaFrame();
		//myFrame.setUndecorated(true);
		myFrame.setResizable(false);
		myFrame.setVisible(false);
		
		
		Pizza myPizza = new Pizza();
		
		
		System.out.printf("Total cost calling SUPER: %.2f\n", myPizza.getTotalCost());
		//System.out.printf("Cost of cheese ORIGINAL: %.2f\n", myPizza.getCheeseCost());
		//System.out.println("Cost of cheese ORIGINAL: " + myPizza.getCheeseCost());
		//myPizza.setCheese(3);
		//System.out.println("Cost of cheese NEW: " + myPizza.getCheeseCost());
		
		//System.out.println((? extends Object)"second");
		
		
		myPizza.setSize(1);
		
		
		myPizza.setCheese(0);
		myPizza.setCheese(3);
		myPizza.setCheese(2);
		myPizza.setCheese(3);
		
		myPizza.setIngredient("beef", true);
		myPizza.setIngredient("italian_ham", true);
		myPizza.setIngredient("bacon", true);
		
		myPizza.setSauce(0);
		myPizza.setSauce(0);
		myPizza.setSauce(3);
		
		System.out.printf("Total cost calling SUPER: %.2f\n", myPizza.getTotalCost());
		myPizza.setPizzaDefault();
		System.out.printf("Total cost calling SUPER: %.2f\n", myPizza.getTotalCost());
		
		

		//------------------------------------------------------------------------------------
		//
		//	The core of the program is complete. I just need to plug everything with its GUI 
		//		and it'll be ready to work
		//
		//
		//	
		//	
		
		
	}

}
