package Assignment2;

import java.util.Scanner;

public class Prime {

			
		static boolean isPrime(int n)
		{
		// Corner case
		if (n <= 1)
		    return false;
		 
		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
		    if (n % i == 0)
		        return false;
		 
		return true;
		}
		 
		// Function to print primes
		static void printPrime(int a)
		{
		for (int i = 2; i <= a; i++)
		{
		    if (isPrime(i))
		        System.out.print(i + " ");
		}
		}
		 
		// Driver Code
				public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a number");
				int a=sc.nextInt();

		    printPrime(a);
		}
		}

