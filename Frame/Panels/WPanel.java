package Frame.Panels;
import java.awt.*;
import javax.swing.*;


public class WPanel extends JPanel {
	
	public WPanel() {
		setBackground(Color.GREEN);
		setPreferredSize (new Dimension(250, 400));
		setLayout(null);
		
		JLabel TotalCostL = new JLabel("Total Cost:");
		TotalCostL.setFont(new Font("Droid Sans", Font.BOLD, 22));
		TotalCostL.setBounds(30, 50, 124, 30);
		add(TotalCostL);
		
		JLabel CurrencySignL = new JLabel("$");
		CurrencySignL.setFont(new Font("Droid Sans", Font.BOLD, 22));
		CurrencySignL.setBounds(149, 50, 17, 30);
		add(CurrencySignL);
		
		JLabel CrustL = new JLabel("Crust:");
		CrustL.setFont(new Font("Droid Sans", Font.BOLD, 13));
		CrustL.setBounds(30, 100, 70, 15);
		add(CrustL);
		
		JComboBox CrustCB = new JComboBox();
		CrustCB.setModel(new DefaultComboBoxModel(new String[] {"Hand-Tossed Style Pizza", "Pan Pizza", "Stuffed Crust Pizza", "Thin 'N Crispy Pizza", "3 Cheese Stuffed Pizza"}));
		CrustCB.setSelectedIndex(0);
		CrustCB.setMaximumRowCount(5);
		CrustCB.setFont(new Font("Droid Sans", Font.BOLD, 13));
		CrustCB.setBounds(30, 118, 190, 24);
		add(CrustCB);
		
		JLabel SizesL = new JLabel("Sizes:");
		SizesL.setFont(new Font("Droid Sans", Font.BOLD, 13));
		SizesL.setBounds(30, 177, 70, 15);
		add(SizesL);
		
		JRadioButton Large_PizzaRB = new JRadioButton("Large");
		Large_PizzaRB.setBounds(30, 197, 149, 23);
		add(Large_PizzaRB);
		
		JRadioButton Medium_PizzaRB = new JRadioButton("Medium");
		Medium_PizzaRB.setBounds(30, 224, 149, 23);
		add(Medium_PizzaRB);
		
		JRadioButton Small_PizzaRB = new JRadioButton("Small");
		Small_PizzaRB.setBounds(30, 251, 149, 23);
		add(Small_PizzaRB);
		
		ButtonGroup RBGroup = new ButtonGroup();
		RBGroup.add(Small_PizzaRB);
		RBGroup.add(Medium_PizzaRB);
		RBGroup.add(Large_PizzaRB);
		Large_PizzaRB.setSelected(true);
		
	}

}
