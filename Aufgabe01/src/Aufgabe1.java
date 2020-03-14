import java.util.Scanner;


public class Aufgabe1 
{
	public static void main(String[] args)
	{
		
		System.out.print("Anzahl der Reihe bitte: ");
		Scanner reihe = new Scanner(System.in);
		int reihen = reihe.nextInt();
		//System.out.print("User input " + reihe.nextLine());
		
		for(int i = 1; i <= reihen; ++ i)
		{
			for(int j = 1; j <= reihen ; ++j)
			{
				if(j <= reihen - i)
				{
					System.out.printf(" ");
				}
				else
				{
					System.out.printf("*");
				}
			}
			System.out.printf("\n");
		}
		
		
		
	}

}
