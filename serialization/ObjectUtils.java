package serialization;

import java.io.*;

public class ObjectUtils {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Address address = new Address("abc", "India");
        try(FileOutputStream fos = new FileOutputStream("address.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(address);
            oos.flush();
        }
        Address result = null;
        try(FileInputStream fis = new FileInputStream("address.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)){
            result = (Address) ois.readObject();
        }
        System.out.println(result);
    }
}

