package ExceptionHandling;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException()
    {
        super("Insufficient Balance Please Check");
    }
}
