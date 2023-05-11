package multitasking_week6;

class TestCase1 extends Thread{
    public void run(){
        System.out.println("Case1 run method-Performing single task from single thread");
    }

}
public class SingleTaskFromSingleThreadDemo {
    public static void main(String[] args) {
        TestCase1 testCase1 = new TestCase1();
        testCase1.start();
    }
}
