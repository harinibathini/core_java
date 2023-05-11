package stringsPractice_week5;

public class StringScpDemo {
    public static void main(String[] args) {
        String s = new String("deepak");
        System.out.println(s);
        s.concat(" java");
        System.out.println(s);
        System.out.println(s.concat(" java"));
        s=s.concat(" python");
        System.out.println(s);
        System.out.println("------");

        StringBuffer sb = new StringBuffer("harini");
         sb = sb.append(" java");
        System.out.println(sb);
        System.out.println("------");
        String s1 = new String("har");
        String s2 = new String("har");
        String s3 ="amit";
        String s4 = "amit";
        System.out.println(s1==s2);
        System.out.println(s3==s4);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println("----String Constructors----");
        //StringBuilder sb1 = new StringBuilder("deepak");
        //StringBuffer sb1 = new StringBuffer("deepak");
       // byte[] b = {101,102,103};
        char[] c = {'a','b','c'};
        //String str = new String(sb1);
        //String str = new String(b);
        String str = new String(c);
        System.out.println(str);
        String str1 = new String("abc");
        System.out.println(str1);




    }
}
