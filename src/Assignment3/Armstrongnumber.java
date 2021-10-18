package Assignment3;
import java.util.*;
public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		int num=a;
		int sum=0;
		while(a!=0) {
			int r=a%10;
			sum=sum+(r*r*r);
			a=a/10;
		}
		if(sum==num) {
			System.out.println("armtrong number");
		}
		else
		{
			System.out.println("not an armstrong number");
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
