import javax.swing.*;
import java.awt.*;

public class gridLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Grid Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3,3));
		for(int i=1; i<=9;i++) {
			buttonPanel.add(new JButton("Button "+i));
		}
		container.add(buttonPanel,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}

}
