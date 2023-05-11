package multitasking_week6;

class SimpleExceptionDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Run method");
    }
}
public class RunnableDemo{
    public static void main(String[] args) {
       SimpleExceptionDemo simpleExceptionDemo = new SimpleExceptionDemo();
       Thread thread = new Thread(simpleExceptionDemo);
       thread.start();
    }
}
