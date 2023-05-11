package serialization;

import java.io.*;
import java.util.logging.Logger;

public class SerializableNonSerializableExample {
    private static final long serialVersionUID = 4L;
    private static final String fileName = "DemoClassBytes.ser";
    private static final Logger logger = Logger.getLogger("");
    private static String staticVariable;
    private int intVariable;
    transient private String transientVariable = "this is a transient instance field";
    private Thread threadClass;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Serialization
        SerializableNonSerializableExample test = new SerializableNonSerializableExample();
        test.intVariable = 1;
        staticVariable = "this is a static variable";
        //writeOut(test);
        System.out.println("DemoClass to be saved: "+test);

// Deserialization
        System.out.println("DemoClass deserialized: "+readIn());

    }
    public static Object readIn() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(fileName)));
        return objectInputStream.readObject();
    }
    public static void writeOut(java.io.Serializable obj) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)));
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }

    @Override
    public String toString() {
        return "SerializableNonSerializableExample{" +
                "intVariable=" + intVariable +
                ", transientVariable='" + transientVariable + '\'' +
                ", threadClass=" + threadClass +
                '}';
    }
}
