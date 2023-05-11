import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) throws AgeLessThanEighteenException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age;

        try {
            age = br.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        int age = sc.nextInt();
//        System.out.println(age);
        try {
            if (age >= 18) {
                System.out.println("you are eligible for voting");
            } else {
                throw new AgeLessThanEighteenException();
            }
        }catch(AgeLessThanEighteenException e){

        }

    }



}
