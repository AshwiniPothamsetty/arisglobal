
public class StrongNUm {
	public static void main(String []args)
	{
	int num=145;
	int sum=0;
	while(num!=0)
	{
	int n=num%10;
	for(int i=0;i<n;i++) {
	n=n*i; }
	sum=sum+n;
	num=num/10;
	}
	if(num==sum) {
	System.out.println("it is a strong number");
	}
	else {
	System.out.println("it is not a strong number");
	} } }



