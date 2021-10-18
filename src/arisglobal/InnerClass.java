package arisglobal;

public class InnerClass {
	int a=10;
	public class inner{
		int b=20;
		int a=30;
		
	}

	public static void main(String[] args) {
		InnerClass obj1=new InnerClass();
		System.out.println(obj1.a);
		
		InnerClass.inner obj2=obj1.new inner();
		System.out.println(obj2.a
				);
		
		
		// TODO Auto-generated method stub

	}

}
