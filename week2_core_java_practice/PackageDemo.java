package week2_core_java_practice;


//import static java.lang.Math.abs;
//import static java.lang.Math.sqrt;
import static java.lang.Math.*;

public class PackageDemo {
    public static void  mathFunctionality() {
        System.out.println(sqrt(16));
        System.out.println(abs(23.6));
        System.out.println(ceil(23.5));
    }
    public static void main(String[] args) {
        PackageDemo.mathFunctionality();
    }
}
