package Frame.Panels;
import java.awt.*;
import javax.swing.*;


public class CPanel extends JPanel {

	public CPanel() {
		setBackground(Color.ORANGE);
		setPreferredSize (new Dimension(350, 380));
		setLayout(new GridLayout(1, 0, 0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		add(tabbedPane);
		
		JPanel Tab1_MeatVeg = new JPanel();
		tabbedPane.addTab("Meats & Veggies", null, Tab1_MeatVeg, null);
		Tab1_MeatVeg.setLayout(new BorderLayout(0, 0));
		
		JPanel Tab_WestMV = new JPanel();
		Tab1_MeatVeg.add(Tab_WestMV, BorderLayout.WEST);
		Tab_WestMV.setLayout(null);
		Tab_WestMV.setPreferredSize (new Dimension(175,380));
		
		JLabel TabMeatsL = new JLabel("Meats:");
		TabMeatsL.setBounds(12, 12, 52, 23);
		TabMeatsL.setFont(new Font("Droid Sans", Font.BOLD, 14));
		Tab_WestMV.add(TabMeatsL);
		
		JCheckBox chckbxPepperoni = new JCheckBox("Pepperoni");
		chckbxPepperoni.setBounds(12, 43, 129, 23);
		Tab_WestMV.add(chckbxPepperoni);
		
		JCheckBox chckbxHam = new JCheckBox("Ham");
		chckbxHam.setBounds(12, 70, 129, 23);
		Tab_WestMV.add(chckbxHam);
		
		JCheckBox chckbxPork = new JCheckBox("Pork");
		chckbxPork.setBounds(12, 97, 129, 23);
		Tab_WestMV.add(chckbxPork);
		
		JCheckBox chckbxBeef = new JCheckBox("Beef");
		chckbxBeef.setBounds(12, 124, 129, 23);
		Tab_WestMV.add(chckbxBeef);
		
		JCheckBox chckbxItalianHam = new JCheckBox("Italian Ham");
		chckbxItalianHam.setBounds(12, 151, 129, 23);
		Tab_WestMV.add(chckbxItalianHam);
		
		JCheckBox chckbxBacon = new JCheckBox("Bacon");
		chckbxBacon.setBounds(12, 178, 129, 23);
		Tab_WestMV.add(chckbxBacon);
		
		JCheckBox chckbxAnchovies = new JCheckBox("Anchovies");
		chckbxAnchovies.setBounds(12, 205, 129, 23);
		Tab_WestMV.add(chckbxAnchovies);
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken");
		chckbxChicken.setBounds(12, 232, 129, 23);
		Tab_WestMV.add(chckbxChicken);
		
		JLabel lblNewLabel = new JLabel("Meats are $0.50");
		lblNewLabel.setBounds(12, 280, 129, 23);
		Tab_WestMV.add(lblNewLabel);
		
		JLabel lblExtraPerTopic = new JLabel("extra per topic");
		lblExtraPerTopic.setBounds(22, 300, 129, 15);
		Tab_WestMV.add(lblExtraPerTopic);
		
		JPanel Tab_EastMV = new JPanel();
		Tab1_MeatVeg.add(Tab_EastMV, BorderLayout.EAST);
		Tab_EastMV.setLayout(null);
		Tab_EastMV.setPreferredSize(new Dimension(175, 380));
		
		JLabel lblVeggies = new JLabel("Veggies:");
		lblVeggies.setFont(new Font("Droid Sans", Font.BOLD, 14));
		lblVeggies.setBounds(12, 12, 63, 23);
		Tab_EastMV.add(lblVeggies);
		
		JCheckBox chckbxMushrooms = new JCheckBox("Mushrooms");
		chckbxMushrooms.setBounds(12, 43, 129, 23);
		Tab_EastMV.add(chckbxMushrooms);
		
		JCheckBox chckbxPeppers = new JCheckBox("Peppers");
		chckbxPeppers.setBounds(12, 70, 129, 23);
		Tab_EastMV.add(chckbxPeppers);
		
		JCheckBox chckbxOnions = new JCheckBox("Onions");
		chckbxOnions.setBounds(12, 97, 129, 23);
		Tab_EastMV.add(chckbxOnions);
		
		JCheckBox chckbxOlives = new JCheckBox("Olives");
		chckbxOlives.setBounds(12, 124, 129, 23);
		Tab_EastMV.add(chckbxOlives);
		
		JCheckBox chckbxTomato = new JCheckBox("Tomato");
		chckbxTomato.setBounds(12, 151, 129, 23);
		Tab_EastMV.add(chckbxTomato);
		
		JCheckBox chckbxJalapenos = new JCheckBox("Jalapenos");
		chckbxJalapenos.setBounds(12, 178, 129, 23);
		Tab_EastMV.add(chckbxJalapenos);
		
		JCheckBox chckbxPineapple = new JCheckBox("Pineapple");
		chckbxPineapple.setBounds(12, 205, 129, 23);
		Tab_EastMV.add(chckbxPineapple);
		
		JLabel lblVeggiesAre = new JLabel("Veggies are $0.25");
		lblVeggiesAre.setBounds(12, 280, 129, 23);
		Tab_EastMV.add(lblVeggiesAre);
		
		JLabel label = new JLabel("extra per topic");
		label.setBounds(22, 300, 129, 15);
		Tab_EastMV.add(label);
		//setPreferredSize (new Dimension(175,380));
		
		JPanel Tab2_SauceCheese = new JPanel();
		tabbedPane.addTab("Sauce & Cheese", null, Tab2_SauceCheese, null);
		Tab2_SauceCheese.setLayout(new BorderLayout(0, 0));
		
		JPanel Tab_NorthSC = new JPanel();
		Tab2_SauceCheese.add(Tab_NorthSC, BorderLayout.NORTH);
		Tab_NorthSC.setLayout(null);
		Tab_NorthSC.setPreferredSize(new Dimension(350, 180));
		
		JLabel lblCheese = new JLabel("Cheese:");
		lblCheese.setBounds(12, 12, 70, 15);
		Tab_NorthSC.add(lblCheese);
		
		JRadioButton RegChRB = new JRadioButton("Reg. Cheese");
		RegChRB.setBounds(8, 35, 149, 23);
		Tab_NorthSC.add(RegChRB);
		
		JRadioButton ExtraChRB = new JRadioButton("Extra Cheese");
		ExtraChRB.setBounds(8, 62, 149, 23);
		Tab_NorthSC.add(ExtraChRB);
		
		JRadioButton EasyChRB = new JRadioButton("Easy on Cheese");
		EasyChRB.setBounds(8, 89, 149, 23);
		Tab_NorthSC.add(EasyChRB);
		
		JRadioButton NoChRB = new JRadioButton("No Cheese");
		NoChRB.setBounds(8, 116, 149, 23);
		Tab_NorthSC.add(NoChRB);
		
		ButtonGroup CheeseRBGroup = new ButtonGroup();
		CheeseRBGroup.add(RegChRB);
		CheeseRBGroup.add(ExtraChRB);
		CheeseRBGroup.add(EasyChRB);
		CheeseRBGroup.add(NoChRB);
		RegChRB.setSelected(true);
		
		JLabel label_1 = new JLabel("$0.10");
		label_1.setBounds(200, 39, 70, 15);
		Tab_NorthSC.add(label_1);
		
		JLabel label_2 = new JLabel("$0.25");
		label_2.setBounds(200, 66, 70, 15);
		Tab_NorthSC.add(label_2);
		
		JLabel label_3 = new JLabel("$0.05");
		label_3.setBounds(200, 93, 70, 15);
		Tab_NorthSC.add(label_3);
		
		JLabel lblFree = new JLabel("FREE");
		lblFree.setBounds(200, 120, 70, 15);
		Tab_NorthSC.add(lblFree);
		
		JPanel Tab_SouthSC = new JPanel();
		Tab2_SauceCheese.add(Tab_SouthSC, BorderLayout.SOUTH);
		Tab_SouthSC.setLayout(null);
		Tab_SouthSC.setPreferredSize(new Dimension(350, 180));
		
		JLabel lblSauce = new JLabel("Sauce:");
		lblSauce.setBounds(12, 12, 70, 15);
		Tab_SouthSC.add(lblSauce);
		
		JRadioButton RegSauceRB = new JRadioButton("Reg. Sauce");
		RegSauceRB.setBounds(8, 35, 149, 23);
		Tab_SouthSC.add(RegSauceRB);
		
		JRadioButton ExtraSauceRB = new JRadioButton("Extra Cheese");
		ExtraSauceRB.setBounds(8, 62, 149, 23);
		Tab_SouthSC.add(ExtraSauceRB);
		
		JRadioButton EasySauceRB = new JRadioButton("Easy on Sauce");
		EasySauceRB.setBounds(8, 89, 149, 23);
		Tab_SouthSC.add(EasySauceRB);
		
		JRadioButton NoSauceRB = new JRadioButton("No Sauce");
		NoSauceRB.setBounds(8, 116, 149, 23);
		Tab_SouthSC.add(NoSauceRB);
		
		ButtonGroup SauceRBGroup = new ButtonGroup();
		SauceRBGroup.add(NoSauceRB);
		SauceRBGroup.add(EasySauceRB);
		SauceRBGroup.add(ExtraSauceRB);
		SauceRBGroup.add(RegSauceRB);
		RegSauceRB.setSelected(true);
		
		JLabel label_4 = new JLabel("$0.10");
		label_4.setBounds(200, 39, 70, 15);
		Tab_SouthSC.add(label_4);
		
		JLabel label_5 = new JLabel("$0.25");
		label_5.setBounds(200, 66, 70, 15);
		Tab_SouthSC.add(label_5);
		
		JLabel label_6 = new JLabel("$0.05");
		label_6.setBounds(200, 93, 70, 15);
		Tab_SouthSC.add(label_6);
		
		JLabel lblFree_1 = new JLabel("FREE");
		lblFree_1.setBounds(200, 120, 70, 15);
		Tab_SouthSC.add(lblFree_1);
		
		
		
	}
}
