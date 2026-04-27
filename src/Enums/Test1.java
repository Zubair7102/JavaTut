package Enums;

import java.sql.SQLOutput;

//enums are constants that are used for frequent used data
public class Test1 {
    public static void main(String[] args) {
        System.out.println(DayClass.MONDAY);
        System.out.println(DayClass.TUESDAY);
        System.out.println(DayClassEnums.MONDAY);
        System.out.println(DayClassEnums.TUESDAY);

        DayClassEnums friday = DayClassEnums.FRIDAY;// this is the complete syntax
        System.out.println(friday.name().toLowerCase());
        DayClassEnums enumDay = DayClassEnums.valueOf("SATURDAY"); // here in this line the variable enumDay will have the Value SATURDAY only when any of the value in the list of enums defined in class DayClassEnums matches the valueOf("") data here in this syntax else will throw error like in the below try catch example
        try{
            DayClassEnums enumDay2 = DayClassEnums.valueOf("Saturday");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        for (DayClassEnums value : DayClassEnums.values()) {
            System.out.println(value);
            
        }

        DayClassEnums monday = DayClassEnums.MONDAY;
        monday.display();

        DayClassEnums day = DayClassEnums.WEDNESDAY;
        switch (day)
        {
            case MONDAY:{
                System.out.println("Today is monday :)");
                break;
            }
            case WEDNESDAY:{
                System.out.println("Today is wednesday :)");
                break;
            }
            default:{
                System.out.println("Weekend!! ");
            }
        }

        switch(day) // new switch case does not require break statement;
        {
            case WEDNESDAY -> {
                System.out.println("Today is wednesday :)");
            }
            case FRIDAY -> {
                System.out.println("Today is fridy ;)");
            }
            default -> {
                System.out.println("Weekend!!!");
            }
        }

        String res = switch (day)
        {
            case SUNDAY -> "Sunday";
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            case SATURDAY -> "Saturday";
            default -> "Weekend";
        };
        System.out.println(res);


    }
}
