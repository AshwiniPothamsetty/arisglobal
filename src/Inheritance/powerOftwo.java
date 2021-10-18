package Inheritance;
import java.util.*;
public class powerOftwo {
		static boolean power(int n)
		{
		if (n == 0)
		return false;
		while (n != 1) {
		if (n % 2 != 0)
		return false;
		n = n / 2;
		}
		return true;
		} public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		if(power(n))
		{
		System.out.println(n+ " is power of 2");
		}
		else
		{
		System.out.println(n+ " is not a power of 2");
		}
		}
}




