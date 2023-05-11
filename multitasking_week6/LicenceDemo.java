package multitasking_week6;

class Medical extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Medical starts");
            Thread.sleep(3000);
            System.out.println("Medical Completed");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class TestDrive extends Thread{
    @Override
    public void run() {
        try{
            System.out.println("Test Drive starts");
            Thread.sleep(5000);
            System.out.println("Test Drive Completed");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class OfficerSign extends Thread{
    @Override
    public void run() {
            try{
                System.out.println("Officer takes the file");
                Thread.sleep(3000);
                System.out.println("Officer's work Completed");
            }catch(Exception e){
                System.out.println(e);
            }
    }
}
public class LicenceDemo {
    public static void main(String[] args) throws InterruptedException {
         Medical medicalTest = new Medical();
         medicalTest.start();
         medicalTest.join();

         TestDrive testDrive = new TestDrive();
         testDrive.start();
         testDrive.join();

         OfficerSign officerSign = new OfficerSign();
         officerSign.start();

    }
}
