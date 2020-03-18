package Polys;

import java.awt.*;
import javax.swing.*;

public class Poly extends JPanel

{
	public void paint(Graphics g)
	{
		
		int[] xpoints = {300,475, 500,525, 700, 525, 500, 475};
		int[] ypoints = {500,475,300, 475,500, 525 ,700, 525 };
				
		int pts = xpoints.length;
		
		Polygon poly =new Polygon(xpoints, ypoints , pts);
		g.drawPolygon(poly);
	
	}
}
