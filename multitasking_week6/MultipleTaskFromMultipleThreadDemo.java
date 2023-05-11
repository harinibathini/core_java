package multitasking_week6;

class TestCaseA extends Thread{
   public void run(){
      System.out.println("Video is playing");
   }
}
class TestCaseB extends Thread{
  public void run(){
      System.out.println("Music is playing");
  }
}
class TestCaseC extends Thread{
    public void run(){
        System.out.println("Progress bar is executing");
    }
}
class TestCaseD extends Thread{
    public void run(){
        System.out.println("Timer is executing");
    }
}

public class MultipleTaskFromMultipleThreadDemo {
    public static void main(String[] args) {
      TestCaseA testCaseA = new TestCaseA();
      testCaseA.start();
      TestCaseB testCaseB = new TestCaseB();
      testCaseB.start();
      TestCaseC testCaseC = new TestCaseC();
      testCaseC.start();
      TestCaseD testCaseD = new TestCaseD();
      testCaseD.start();
      //all these tasks gets executed at once
    }
}
