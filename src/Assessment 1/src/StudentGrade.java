import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
				if(marks < 50 && marks >=0)
				System.out.println("Fail");
				else
				if(marks >=50 && marks <60)
				System.out.println("D");
				else
				if(marks >=60 && marks <70)
				System.out.println("C");
				else
				if(marks >=70 && marks <80)
				System.out.println("B");
				else
				if(marks >=80 && marks <85)
				System.out.println("B+");
				else
				if(marks >=85 && marks <95)
				System.out.println("A");
				else
				if(marks >=95 && marks <=100)
				System.out.println("A+");
				else
				System.out.println("The marks must be within 0 to 100 ");

	}

}
