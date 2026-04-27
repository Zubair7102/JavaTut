package innerClasses;

public class ShoppingCart{

    private double totalAmount;

//    Constructor
    public ShoppingCart(double totalAmount)
    {
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentmethod)
    {
        paymentmethod.pay(totalAmount);
    }


}
