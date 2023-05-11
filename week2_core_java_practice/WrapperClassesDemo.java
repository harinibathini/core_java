package week2_core_java_practice;


public class WrapperClassesDemo {
    public static void main(String[] args) {
        int number1 = 50;
        System.out.println("Number1 : "+number1);

        Integer number2 = number1;

        System.out.println("This is AutoBoxing");
        System.out.println("Number2 : "+number2);
        System.out.println("Hashcode : "+number2.hashCode());
        int number3 = 0;
         number3 = number2;
        System.out.println("This is Unboxing");
        System.out.println("Number3 : "+number3);


    }
}
