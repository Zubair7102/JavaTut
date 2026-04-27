package GenericsTut;

public class GenericMethods {
    public static void main(String[] args) {

//        Test test = new Test();
//        GenericMethods genericMethods = new GenericMethods();
        Integer[] intArray = {1,2,3,4};
        String[] stringArray ={"Hello", "Zubair", "Ahmed"};
        printArray(intArray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] array)
    {
        for(T element : array)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
