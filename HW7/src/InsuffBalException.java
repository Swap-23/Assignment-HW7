public class InsuffBalException extends Exception
{
public InsuffBalException() 
 {
	System.out.println("Your balance is insufficient.\nThe amount you entered cannot be withdrawn.\n");
 }
}
