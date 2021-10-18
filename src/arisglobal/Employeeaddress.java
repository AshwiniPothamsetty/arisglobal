package arisglobal;
import java.util.*;
public class Employeeaddress {
	int roadno;
	String streetname;
	String city;
	int pin;
	
	void takeinput1()
	{
		Scanner po = new Scanner(System.in);
		System.out.println("entert the roadno");
		roadno = po.nextInt();
		System.out.println("entert the streetname");
		streetname = po.next();
		System.out.println("entert the city");
		city = po.next();
		System.out.println("entert the pin");
		pin = po.nextInt();
	}
	
	 void show1()
		{
	    	System.out.println("Employee adress is below");
	    	System.out.println("========================");
			System.out.println(roadno);
			System.out.println(streetname);
			System.out.println(city);
			System.out.println(pin);
		}

}
