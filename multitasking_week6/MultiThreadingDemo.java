package multitasking_week6;

class Test1 extends Thread{
     @Override
     public void run(){
         System.out.println("Thread task of run method of test1 class using thread");
     }
}
class Test2 implements Runnable{
    public void run(){
        System.out.println("Thread task of run method of test2 class using Runnable");
    }

}
public class MultiThreadingDemo {
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.start();
       // t.start();//exception - IllegalThreadStateException
        Test2 t2 = new Test2();
        Thread th = new Thread(t2);
        th.start();
    }
}
