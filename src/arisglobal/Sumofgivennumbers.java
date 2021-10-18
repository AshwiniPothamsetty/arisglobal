package arisglobal;

import java.util.Scanner;

public class Sumofgivennumbers {
	public static void main(String args[]) {
		
	
		int n;
		Scanner obj1=new Scanner(System.in);
		n=obj1.nextInt();
		for (int j=0;j<=n;n++) {
		Scanner obj2=new Scanner(System.in);
		int a=obj2.nextInt();
		
		int sum=0;
		for(int i=0;i<=a;i++)
		{
			sum=sum+a;
			
		}
		System.out.println("sum is"+sum);
	}

}
}
