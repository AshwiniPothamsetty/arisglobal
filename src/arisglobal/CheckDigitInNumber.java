//Write a program to take two inputs- a number and a digit- and check if the digit is present in the number or not.

package arisglobal;

import java.util.Scanner;

public class CheckDigitInNumber {
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		Scanner digit=new Scanner(System.in);
		System.out.println("enter a digit");
		int b=digit.nextInt();
		int x=a;
		while(a!=0) {
			int r,sum=0;
			r=a%10;
			if(r==b) 
			{
				System.out.println(b+"is occured in"+x);
			}
			a=a/10;
		}

	}}
