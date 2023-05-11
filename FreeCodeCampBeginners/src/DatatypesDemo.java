import java.lang.String;
import java.util.*;
public class DatatypesDemo {
    public static void main(String[] args) {
        String name = "Harini Bathini";
        String country = "India";
        int age = 21;
        String company = "Coditas";
        float gpa = 8.5f;
        char percentSign = '%';
        boolean isTruth = true;

        String formattedString = String.format("My name is : %s. I am from %s. My age is : %d. I am working at %s. My gpa is : %f. I have attended 100%c of my university classes. These are all %b claims ",name,country,age,company,percentSign,isTruth);
        System.out.println(formattedString);

    }
}
