package innerClasses;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Safari");
        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
        Computer computer = new Computer("HP", "ABC", "Linux Ubuntu");
        computer.getOs().displayInfo();

        Computer.USB usb1 = new Computer.USB("ThunderBolt 4");
        Computer.USB usb2 = new Computer.USB("Type C");
        /* Computer.USB
        USB is inside Computer
        Since it is static, we access it using:
        OuterClass.InnerClass ->  Computer.USB*/

        ShoppingCart shoppingCart = new ShoppingCart(200.76);
//        Java concept: Anonymous Inner Classes.
        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("paid " + amount + " using Credit Card.");
            }
        });

        shoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("paid " + amount + " using PayPall.");
            }
        });

        Hotel hotel = new Hotel("Hotel SunBreez", 12, 4);
        hotel.reserveRooms("Zubair", 2);
        hotel.reserveRooms("Zahid", 8);


    }
}
