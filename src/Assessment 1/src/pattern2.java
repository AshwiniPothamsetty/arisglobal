import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args)
	{
	int height, width,i,j;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Height :");
	height = scan.nextInt();
	System.out.println("Enter Width :");
	width = scan.nextInt(); for(i=0;i<height;i++)
	{
	for(j=0;j<width;j++)
	{
	System.out.print(" *");
	}
	System.out.println();
	}
	}
	}


