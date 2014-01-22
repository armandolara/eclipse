package Frame.Panels;
import javax.swing.*;
import java.awt.*;


public class EPanel extends JPanel {
	
	public EPanel() {
		setBackground(Color.LIGHT_GRAY);
		setPreferredSize (new Dimension(300, 400));
		setLayout(null);
		
		// DRINKS, SIZES, AMOUNT, & (S/M/L) LABELS --------------
		
		JLabel lblNewLabel = new JLabel("Drinks");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		lblNewLabel.setBounds(12, 12, 70, 15);
		add(lblNewLabel);
		
		JLabel lblSizes = new JLabel("Sizes");
		lblSizes.setFont(new Font("Dialog", Font.BOLD, 14));
		lblSizes.setBounds(123, 12, 51, 15);
		add(lblSizes);
		
		JLabel lblAmount = new JLabel("Amount");
		lblAmount.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAmount.setBounds(218, 12, 70, 15);
		add(lblAmount);
		
		JLabel lblSM = new JLabel("S / M / L");
		lblSM.setFont(new Font("Dialog", Font.BOLD, 10));
		lblSM.setBounds(123, 39, 70, 15);
		add(lblSM);
		
		//--------------------------------------------------------
		
		// LIST OF DRINKS
		
		newDrinkGUI("Coke", 65);
		newDrinkGUI("Diet Coke", 95);
		newDrinkGUI("Dr.Pepper", 125);
		newDrinkGUI("Sprite", 155);
		
		
	}

	private void newDrinkGUI(String name, int y_value) {
		JLabel lblDrink = new JLabel(name);
		lblDrink.setBounds(12, (y_value + 4), 70, 15);
		add(lblDrink);

		// DRINK SIZE RADIO BUTTONS & GROUP ----------------------
		
		JRadioButton smallDrRB = new JRadioButton("");
		smallDrRB.setBounds(96, y_value, 21, 23);
		add(smallDrRB);
		
		JRadioButton mediumDrRB = new JRadioButton("");
		mediumDrRB.setBounds(133, y_value, 21, 23);
		add(mediumDrRB);
		
		JRadioButton largeDrRB = new JRadioButton("");
		largeDrRB.setBounds(168, y_value, 21, 23);
		add(largeDrRB);
		
		ButtonGroup DrinkSizeGroup = new ButtonGroup();
		DrinkSizeGroup.add(largeDrRB);
		DrinkSizeGroup.add(mediumDrRB);
		DrinkSizeGroup.add(smallDrRB);
		mediumDrRB.setSelected(true);
		
		// DRINK AMOUNT COMBOBOX ---------------------------------
		
		JComboBox drinkAmountCB = new JComboBox();
		drinkAmountCB.setModel(new DefaultComboBoxModel(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		drinkAmountCB.setSelectedIndex(0);
		drinkAmountCB.setMaximumRowCount(11);
		drinkAmountCB.setBounds(218, (y_value - 1), 51, 24);
		add(drinkAmountCB);
	}

}
