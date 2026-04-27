package innerClasses;

public class Hotel {
    private String name;

    private int totalRooms;

    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms)
    {
        this.name = name;
        this.reservedRooms = reservedRooms;
        this.totalRooms = totalRooms;
    }

    public void reserveRooms(String guestName, int numOfRooms)
    {
//        LOCAL INNER CLASS
        class ReservationValidator{

            boolean validate()
            {
                if(guestName == null || guestName.isBlank())
                {
                    System.out.println("Guest name cannot be empty.");
                    return false;
                }
                if(numOfRooms < 0)
                {
                    System.out.println("Number of rooms should be positive");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms)
                {
                    System.out.println("Not enough rooms available ");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate())
        {
            reservedRooms += numOfRooms;
            System.out.println("Reserved confirmed for " + guestName + " for " + numOfRooms);
        }
        else {
            System.out.println("Reservation failed ");
        }
    }

}
