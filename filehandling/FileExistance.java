package filehandling;

import java.io.File;
import java.io.IOException;

public class FileExistance {
    public static void main(String[] args) throws IOException {
        File file = new File("abc.txt");
        if(file.exists()){
            System.out.println("File is present at location..");
        }
        else{
            System.out.println("File does exist create it first..");
            file.createNewFile();
            System.out.println("File created..");
        }
        System.out.println("can write:"+file.canWrite());
        System.out.println("can read:"+file.canRead());
        System.out.println("absolute file path:"+file.getAbsolutePath());
        System.out.println("parent file:"+file.getParentFile());
        System.out.println("Get name:"+file.getName());
        System.out.println("can execute:"+file.canExecute());

    }
}
