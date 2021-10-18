//Write a program in Java to display n terms of natural numbers and their sum.

package arisglobal;
import java.util.*;


public class sumnaturalnumbers {
	public static void main(String args[]) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=a;i++) {
			sum=sum+i;
			System.out.println(i +" and  "+ sum);
		}

	}
		
	

}
