package multitasking_week6;
class JoinDemo extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("child thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
public class JoinMethodDemo {
    public static void main(String[] args) throws InterruptedException {
         JoinDemo j = new JoinDemo();
         j.start();
//         j.join();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main thread : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*
child thread : 0
child thread : 1
child thread : 2
child thread : 3
child thread : 4
main thread : 0
main thread : 1
main thread : 2
main thread : 3
main thread : 4

 */