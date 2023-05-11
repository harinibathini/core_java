package multitasking_week6;


public class JoinMethodDemo2 extends Thread {
     static Thread mainthread;
    public void run() {
        try{
            mainthread.join();
            for(int i=0;i<5;i++){
                System.out.println("child thread: "+i);
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        mainthread = Thread.currentThread();
        JoinMethodDemo2 j = new JoinMethodDemo2();
        j.start();

        try{
            for(int i=0;i<5;i++){
                System.out.println("main thread: "+i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
