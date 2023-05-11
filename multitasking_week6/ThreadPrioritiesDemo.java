package multitasking_week6;

class PrioritiesDemo extends Thread{
    @Override
    public void run() {
        System.out.println("child thread");
        System.out.println("child Priority: "+Thread.currentThread().getPriority());
    }
}
public class ThreadPrioritiesDemo {
    public static void main(String[] args) {
        System.out.println("Main thread old priority: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        System.out.println("Main thread new priority: "+Thread.currentThread().getPriority());
        PrioritiesDemo p = new PrioritiesDemo();
        p.setPriority(10);
        p.start();
    }
}
