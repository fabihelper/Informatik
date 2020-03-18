package Polys;
import java.awt.*;
import javax.swing.*;

public class PolyMain 
{
	public static void main(String[] args)
	{
		JFrame fenster = new JFrame("Polygone");
		Poly p = new Poly();
		fenster.setContentPane(p);
		
		fenster.setSize(1000, 1000);
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
	}
}
