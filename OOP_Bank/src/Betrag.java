
public class Betrag 
{
	int kontostandNeu;
	int dispoNeu;
	
	Betrag(int kontostand, int dispo)
	{
		kontostandNeu = kontostand;
		dispoNeu = dispo;
	}
	void anzeigen()
	{
		System.out.println(kontostandNeu);
	}
	public Betrag verringern(Betrag schulden) 
	{
		kontostandNeu = girobanking.this - schulden;
		return new Betrag(kontostandNeu, 0);
	}


}
