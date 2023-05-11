package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
