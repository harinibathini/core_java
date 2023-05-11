package java_io_practice;

import java.io.IOException;

public class StreamDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Simple message");
        System.err.println("error message");
        int i = System.in.read();
        System.out.println(i);
        System.out.println((char)i);

    }
}
