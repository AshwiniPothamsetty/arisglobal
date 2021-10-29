import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		int n = 10, firstTerm = 0, secondTerm = 1;
	   
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		n=sc.nextInt();
		 System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;


	}
	}
}

