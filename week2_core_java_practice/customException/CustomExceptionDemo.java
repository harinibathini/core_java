package week2_core_java_practice.customException;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Register register = new Register();
        register.checkCriteria("french",19);
        System.out.println("--------------");
        register.checkCriteria("indian",17);
        System.out.println("--------------");
        register.checkCriteria("indiana",15);
        System.out.println("--------------");
    }
}

/*
You are not Indian citizen :: You are not eligible for voting...
null

--------------
You are a minor:: You are  not eligible for voting...

--------------
You are a minor:: You are  not eligible for voting...

You are not Indian citizen :: You are not eligible for voting...
null

--------------
 */