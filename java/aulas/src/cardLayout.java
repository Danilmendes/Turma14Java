import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.*;

public class cardLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Card Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		
		// Add a Next JButton in a JPanel to the content pane
		JPanel buttonPanel = new JPanel();
		JButton nextButton = new JButton("Next");
		buttonPanel.add(nextButton);
		container.add(buttonPanel, BorderLayout.SOUTH);
		
		// Create a JPanel and set its layout to CardLayout
		JPanel cardPanel = new JPanel();
		CardLayout cardLayout = new CardLayout();
		cardPanel.setLayout(cardLayout);
		
		// Add five JButtons as cards to the painel
		for(int i=1 ; i<=5 ; i++) {
			JButton card = new JButton("Card "+ i);
			card.setPreferredSize(new Dimension(200,200));
			String cardName = "Card" + 1;
			cardPanel.add(card,cardName);
		}
		
		// Add the cardPanel to the content pane
		 container.add(cardPanel, BorderLayout.CENTER);
		 
		nextButton.addActionListener(e -> cardLayout.next(cardPanel));
		frame.pack();
		frame.setVisible(true);
	}
}
