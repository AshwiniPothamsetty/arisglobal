package arisglobal;

public class Anonymousinner {

	public static void main(String[] args) {
		person p=new person() {
			void eat()
			{
				System.out.println("c");
				
			}
		};
		p.eat();
		// TODO Auto-generated method stub

	}

}


