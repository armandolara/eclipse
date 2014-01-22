package Item.Pizza;

import Item.Item;

public class Topics {
	
	String IDname;
	boolean selectedBool;
	double cost;
	
	public Topics (String s, boolean i, double d) {
		IDname = s;
		selectedBool = i;
		cost = d;
		if(i == true)
			Item.addToTotalCost(d);
	}
	
	public void setSelected(boolean i) {
		if(selectedBool ==  false) {
			selectedBool = i;
			if(i == true)
				Item.addToTotalCost(cost);
		}
		if(selectedBool == true) {
			Item.subFromTotalCost(cost);
			selectedBool = i;
			if(i == true)
				Item.addToTotalCost(cost);
		}
	}
	
	public boolean getSelected() {
		return selectedBool;
	}
	
	public String getID() {
		return IDname;
	}
	
	public void getSelectedString() {
		if (selectedBool == true)
			System.out.println("Value is: true");
		else
			System.out.println("Value is: false");
	}

}
