package Inheritance;

public class AnimalTest {
	  public static void main(String[] args) {
		 
			// TODO Auto-generated method stub



			/*Cat c=new Cat();
			System.out.println(c.name);
			c.eat();
			Dog d=new Dog();
			System.out.println(d.name);
			d.eat();*/




			//upcasting
			Animal a=new Animal();
			System.out.println(a.name);
			a.eat();
			Animal a1=(Animal)new cat();
			a1.eat();
			Animal a2=(Animal)new dog();
			a2.eat();



			//*downcasting
			Animal a3=new cat();
			a3.name="im animal";
			cat c=(cat)a3;
			c.eat();
			System.out.println(c.name);
			



			}
}
