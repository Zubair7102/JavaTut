package GenericsTut;

/* Here instead of making class as Generic we can also make Constructor as Generic */
public class GenericConstructor {
    public <T extends Number> GenericConstructor(T value)
    {

    }

    public static void main(String[] args) {
        GenericConstructor genericConstructor = new GenericConstructor(2);
    }
}
