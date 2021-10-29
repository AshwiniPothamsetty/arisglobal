import java.util.Scanner;

public class NumLessThan100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		boolean result= num<100? true:false;
		System.out.println(result);

	
	}

}
