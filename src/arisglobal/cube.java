package arisglobal;

import java.util.Scanner;

public class cube {

	public static void main(String[] args) {
		
			Scanner obj1=new Scanner(System.in);
			int a=obj1.nextInt();
			for(int i=0;i<=a;i++) {
				int b=i*i*i;
				System.out.println(i +" cube is"+ b);
			
		}
	}

}
