package GenericsTut;

public class Test {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>(); //Box is now Type safe
        box.setValue(2);
//        int i = (int) box.getValue();
//        System.out.println(i);
        int i = box.getValue();
        System.out.println(i);
        System.out.println(box.getValue());

        Pair<Integer, String> pair = new Pair<>(24, "Zubair");
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        Box<Integer> boxNew = new Box<>();

    }
}
