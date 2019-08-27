package Singleton;

public class Singleton {
//Create a single private variable that can only be instantiated once.
	private static Singleton firstInstance = null;
	
	private Singleton(){}
	
	public static Singleton getInstance()
	{
		if (firstInstance == null)
		{
			firstInstance = new Singleton();
			
			return firstInstance;
		}
		else
		{
			return null;
		}
		
	}
	
	//Instantiate
	public static void main(String[] args)
	{
		Singleton hasValue = getInstance();
		
		Singleton hasNoValue = getInstance();
		
		checkVal(hasValue);
		checkVal(hasNoValue);
		
	}
	
	//Check value of Singleton object
	public static void checkVal(Singleton subject)
	{
		if(subject != null){System.out.println(" This subject has a value");}
		else {System.out.println(" This subject has no value");}
	}
}
