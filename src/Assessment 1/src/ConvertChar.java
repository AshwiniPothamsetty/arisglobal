import java.util.Scanner;

public class ConvertChar {

	public static void main(String[] args)
	{
	String str;
	Scanner scan = new Scanner(System.in); System.out.println("Enter the String :");
	str = scan.next(); char[] ch = new char[str.length()]; for (int i = 0; i < str.length(); i++)
	{
	ch[i] = str.charAt(i);
	}
	System.out.println("Charecters in the String are :");
	for (char c : ch)
	{
	System.out.println(c);
	}
	}
	}




