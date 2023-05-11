package multitasking_week6;

class TestCase2 extends Thread{
    public void run(){
        System.out.println("case2 run method-Performing single task from multiple thread");
    }

}
public class SingleTaskFromMultipleThreadDemo {
    public static void main(String[] args) {
        TestCase2 test1 = new TestCase2();
        test1.start();
        TestCase2 test2 = new TestCase2();
        test2.start();
        TestCase2 test3 = new TestCase2();
        test3.start();
        TestCase2 test4 = new TestCase2();
        test4.start();
    }
}
