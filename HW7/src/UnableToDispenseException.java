public class UnableToDispenseException extends Exception
{
	private static final long serialVersionUID = 1L;

	public UnableToDispenseException() 
	{
		System.out.println("Please Enter amount in multiples of 100, 500 or 2000.");
	}

}
