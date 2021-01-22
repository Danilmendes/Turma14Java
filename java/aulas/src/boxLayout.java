import javax.swing.*;
import java.awt.*;

public class boxLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Box Layout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = frame.getContentPane();
		
		JPanel hPanel = new JPanel();
		BoxLayout boxLayout = new BoxLayout(hPanel, BoxLayout.X_AXIS);
		hPanel.setLayout(boxLayout);
		for(int i=1 ; i<=9; i++) {
			hPanel.add(new JButton("Button "+ i));
			hPanel.add(Box.createHorizontalGlue());
		}
		container.add(hPanel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

}
