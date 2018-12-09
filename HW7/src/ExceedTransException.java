public class ExceedTransException extends Exception
{
	private static final long serialVersionUID = 1L;

	public ExceedTransException() {
		System.out.println("The number of transactions exceed 3");
	}
}
