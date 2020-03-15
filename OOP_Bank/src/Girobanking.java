
public class Girobanking 
{
	public static void main(String[] args)
	{
		Girokonto jochensKonto = new Girokonto("Jochen", "012345", 520, 15);
		Girokonto lenasKonto = new Girokonto("Lena", "987654", 2100, 20);
		
		Betrag schulden = new Betrag(100, 0);
		
		jochensKonto.betragUeberweisen(schulden, lenasKonto);
			jochensKonto.kontoanzeigen();
		
	}
}
