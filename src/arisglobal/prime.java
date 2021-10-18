package arisglobal;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(int n=1; n<=100; n++){
		int c = 0;
		for (int i = 1; i <= n; i++)
		if (n % i == 0)
		c++;
		if (c == 2)
			System.out.println("prime"+n);
		
		
}
	}
}

