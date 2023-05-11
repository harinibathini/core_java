package week2_core_java_practice;

class SimpleDemo{
    public void show(){
        System.out.println("this is first line");
        int number1=12,number2=0,result=0;
        try{
            result=number1/number2;
        }
       catch(ArithmeticException e){
            //System.out.println("Arithmetic Exception occured");
          // e.printStackTrace();
           System.out.println(e);
           }
        finally{
            System.out.println("this is finally");
            System.out.println("Due to number2 value=0 will have this exception");
        }
        System.out.println("Result is: "+result);
    }
}
public class SimpleException {
    public static void main(String[] args) {
        SimpleDemo simpleDemo = new SimpleDemo();
        simpleDemo.show();

    }
}
