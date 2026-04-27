package OOPS_Encapsulation;

public class Test {
    public static void main(String[] args)
    {
        Car car = new Car();
//        car.color = "Red";
//        car.speed = 40;
//        car.brand = "TATA";
//        car.year = 2025;
//        car.model = "Punch";
//
//        car.accelerate(20);
//        System.out.println(car.speed);
        Student student = new Student("Zubair", 23, 34);
        student.setAge(-12);
        System.out.println(student.getAge());

        BankAccount zubair = new BankAccount();
//        zubair.setBalance(50000);
        zubair.setAccountNumber(1234567890);
        System.out.println(zubair.getBalance());
//        zubair.deposit(-10);
        zubair.deposit(100);
        System.out.println(zubair.getBalance());
        zubair.withdraw(-233);
        zubair.withdraw(200000000);
        System.out.println(zubair.getAccountNumber());

//        Animal animal = new Animal();

    }
}
