package arisglobal;

public interface Floatable {
	int duration=5;
	public void canFloat();
	public default void repair()
	{
	System.out.println("repair of floatable");
	}



	}


