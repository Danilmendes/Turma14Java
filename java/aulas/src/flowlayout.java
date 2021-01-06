import javax.swing.*;
import java.awt.*;

public class flowlayout {

	public static void main(String[] args) {
		int horizontalGap = 0;
		int verticalGap = 0;
		
		JFrame frame = new JFrame("Teste");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEADING,horizontalGap,verticalGap);
		contentPane.setLayout(flowLayout);
		
		//Adicionando um botão
		for(int i=1; i<=9 ; i++) {
			contentPane.add(new JButton("Botão "+ i));
		}
		
		//Definindo o local do frame (x,y)
		frame.setLocation(50, 50);
		frame.pack();
		frame.setVisible(true);
	}

}
