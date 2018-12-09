import java.io.*;

public class ATM 
{
    private double Cash=40000; // Current cash in the ATM
    private int numtrans=0; // Number of Transactions for a particular Person
    public int getNumber()
    {
	   return numtrans; // Returns non-static variable numtrans to be used by static variables
    }
    public double getCash()
    {
	   return Cash; // Returns non-static variable Cash to be used by static variables
    }
	public static void main(String[] args)throws Exception
	{
		 Account A=new Account();// Account Class Object
		 ATM O1=new ATM(); // ATM class Object
		 
		 //Buffered Reader object for taking input from user
		 BufferedReader BR_Object=new BufferedReader(new InputStreamReader(System.in));  
		 A.EnterPin(); // Entering Pin
		 
		 int amount;
		 char C='Y';
		 // Using try-catch to throw exceptions
		 try
		 {
		 if(A.getPin() != 1234)
		 {
			// Checking if the pin is invalid and throwing exception for the same.
			 throw new WrongPinException(); 
		 }
		 
		 // Menu driven choices for the user
		 System.out.print("1.Enter 'W' to withdraw money : \n2.Enter 'D' to deposit money : "
		 		+ "\n3.Enter 'B' to check your balance : \n4.Enter any key to continue and 'N' to Stop : \nEnter your choice : ");
		 char choice=(char)BR_Object.read();
		 String S1=BR_Object.readLine();
		 
		 while(C != 'N' || C !='n')
		 {
			
			 int n=(O1.getNumber());
			++n; // Incrementing number of transactions for every transaction.
			if(n>=3)
			{
				// Throwing exception if the number of transactions exceed 3.
				throw new ExceedTransException(); 
			}
		     switch(choice)
		         {
		             case 'W': { System.out.println("Enter amount to withdraw : ");
		                         amount=Integer.parseInt(BR_Object.readLine());
		                        
		                         if(amount<=0)
		                        	 throw new InavlidAmtException();
		                         if(amount>A.getBalance())
		                         {
		                    	     throw new InsuffBalException();
		                         }
		                         if(O1.getCash()<amount)
		                         {
		                    	     throw new AmountNotAvailableException();
		                         }
		                         if(amount%100 != 0 )
		                    	     throw new UnableToDispenseException();
		                         if(amount%500 != 0)
		                        	 throw new UnableToDispenseException();
		                         if(amount%2000 != 0)
		                         	 throw new UnableToDispenseException();
		                         else   
		                        	 A.Withdraw(amount);
		                             break; }
		             case 'D': { System.out.println("Enter the amount to be deposited : ");
		                         amount=Integer.parseInt(BR_Object.readLine());
		                         
		                         if(amount<=0)
		                        	 throw new InavlidAmtException();
		                         double Deposit_amount=A.getBalance()+amount;
		                         A.setBalance(Deposit_amount);
		                         break; }
		             case 'B': { System.out.println("Your Balance is : "+A.getBalance());
		                         break; }
		             default : { throw new InvalidOptionException();
		                          }
		         }
		     System.out.println("Enter any key to continue and 'N' to stop.\nEnter your choice : ");
		     C=(char)BR_Object.read();
		     if(C!='N' || C!= 'n')
		     {
		    	 System.out.print("1.Enter 'W' to withdraw money : \n2.Enter 'D' to deposit money : "
					 		+ "\n3.Enter 'B' to check your balance : \n4.Enter any key to continue and 'N' to Stop : \nEnter your choice : ");
				 choice=(char)BR_Object.read();
		     }
		     
	}
    }
		 catch(ExceedTransException e1)
		 {
			 System.out.println("Number_of_Transactions_Exceeded_Exception");
		 }
		 catch(InsuffBalException e2)
		 {
			 System.out.println("Insufficient_Balance_Exception");
		 }
		 catch(WrongPinException e3)
		 {
			 System.out.println("Wrong_Pin_Exception");
		 }
		 catch(AmountNotAvailableException e4)
		 {
			 System.out.println("Cash_Unavailable_Exception");
		 }
		 catch(UnableToDispenseException e5)
		 {
			 System.out.println("Unable_To_Dispense_Cash_Excpetion");
		 }
		 catch(InvalidOptionException e6)
		 {
			 System.out.println("Invalid_Option_Exception");
		 }
		 catch(InavlidAmtException e7)
		 {
			 System.out.println("Invalid_Amt_Exception");
		 }
		/* catch(TimeoutException e8)
		 {
			 System.out.println("Timed-out!");
		 }*/
	}
}
