package GenericsTut;
/* Bounded Type Parameters in Java are a way to restrict what types can be used with generics. and this can achieved by extending the generic type <T> to a class or implementing an interface, like here we are extending generic T with Number class which is a super class which is extended by every wrapper class such as Integer, Double, Float, Long */
public class BoundedTypeParameters<T extends Number> {

    private T value;

    public T getValue()
    {
        return value;
    }

    public void setValue(T value)
    {
        this.value = value;
    }
}
