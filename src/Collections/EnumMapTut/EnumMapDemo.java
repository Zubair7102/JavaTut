package Collections.EnumMapTut;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* array of size same as enum
* no hashing is done here
* ordinal/index is used
* faster than HashMap
* Memory Efficient */

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.FRIDAY, "Walk");
        map.put(Day.MONDAY, "Gym");
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(map); /* it will print in the same order in which enum is defined inside the enum class that is Monday will come first even if Friday is used first  */

    }

    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

}
