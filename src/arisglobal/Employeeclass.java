package arisglobal;
import java.util.*;

public class Employeeclass {
	String name;
	int empID;
	String phnum;
	double salary ;
	String deptmt;
	
	Scanner in = new Scanner(System.in);

	
	void takeinput()
	{

		System.out.println("enter the name");
		name = in.next();
		System.out.println("entert the empID");
		empID = in.nextInt();
		System.out.println("entert the phnum");
		phnum = in.next();
		System.out.println("entert the deptmt");
		deptmt = in.next();
		System.out.println("enter the salry");
		salary = in.nextDouble();
	}

	 void show()
		{
			System.out.println("employee name is "+name);
			System.out.println(name+"'s ID"+empID);
			System.out.println(name+"'s NO"+phnum);
			System.out.println(name+"'s DEP"+deptmt);
			System.out.println(name+"'s salry"+salary);

		}
	 
	 
	 double print(double percentage)
		{
			double commission = percentage/100*salary;
			return commission;

		}

}
