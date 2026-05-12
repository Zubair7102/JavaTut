package Collections.GarbageCollection;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) throws InterruptedException {
         Phone phone = new Phone("Apple", "17 pro");
         /* object created in Heap
          Here phone variable is a Strong Reference -> Garbage collector could not delete the heap memory until phone exists */
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Google", "Pixel10 pro" ));
//        System.out.println(phone.toString());
//        System.out.println(phone);
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }
        catch (Exception a)
        {
            System.out.println(a.getMessage());
        }
        System.out.println(phoneWeakReference.get());

    }
}

class Phone{
    String brand;
    String model;

    public Phone(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}


