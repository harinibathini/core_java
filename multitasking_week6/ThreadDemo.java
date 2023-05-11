package multitasking_week6;

class SimpleDemo extends Thread{
    //after calling start() control comes here and thread lifecycle begins from this point
    public void run(){
        for(int i=0;i<5;i++) {
            try {
                Thread.sleep(500);
                System.out.println("Current thread is: " + Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
           }

        }
    }

//    public void sleep() {
//        System.out.println("sleep method");
//    }
//    public void display(){
//        System.out.println("Display of SimpleDemo");
//    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
            SimpleDemo simpleDemo = new SimpleDemo();
           // simpleDemo.display();
            SimpleDemo simpleDemo1 = new SimpleDemo();
            SimpleDemo simpleDemo2 = new SimpleDemo();
            simpleDemo.setName("A");
            simpleDemo1.setName("B");
            simpleDemo2.setName("C");
           // simpleDemo.
       // System.out.println(Thread.currentThread());
        simpleDemo.start();// it call run implicitly
        //simpleDemo.yield();
       // simpleDemo.join();
        //simpleDemo.sleep(2000);

        //simpleDemo.start();

       // simpleDemo2.sleep(1000);
        simpleDemo2.start();

       // simpleDemo2.yield();
       // simpleDemo1.setDaemon(true);
        simpleDemo1.start();
        //isalive,getstate,setPriority,setDaemon,join
        //try keeping start method 2 times on same method
    }

}
