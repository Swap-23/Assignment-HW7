public class AmountNotAvailableException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AmountNotAvailableException() 
	{
		System.out.println("Sorry! The amount you entered is not available in the ATM.");	
	}
}
