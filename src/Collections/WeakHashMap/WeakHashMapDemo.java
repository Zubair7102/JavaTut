package Collections.WeakHashMap;

import java.awt.*;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap();
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));
        System.out.println(imageCache);
        k1 = null;
        k2 = null;
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared" + imageCache);
    }

    private static void simulateApplicationRunning()
    {
        try{
            System.out.println("Simulating application runnning.....");
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}

class Image{
    private String name;

    public Image(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
