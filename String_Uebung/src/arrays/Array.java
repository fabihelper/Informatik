package arrays;

import java.util.*;

public class Array
{
	
	
	public static void main(String[] args)
	{
		ArrayList<Girokonto> al = new ArrayList();
		for(int i = 0; i <= 2; ++i)
		{
			Girokonto gk = new Girokonto(null, null, 1000000, 5000);
			al.add(gk);
			
			
		}
		System.out.println(al.size());
		Girokonto p1 = al.get(0);
		Girokonto p2 = al.get(1);
		
		Betrag ueberweisen = new Betrag(100, 0);
		 p1.betragUeberweisen(ueberweisen.getKontostand(), p2);
		 
		 p1.kontoanzeigen();
		 p2.kontoanzeigen();
		
	}
}
