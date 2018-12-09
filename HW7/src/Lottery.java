import java.io.*;
import java.util.Random;

public class Lottery 
{
	private int[] Lottery_Numbers=new int[5];
	private int[] User_Lottery=new int[5];
	
	public Lottery()
	{
		Random random=new Random();
		for(int i=0;i<5;++i)
		{
			int n=random.nextInt(9);
			Lottery_Numbers[i]=n;
		}
	}
	public void ArrayPrint()
	{
		System.out.print("Lottery Numbers : ");
		for(int i=0;i<5;++i)
			System.out.print(Lottery_Numbers[i]+"  ");
		System.out.print("\nUser Lottery Numbers : ");
		for(int i=0;i<5;++i)
			System.out.print(User_Lottery[i]+"  ");
	}
	public void Input()throws IOException
	{
		BufferedReader BR_Object=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the lottery numbers of User : ");
		for(int i=0;i<5;++i)
		{
			User_Lottery[i]=Integer.parseInt(BR_Object.readLine());
		}
	}
	public int Match()
	{
		int count=0;
		for(int i=0;i<5;++i)
		{
			if(Lottery_Numbers[i] == User_Lottery[i])
				++count;
		}
		return count;
	}
	public static void main(String[] args)throws IOException
	{
		Lottery Object= new Lottery();
		Object.Input();
		int result=Object.Match();
		if(result == 0)
			System.out.println("No numbers match.");
		else if(result == 5)
			System.out.println("Lottery Matched\nYou are a grand prize winner.");
		else 
			System.out.println("\nThe count of corresponding numbers that matched : "+result);
		Object.ArrayPrint();
	}
}
