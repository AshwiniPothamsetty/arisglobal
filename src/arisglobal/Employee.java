package arisglobal;

public class Employee {

	public static void main(String[] args) {
		
		Employeeclass emp=new Employeeclass();
		Employeeaddress add=new Employeeaddress();
		for(int i =1;i<=5;i++)
		{
		emp.takeinput();
		emp.show();
		add.takeinput1();
		add.show1();
		double com=emp.print(5.0);
		System.out.println(emp.salary+com);
		// TODO Auto-generated method stub

	}
	}

}
