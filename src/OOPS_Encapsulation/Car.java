package OOPS_Encapsulation;
//here this piece of code in Car class is an example of Encapsulation
/* Encapsulation =
1. Wrapping data + methods together and protecting the data
2. Keep variables private and allow access only through methods
Encapsulation in Java – Core Rules

Encapsulation in Java is achieved using:
private variables
public getter & setter methods*/

//this is the Class containing the blueprint of any object
public class Car {
    private String color;
    private String brand;
    private String model;
    private int year;
    private int speed;

//    getters
    public String getColor()
    {
        return color;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getModel()
    {
        return model;
    }

    public int getYear()
    {
        return year;
    }

    public int getSpeed()
    {
        return speed;
    }

//    Setters
    public void setColor(String color)
    {
        this.color = color;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public final void airBags()
    {
        System.out.println("4 airbags");
    }

}
