package week2_core_java_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Demo{
    public void show() {
            //throws FileNotFoundException {
        try {
            FileInputStream fileInputStream = new FileInputStream("abcd.txt");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
public class ThrowsDemo {
    public static void main(String[] args) throws FileNotFoundException  {
        Demo demo = new Demo();
        demo.show();
    }
}
