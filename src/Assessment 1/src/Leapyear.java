import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=sc.nextInt();
		String result=((year%4==0 && year%100!=0)?"is a leap year.":(year%400==0)?"is a leap year.":"is not a leap year");
		
		System.out.println(year+" "+result);
	}

}
