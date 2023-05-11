package week5_exceptionHandlingPractice;

public class TestException {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println(100/0);
        System.out.println("4");
        System.out.println("5");
    }
}

/*
1
2
3
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at week5_exceptionHandlingPractice.TestException.main(TestException.java:8)

 */