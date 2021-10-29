import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int a,arm=0,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		result=num;
		while (num>0) {
			a=num%10;
			arm=arm+(a*a*a);
			num=num/10;
			}
			if(arm==result)
			{
			System.out.println("Armstrong number ");
			}
			else
			{
				System.out.println("not a armstrong number");
			}
		}
		// TODO Auto-generated method stub

	}


