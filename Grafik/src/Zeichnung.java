import java.awt.*;

import javax.swing.*;

public class Zeichnung extends JPanel

{
	public void paint(Graphics g)
	{
		g.drawLine(350,150 ,275,50); // ::: \
		g.drawLine(200,150,275,50); // :: /
		g.drawRect(200, 150, 150, 150);
		
		//g.drawRect(200, 300, 100, 50);
	}
}
