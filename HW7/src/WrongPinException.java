
public class WrongPinException extends Exception 
{
	private static final long serialVersionUID = 1L;

	public WrongPinException() 
	{
		System.out.println("The pin you entered is invalid.\n");
	}

}
