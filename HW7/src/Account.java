import java.io.*;
import java.time.LocalTime;
public class Account 
{
	private double Balance=10000;
	private int PIN;
	public double getBalance()
	{
		return Balance;
	}
	public void setBalance(double n)
	{
		Balance=n;
	}
	public int getPin()
	{
		return PIN;
	}
	public void Deposit(double amt)
	{
		Balance=Balance+amt;
	}
	public void Withdraw(double amt)
	{
		Balance=Balance-amt;
	}
	public void EnterPin()throws IOException
	{
		BufferedReader BR_Object=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your Pin to proceed : ");
		PIN=Integer.parseInt(BR_Object.readLine());
	}
}
