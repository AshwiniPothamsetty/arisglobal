package arisglobal;
import java.util.Scanner;
public class sumandavg {
	
	
	 public static void main(String[] args) 
	 {
	// TODO Auto-generated method stub
	String choice="";
	int sum=0, product=1;
	float count=0;
	Scanner sc=new Scanner(System.in);
	while(!choice.equals("q")) {
	System.out.println("enter a number or q to quit");
	choice=sc.next();
	if(!choice.equals("q")) {
	int num=Integer.parseInt(choice);
	sum+=num;
	product*=num;
	count++;
	}
	}
	float avg=(float)sum/count;
	System.out.println("Product="+product+"\n"+"Average="+avg);
	


	 }

}



