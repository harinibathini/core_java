package jdk8features;

interface FunctionalInterface{
    void abstractFunction(int x);
    default void add(){
        System.out.println("default add method");
    }
    static void sub(){
        System.out.println("static sub method");
    }
}
public class Lambda {
    //before 1.8 approach

//    public static void main(String[] args) {
//        FunctionalInterface f = new FunctionalInterface() {
//            @Override
//            public void abstractFunction(int x) {
//                System.out.println("details: " + 5 * x);
//            }
//        };
//        f.abstractFunction(5);
//
//        System.out.println("*****************************************");
//        FunctionalInterface f1 = (int x) -->
//    }
}
