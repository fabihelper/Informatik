
public class TestString 
{
	public static void main(String[] args)
	{
		String str = "Ich bin ein String und werde nun für den Test von String-Methoden verwendet";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.substring(12, 18));
		System.out.println(str.indexOf("für den Test"));
		System.out.println(str.toUpperCase());
	}
}
