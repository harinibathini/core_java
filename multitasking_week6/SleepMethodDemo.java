package multitasking_week6;

class SleepDemo extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                //Thread.sleep(-1); //IllegalArgumentException
                Thread.sleep(1000);
                Thread.sleep(1000,2);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class SleepMethodDemo {
    public static void main(String[] args)  {
//        try {
//            for (int i = 1; i <= 5; i++) {
//                Thread.sleep(1000);
//                System.out.println(i);
//            }
//        }catch(Exception e){
//            System.out.println(e);
//        }
        SleepDemo s = new SleepDemo();
        s.start();
    }
}
