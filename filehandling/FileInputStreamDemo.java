package filehandling;

import sun.security.util.Length;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException{
        try {
            FileInputStream fileInputStream = new FileInputStream("abc.txt");
            System.out.println(fileInputStream.read());
            //System.out.println(fileInputStream.length());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
       }
    }
}
