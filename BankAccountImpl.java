interface BankAccount
{
	public abstract boolean openAccount(int balance);
	public abstract void deposit(int amount);
	public abstract void withdraw(int amount);
	public abstract void showBalance();
}


class BankAccountImpl implements BankAccount
{
	double bankBalance;
	public boolean openAccount(int balance)
	{
		bankBalance=balance;
		return true;
	}
	
	public void deposit(int amount)
	{
		bankBalance = bankBalance + amount;
	}
	
	public void withdraw(int amount)
	{
		bankBalance=bankBalance-amount;
	}
	public void showBalance()
	{
		System.out.println("Bank Balance: " + bankBalance);
	}
}


class BankManager
{
	public static void main(String args[])
	{
		BankAccount account = new BankAccountImpl();
		account.openAccount(5000);
		account.deposit(500);
		account.withdraw(100);
		account.showBalance();
	}
}
