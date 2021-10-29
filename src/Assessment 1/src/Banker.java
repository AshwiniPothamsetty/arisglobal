import java.util.Scanner;

public class Banker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int rs1 =0,rs2=0,rs5=0,rs10=0,rs20=0,rs50=0,rs100=0,rs200=0,rs500=0;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the amount:");
int amount = sc.nextInt();
while(amount >= 500)
{
rs500 = amount/500;
amount = amount%500;
System.out.println("the total no of 500 rupees note:"+rs500);
break;
}
while(amount >= 200)
{
rs200 = amount/200;
amount = amount%200;
System.out.println("the total no of 200 rupees note:"+rs200);
break;
}
while(amount >= 100)
{
rs100 = amount/100;
amount = amount%100;
System.out.println("the total no of 100 rupees note:"+rs100);
break;
}
while(amount >= 50)
{
rs50 = amount/50;
amount = amount%50;
System.out.println("the total no of 50 rupees note:"+rs50);
break;
}
while(amount >= 20)
{
rs20 = amount/20;
amount = amount%20;
System.out.println("the total no of 20 rupees note:"+rs20);
break;
}
while(amount >= 10)
{
rs10 = amount/10;
amount = amount%10;
System.out.println("the total no of 10 rupees note:"+rs10);
break;
}
while(amount >= 5)
{
rs5 = amount/5;
amount = amount%5;
System.out.println("the total no of 5 rupees note:"+rs5);
break;
}
while(amount >= 2)
{
rs2 = amount/2;
amount = amount%2;
System.out.println("the total no of 2 rupees note:"+rs2);
break;
}
while(amount >= 1)
{
rs1 = amount/1;
amount = amount%1;
System.out.println("the total no of 1 rupees note:"+rs1);
break;
}
int count = rs500 + rs100 + rs50 + rs20 + rs10 + rs5 + rs2 + rs1;
System.out.println("Total Number Of Notes Require :"+ count) ; }

}


