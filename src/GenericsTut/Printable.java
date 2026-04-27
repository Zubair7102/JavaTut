package GenericsTut;

public interface Printable {
    void print();
}

class MyNumber extends Number implements Printable{

    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(STR."MyNumber is: \{value}"); // this is similar to System.out.println("MyNumber is: " + value);
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

//below syntax will always include first Class and second will be an interface
class Dabba<T extends Number & Printable>{
    public static void main(String[] args) {
        Dabba<MyNumber> dabba = new Dabba<>();
    }

}


