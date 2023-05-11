package multitasking_week6;

class SleepDemo2 extends Thread{
    @Override
    public void run() {
        try{
            for(int i=0;i<5;i++){
                System.out.println(i+" : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class SleepMethodDemo2 {
    public static void main(String[] args) {
        SleepDemo2 s1 = new SleepDemo2();
        s1.start();

        SleepDemo2 s2 = new SleepDemo2();
        s2.start();

    }
}
/*
0 : Thread-0
0 : Thread-1
1 : Thread-1
1 : Thread-0
2 : Thread-0
2 : Thread-1
3 : Thread-1
3 : Thread-0
4 : Thread-1
4 : Thread-0

Process finished with exit code 0

 */
/*
if we use run method
0 : main
1 : main
2 : main
3 : main
4 : main
0 : main
1 : main
2 : main
3 : main
4 : main

 */
