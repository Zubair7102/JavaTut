package Enums;

public enum DayClassEnums {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    public void display()
    {
        System.out.println("today is " + this.name());
    }

}
