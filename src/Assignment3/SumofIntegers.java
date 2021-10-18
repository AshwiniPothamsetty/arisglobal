package Assignment3;
import java.util.*;

public class SumofIntegers {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		String num=sc.nextLine();
		StringTokenizer token=new StringTokenizer(num);
		int dig=0,sum=0;
		System.out.println("\nEntered numbers are : ");
		while(token.hasMoreTokens())
		{
		String s=token.nextToken();
		dig=Integer.parseInt(s);
		System.out.print(dig+" ");
		sum=sum+dig;
		}
		System.out.println();
		System.out.println("Sum is : "+sum);
	}


}


