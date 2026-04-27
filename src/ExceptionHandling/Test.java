package ExceptionHandling;

public class Test {
    public static void main(String[] args) throws Exception{
        BankAccount bankAccount = new BankAccount(200);
        try{
            bankAccount.withdraw(3000);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
