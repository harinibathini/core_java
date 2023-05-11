package multitasking_week6;

class YieldDemo extends Thread{
    @Override
    public void run() {
        Thread.yield();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
public class YieldMethodDemo {
    public static void main(String[] args) {
         YieldDemo y = new YieldDemo();
         y.start();

        // Thread.yield(); if you want main method to stop and provide chance to others

         for(int i=0;i<5;i++){
             System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
