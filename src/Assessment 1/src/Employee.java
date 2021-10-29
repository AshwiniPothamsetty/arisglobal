
	import java.util.Scanner;
	public class Employee{
	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter employee's name:");
	String employee = input.next();
	System.out.println("Enter number of hours worked:");
	double hours = input.nextDouble();
	System.out.println("Enter hourly pay is 250 per hour");
	double pay = 250;
	double total_pay = pay * 8;
	if(hours>8)
	{
	System.out.print("u will be paid only for 8 hours no extra hours");
	} System.out.println("Employee name: " + employee);
	System.out.println("Hours worked: " + hours);
	System.out.println(" Enter payrate: " + pay);
	System.out.println("the total money" +total_pay);
	}
	}




