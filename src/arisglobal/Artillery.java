package arisglobal;

public interface Artillery {
	int duration1=8;
	public void canShoot();
	public default void repair1()
	{
	System.out.println("repair of artillery");
	}
	}


