import java.awt.*;

import javax.swing.*;


public class Test
{
	public static void main(String[] args)
	{
		JFrame fenster = new JFrame("Mein Schachbrettfenster");
		Zeichnung z = new Zeichnung();
		fenster.setContentPane(z);
		
		fenster.setSize(600, 600);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
		
	}
}
