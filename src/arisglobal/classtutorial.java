package arisglobal;
import java.util.Scanner;

public class classtutorial {
;public class Employee {
String name;
int empid;
String contact;
double salary;
String department;
char gender;
String address;
String designation;

Employee(String name,int empid,String contact){
this.name=name;
this.empid=empid;
this.contact=contact;
this.salary=1000000;
}
double print(double percentage) {
double commission= percentage/100* salary;
return commission;
}
void show() {
System.out.println(name);
System.out.println(empid);
System.out.println(contact);
}

}
}
