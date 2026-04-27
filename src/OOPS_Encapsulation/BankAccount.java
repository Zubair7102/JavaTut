package OOPS_Encapsulation;

public class BankAccount {
    private long accountNumber;
    private double balance;

//    constrcutor
    public BankAccount()
    {
        System.out.println("constructor is called when any object is defined of that class ");
    }
    public void deposit(double amount)
    {
        if(amount > 0)
        {
            this.balance += amount;
            System.out.println("deposited: " + amount);
            System.out.println("your total balance now is: " + balance);
        }
        else {
            System.out.println("Please deposit greater amount what is this " + amount);
        }
    }

    public void withdraw(double amount)
    {
        if(amount > 0 && amount <= balance)
        {
            this.balance -= amount;
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("your total balance is: " + balance);
        }
        if(amount <= 0)
        {
            System.out.println("Please enter a valid amount to withdraw, what is this " + amount);
        }
        if(amount > balance)
        {
            System.out.println("Poora bank balance itta nahi hai Boss check karr " + balance);
        }
        else {
            System.out.println("Invalid amount, please check and retry");
        }
    }

//    public void setBalance(double amount)
//    {
//        this.balance = amount;
//    }

    public void setAccountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

}
