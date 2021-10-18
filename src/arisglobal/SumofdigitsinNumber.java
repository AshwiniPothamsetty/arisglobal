package arisglobal;

import java.util.Scanner;

public class SumofdigitsinNumber {

	public static void main(String[] args) {
		int r,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
	
		while(a!=0) {
			
			r=a%10;
			sum=sum+r;
			a=a/10;
					}
		System.out.println("sum is"+sum);
			
		// TODO Auto-generated method stub

	}
		
	}


