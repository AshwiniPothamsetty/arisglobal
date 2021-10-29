import java.util.Scanner;

public class BaseExpo{
	public static void main(String[] args) 
	{
	int base=0, exponent = 0;
	System.out.println("Enter base num:");
	Scanner input = new Scanner(System.in);
	base = input.nextInt();
	System.out.println("Enter exponent num:");
	Scanner sc = new Scanner(System.in);
	exponent = sc.nextInt();
	long result = 1;
	while (exponent != 0) {
	result *= base;
	--exponent;
	} System.out.println("Answer = " + result);
	}
	}




