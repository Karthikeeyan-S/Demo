package com.karthik.demo;
import java.util.*;

class BankAccount
{
	public void withdraw()
	{
		
	}
	public void deposit()
	{
		
	}

}

class ICICI extends BankAccount
{
	int balance = 0;
	public void withdraw(int withdrawAmount)
	{
		if (withdrawAmount>25000)
		{
			System.out.println("Withdraw limit has been exceeded");
		}
		else
		{
			if(balance<withdrawAmount)
			{
				System.out.println("Insufficient Balance");

			}
			else
			{
				balance-=withdrawAmount;
				System.out.println("Collect your Cash");
				System.out.println("Thank you for Banking with us!!");
			}
		}
		System.out.println("Available Balance: "+balance);
	}
	public void deposit(int depositAmount)
	{
		balance+=depositAmount;
		System.out.println("Available Balance: "+balance);
		System.out.println("Thank you for Banking with us!!");
	}
}

class HDFC extends BankAccount
{
	int balance = 0;
	public void withdraw(int withdrawAmount)
	{
		if (withdrawAmount>20000)
		{
			System.out.println("Withdraw limit has been exceeded");
		}
		else
		{
			if(balance<withdrawAmount)
			{
				System.out.println("Insufficient Balance");

			}
			else
			{
				balance-=withdrawAmount;
				System.out.println("Collect your Cash");
				System.out.println("Thank you for Banking with us!!");
			}
		}
		System.out.println("Available Balance: "+balance);
	}
	public void deposit(int depositAmount)
	{
		balance+=depositAmount;
		System.out.println("Available Balance: "+balance);
		System.out.println("Thank you for Banking with us!!");
	}
}

class AXIS extends BankAccount
{
	int balance = 0;
	public void withdraw(int withdrawAmount)
	{
		if (withdrawAmount>15000)
		{
			System.out.println("Withdraw limit has been exceeded");
		}
		else
		{
			if(balance<withdrawAmount)
			{
				System.out.println("Insufficient Balance");

			}
			else
			{
				balance-=withdrawAmount;
				System.out.println("Collect your Cash");
				System.out.println("Thank you for Banking with us!!");
			}
		}
		System.out.println("Available Balance: "+balance);
	}
	public void deposit(int depositAmount)
	{
		balance+=depositAmount;
		System.out.println("Available Balance: "+balance);
		System.out.println("Thank you for Banking with us!!");
	}
}

class Banking
{
	public static void main(String [] args)
	{
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		AXIS a = new AXIS();
		Scanner sc = new Scanner(System.in);
		String bankInput = sc.next();
		if(bankInput.equals("ICICI"))
		{
			while(true)
			{
			System.out.println("Welcome to ICICI Banking Services!!");
			System.out.println("Select your Service!!");
			System.out.println("-> Deposit");
			System.out.println("-> Withdraw");
			String choice = sc.next();
			if(choice.equals("Deposit"))
			{
				System.out.println("Enter the Amount: ");
				int depAmount = sc.nextInt();
				i.deposit(depAmount);
			}
			else if(choice.equals("Withdraw"))
			{
				System.out.println("Enter the Amount: ");
				int withAmount = sc.nextInt();
				i.withdraw(withAmount);
			}
			System.out.println("Do you wish to continue ?");
			System.out.println("->Yes\n->No");
			String bChoice = sc.next();
			if(bChoice.equals("No"))
			{
				System.out.println("Thank you for Banking with us!!");
				break;
			}
			}
		}
		else if(bankInput.equals("HDFC"))
		{
			while(true)
			{
			System.out.println("Welcome to HDFC Banking Services!!");
			System.out.println("Select your Service!!");
			System.out.println("-> Deposit");
			System.out.println("-> Withdraw");
			String choice = sc.next();
			if(choice.equals("Deposit"))
			{
				System.out.println("Enter the Amount: ");
				int depAmount = sc.nextInt();
				h.deposit(depAmount);
			}
			else if(choice.equals("Withdraw"))
			{
				System.out.println("Enter the Amount: ");
				int withAmount = sc.nextInt();
				h.withdraw(withAmount);
			}
			System.out.println("Do you wish to continue ?");
			System.out.println("->Yes\n->No");
			String bChoice = sc.next();
			if(bChoice.equals("No"))
			{
				System.out.println("Thank you for Banking with us!!");
				break;
			}
			}
		}
		else if(bankInput.equals("AXIS"))
		{
			while(true)
			{
			System.out.println("Welcome to AXIS Banking Services!!");
			System.out.println("Select your Service!!");
			System.out.println("-> Deposit");
			System.out.println("-> Withdraw");
			String choice = sc.next();
			if(choice.equals("Deposit"))
			{
				System.out.println("Enter the Amount: ");
				int depAmount = sc.nextInt();
				a.deposit(depAmount);
			}
			else if(choice.equals("Withdraw"))
			{
				System.out.println("Enter the Amount: ");
				int withAmount = sc.nextInt();
				a.withdraw(withAmount);
			}
			System.out.println("Do you wish to continue ?");
			System.out.println("->Yes\n->No");
			String bChoice = sc.next();
			if(bChoice.equals("No"))
			{
				System.out.println("Thank you for Banking with us!!");
				break;
			}
			}
		}
		sc.close();
	}
	public void dummyMethod()
	{
		System.out.println("This is a dummy message");
	}
}