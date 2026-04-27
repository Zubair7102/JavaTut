package StringTut;

public class StrBldr2 {

    public static void main(String[] args) throws InterruptedException {
        StringBuilder str = new StringBuilder();
        Task t1 = new Task(str);
        Task t2 = new Task(str);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("final length: " + str.length());
    }
}

class Task extends Thread{
    private StringBuilder str;

    public Task(StringBuilder str)
    {
        this.str = str;
    }

    @Override
    public void run()
    {
        for(int i =0; i< 1000; i++)
        {
            str.append("a");
        }
    }
}
