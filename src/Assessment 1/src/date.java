import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class date{

		public static boolean isValidDate(String d)
		{
		String regex = "^(1[0-2]|0[1-9])/(3[01]"+ "|[12][0-9]|0[1-9])/[0-9]{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher((CharSequence)d);
		return matcher.matches();
		}
		public static void main(String args[])
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		String year=sc.nextLine();
		boolean flag=isValidDate(year);
		if(flag==true)
		{
		System.out.println("is valid date");
		}
		else
		System.out.println("is not valid date");



		
		

	}
}
