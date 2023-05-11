package jdbc.bankms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("_______BANK MANAGEMENT SYSTEM_______");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Operations operations = new Operations();
        while(true){
            System.out.println("----------------------------");
            System.out.println("enter 1 to ADD BANK ACCOUNT");
            System.out.println("enter 2 to DEPOSIT AMOUNT");
            System.out.println("enter 3 to WITHDRAW AMOUNT");
            System.out.println("enter 4 to DISPLAY ALL DETAILS");
            System.out.println("enter 0 to EXIT");
            System.out.println("----------------------------");
            System.out.println("enter choice");
            int choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                    System.out.println("-- ADD BANK ACCOUNT");
                    operations.addBankAccount();
                    break;
                case 2:
                    System.out.println("-- DEPOSIT AMOUNT");
                    break;
                case 3:
                    System.out.println("-- WITHDRAW AMOUNT");
                    break;
                case 4:
                    System.out.println("-- DISPLAY ALL DETAILS");
                    break;
                case 0:
                    System.out.println("-- EXIT");
                    System.exit(0);
                    break;
                default:
                    System.out.println("-- enter valid choice");
                    break;
            }

        }
    }
}
