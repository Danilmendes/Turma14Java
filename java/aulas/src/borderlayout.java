import javax.swing.*;
import java.awt.*;

public class borderlayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Border Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		
		container.add(new JButton("Norte"), BorderLayout.NORTH);
		container.add(new JButton("Sul"), BorderLayout.SOUTH);
		container.add(new JButton("Leste"), BorderLayout.EAST);
		container.add(new JButton("Oeste"), BorderLayout.WEST);
		container.add(new JButton("Centro"), BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}
