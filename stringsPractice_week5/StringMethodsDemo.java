package stringsPractice_week5;
 import java.util.*;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "";
        String email = "abc@gmail.com";
        String password = "abc123";
        System.out.println("---length method---");
        System.out.println(name.length());
        if(name.length()==0){
            System.out.println("name is empty");
        }
        System.out.println(email.length());
        String name1 = null;
        System.out.println(name1); //no error or exception
       // System.out.println(name1.length()); //but this gives nullpointer exception
        System.out.println("--isEmpty method--");
        if(name.isEmpty()){
            System.out.println("name is empty");
        }else{
            System.out.println("name is not empty");
        }
        System.out.println("--trim method--");
        name=" abc  ";
        String s = name.trim();
        System.out.println(s);
        name = " abc   xyz  ";
        System.out.println(name.trim());
        name = "  ";
        if(name.trim().length()==0)
        {
            System.out.println("empty string");
        }
        String name2 = "     ";
        System.out.println(name2);
        System.out.println(name2.trim().isEmpty());
        String name3 = "   harini  ";

        System.out.println(name3);
        System.out.println(name3.trim());
        System.out.println("----equals & equalsIgnore case-------");
            String str1 = "deepak";
            String str2 = "amit";
            String str3 = "DeepaK";
            System.out.println(str1.equals(str2));
            System.out.println(str1.equals(str3));
            System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println("---compareTo and compareToIgnoreCase method---");
        String s1 ="a";
        String s2 = "A";
        System.out.println(s1.compareTo(s2));
        s1="Abcd";
        s2="aBCd";
        System.out.println(s1.compareTo(s2)); //compares sum of ascii values
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println("---these methods are for addition of strings and substrings---");
        System.out.println("--concat method--");
        String a1 = "deepak";
        String a2 = " java";
        System.out.println(a1+a2);
        System.out.println(a1+10);
        System.out.println(a1+10+20);
        System.out.println(10+a1+20);
        System.out.println(10+20+a1);
        System.out.println(a1+20/10);
        System.out.println(a1+10*20);
        // System.out.println(s1+10-20); throws error..as - doesn't work like + with strings
        System.out.println(a1.concat(a2));
        System.out.println("---String.join(CharSequence delimiter,CharSequence... elements)");
        System.out.println(String.join(",",a1,a2,a1));
        System.out.println(String.join(";",a1,a2,a1));
        System.out.println("---subsequence related methods---");
         String b = "This is demo";
        System.out.println(b.subSequence(3,9));
        System.out.println(b.substring(3));
        System.out.println(b.substring(3,9));
        System.out.println(b.substring(3,11));
        System.out.println("output of b.substring(0,0) is :"+ b.substring(0,0));
  /*
  The method subSequence() obtains a part of a String given the starting
  index and the length of the result. The method SubSequence()
  behaves in the same way as substring(). The only difference is
  that it returns a CharSequence instead of a String
   */
    }
}
