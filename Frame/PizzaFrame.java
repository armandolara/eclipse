package Frame;
import javax.swing.*;

import Frame.Panels.CPanel;
import Frame.Panels.EPanel;
import Frame.Panels.NPanel;
import Frame.Panels.WPanel;

import java.awt.*;


public class PizzaFrame extends JFrame {
	
	public PizzaFrame() {
		setSize(900, 500);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		NPanel nPanel = new NPanel();
		getContentPane().add(nPanel, BorderLayout.NORTH);
		
		CPanel cPanel = new CPanel();
		getContentPane().add(cPanel, BorderLayout.CENTER);
		
		WPanel wPanel = new WPanel();
		getContentPane().add(wPanel, BorderLayout.WEST);
		
		EPanel ePanel = new EPanel();
		getContentPane().add(ePanel, BorderLayout.EAST);
		
		
	}
}
