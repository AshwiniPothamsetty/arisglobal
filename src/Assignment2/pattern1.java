package Assignment2;
import java.util.*;
public class pattern1 {
	
	void show(int n)
	{
	for(int i = n; i>0;i--)
	{
	for(int j=1; j<=i;j++)
	{
	System.out.print(j);
	}
	System.out.println();
	}
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	pattern1 ne = new pattern1();
	ne.show(n);
	}
	}




