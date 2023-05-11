package multitasking_week6;

/*class TestDaemon extends Thread{
    @Override
    public void run() {
//        if(Thread.currentThread().isDaemon()){
//            System.out.println("Daemon thread");
//        }else {
//            System.out.println("child thread");
//        }
//    }
        System.out.println("daemon thread");
    }
}

 */
public class DaemonThreadMethods extends Thread{
    public void run(){
        System.out.println("daemon thread");
    }
    public static void main(String[] args) {
       // System.out.println("Main thread");
//        TestDaemon t = new TestDaemon();
//        t.setDaemon(true);
//        t.start();
        DaemonThreadMethods d = new DaemonThreadMethods();
        d.setDaemon(true);
        d.start();
    }
}
