package serialization.Sc;

import java.util.Scanner;

public class nextTest {
        public static void main(String[] args) {

            System.out.println("Hello world!");
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\\s*:\\s*");
            //sc.useDelimiter("\\s*,\\s*");
            System.out.println("enter name: ");
            String s = sc.next();

            System.out.println("name is:"+s);

        }

}

////Output:
//Hello world!
//        enter name:
//        Harini Bathini Harini ,Bathini Harini *Bathini  //////            :                  Harini Bathini Harini Bathini Harini Bathini ,:
//        name is:Harini Bathini Harini ,Bathini Harini *Bathini  //////Hello world!
//        enter name:
//        Harini Bathini Harini ,Bathini Harini *Bathini  //////            :                  Harini Bathini Harini Bathini Harini Bathini ,:
//        name is:Harini Bathini Harini ,Bathini Harini *Bathini  //////