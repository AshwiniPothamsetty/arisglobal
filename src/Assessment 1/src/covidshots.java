import java.util.Scanner;

public class covidshots {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		if(age>60) {
			System.out.println("Eligible now");
		}
		else if(age>45){
			System.out.println("Eligible in 15 days");
		}
		else if(age>18) {
			System.out.println("Eligible in a month");
		}
		else
		{
			System.out.println("Not Eligible");
		}
		sc.close();
}
}