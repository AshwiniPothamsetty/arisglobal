package arisglobal;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=54, n2=24;  
		while(n1!=n2)   
		{  
		if(n1>n2)  
		n1=n1-n2;  
		else  
		n2=n2-n1;  
		}  
		System.out.printf("GCD of n1 and n2 is: " +n2);  
		}  
		

	}


