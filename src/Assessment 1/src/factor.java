import java.util.Scanner;

public class factor {
		 
		static int MAX = 1000001;
		static int factor[];
		static void generatePrimeFactors()
		{
		factor[1] = 1;
		for (int i = 2; i < MAX; i++)
		factor[i] = i;
		for (int i = 4; i < MAX; i += 2)
		factor[i] = 2;
		for (int i = 3; i * i < MAX; i++) {
		if (factor[i] == i) {
		for (int j = i * i; j < MAX; j += i) {
		if (factor[j] == j)
		factor[j] = i;
		}
		}
		}
		}
		static int calculateNoOFactors(int n)
		{
		if (n == 1)
		return 1;
		int ans = 1;
		int dup = factor[n];
		int c = 1;
		int j = n / factor[n];
		while (j != 1) {
		if (factor[j] == dup)
		c += 1;
		else {
		dup = factor[j];
		ans = ans * (c + 1);
		c = 1;
		}j = j / factor[j];
		}
		ans = ans * (c + 1);
		return ans;
		}
		public static void main(String[] args)
		{ 
			Scanner sc=new Scanner(System.in);
		factor = new int[MAX];
		factor[0] = 0;
		generatePrimeFactors();
		System.out.println("Enter number");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("enter a array of numbers:");
		{
		for(int i=0;i<num;i++) {
		a[i]=sc.nextInt();
		}
		}
		int q = a.length;
		for (int i = 0; i < q; i++)
		System.out.print(calculateNoOFactors(a[i]) + " ");
		}



	}


