package multitasking_week6;

class Test extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("Harini");
        System.out.println("thread task: "+Thread.currentThread().getName());
        System.out.println("Is alive: "+Thread.currentThread().isAlive());
    }
}
public class ThreadBasicAndNamingMethods {
    public static void main(String[] args) {
        /* CHANGING THE NAME OF MAIN METHOD
        System.out.println("Hello");
        System.out.println("Thread name before using setName method: "+Thread.currentThread().getName());
       // System.out.println(10/0);
        Thread.currentThread().setName("Harini");
        //System.out.println(13/0);
        System.out.println("New thread name after using setName method: "+Thread.currentThread().getName());
       */
        System.out.println("Hello :"+Thread.currentThread().getName());
        Test t1 = new Test();
        //t1.setName("Harini");
        t1.start();
        Test t2 = new Test();
        t2.setName("Coditas");
        t2.start();
        System.out.println("name of current thread in main method: "+Thread.currentThread().getName());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println("t2 is alive: "+t2.isAlive());
        System.out.println("t1 is alive: "+t1.isAlive());

    }

}
