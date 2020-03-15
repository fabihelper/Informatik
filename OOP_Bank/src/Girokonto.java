
public class Girokonto 
{
	String besitzer;
	String kontonummer;
	int blz;
	Betrag kontostand;
	Betrag dispolimit;
	
	Girokonto(String b, String n, int e, int c)
	{
		besitzer = b;
		kontonummer = n;
		blz = 64892200;
		kontostand = new Betrag(e, c);
		dispolimit = new Betrag(1000, 0);
		
	}
	
	void kontoanzeigen()
	{
		System.out.print("Kontostand " + besitzer + ": ");
		kontostand.anzeigen();
		System.out.println();
	}
	
	void betragUeberweisen(Betrag schulden, Girokonto girokonto_nach)
	{
		kontostand = kontostand.verringern(schulden);
	}
	
	void betragAbheben(int betrag)
	{
		kontostand.verringern(betrag);
	}
	void betragGutschreiben(int betrag)
	{
		//+schulden
	}
}
