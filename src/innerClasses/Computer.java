package innerClasses;

public class Computer {
    private String brand;
    private String model;



    private OperatingSystem os;

//    STATIC INNER CLASS (Static inner class = class inside a class, but not tied to its object)
    /* creating a computer class does not affect this inner static USB class */
    static class USB{
        private String type;

        public USB(String type)
        {
            this.type = type;
        }

        void displayInfo()
        {
            System.out.println("USB Type: " + type);
        }

    }


    public OperatingSystem getOs() {
        /* This is a getter method.
It allows controlled access to the private variable os.
Without this method, os cannot be accessed from outside the class. */
        return os;
    }


//    constructor of Computer class
    public Computer(String brand, String model, String osName)
    {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
        /* Creates an object of the inner class OperatingSystem.
Passes osName to its constructor.
Stores the object in os */
        /* This line does 3 big things 👇
        * 1. Inner class object creation starts
🔹 new OperatingSystem(osName)
JVM sees an inner class object creation.
Inner class cannot exist alone.
It is automatically linked to the current Computer object.
*
*       2. OperatingSystem constructor is called
public OperatingSystem(String osName)
*
*       3. Inner class object reference stored
this.os = new OperatingSystem(osName);
The created OperatingSystem object’s reference is stored in:
Computer.os
* Computer object
 ├─ brand = "Dell"
 ├─ model = "Inspiron"
 └─ os ──► OperatingSystem object
              └─ osName = "Windows 11"*/
    }

    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName)
        {
            this.osName = osName;
        }

        public void displayInfo()
        {
            System.out.println("Computer Model: " + model + ", OS:" + osName);
        }

    }
}
