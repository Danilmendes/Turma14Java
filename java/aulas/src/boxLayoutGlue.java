import javax.swing.*;
import java.awt.*;

public class boxLayoutGlue {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Box Layout with Glue");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		
		Box hbox = Box.createHorizontalBox();
		hbox.add(new JButton("<<First"));
		hbox.add(new JButton("<Previous"));
		hbox.add(Box.createHorizontalGlue());
		hbox.add(new JButton("Next>"));
		hbox.add(new JButton("Last>>"));
		
		container.add(hbox, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

}
