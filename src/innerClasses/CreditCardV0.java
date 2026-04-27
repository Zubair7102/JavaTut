package innerClasses;

public class CreditCardV0 implements Payment{

    private String creditCardNumber;

//    Constructor
    public CreditCardV0(String creditCardNumber)
    {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount)
    {
        System.out.println("paid " + amount + " using Credit Card." + " with number: " + creditCardNumber);
    }
}
