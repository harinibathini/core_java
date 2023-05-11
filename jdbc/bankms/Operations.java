package jdbc.bankms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Random;

public class Operations implements Connectivity{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    ArrayList<Long> list = new ArrayList<>();

    @Override
    public void addBankAccount() throws IOException {
        boolean b = true;
        boolean f = false;
        while(b) {
            System.out.println("Enter: 1 to select Current Account / 2 to select Savings Account / 0 to Exit ");
            int ch = Integer.parseInt(br.readLine());
            long accNo = random.nextLong() % (1000000000000L);
            if(accNo < 0){
                accNo += 1000000000000L;
            }
            list.add(accNo);

            switch(ch) {
                case 1:
                    try {
                        System.out.println("-- CURRENT");
                        Connection connection = Connect.create();
                        String q = "insert into bank values(?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(q);
                        System.out.println("enter id: ");
                        int id = Integer.parseInt(br.readLine());
                        preparedStatement.setString(1, String.valueOf(id));
                        System.out.println("enter name: ");
                        String name = br.readLine();
                        preparedStatement.setString(2, name);
                        System.out.println("enter address: ");
                        String address = br.readLine();
                        preparedStatement.setString(3, address);
                        System.out.println("enter phone: ");
                        String phone = br.readLine();
                        preparedStatement.setString(4, phone);
                        System.out.println("enter email: ");
                        String email = br.readLine();
                        preparedStatement.setString(5, email);
                        String accountType = "current";
                        preparedStatement.setString(6, accountType);
                        System.out.println("enter balance: ");
                        float balance = Float.parseFloat(br.readLine());
                        preparedStatement.setString(8, String.valueOf(balance));
                        System.out.println("enter CompanyName: ");
                        String companyName = (br.readLine());
                        preparedStatement.setString(9, companyName);
                        long accountNo = accNo;
                        preparedStatement.setString(7, String.valueOf(accountNo));
                        preparedStatement.executeUpdate();
                        f = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        System.out.println("-- SAVINGS");
                        Connection connection = Connect.create();
                        String q = "insert into bank values(?,?,?,?,?,?,?,?,?)";
                        PreparedStatement preparedStatement = connection.prepareStatement(q);
                        System.out.println("enter id: ");
                        int id = Integer.parseInt(br.readLine());
                        preparedStatement.setString(1, String.valueOf(id));
                        System.out.println("enter name: ");
                        String name = br.readLine();
                        preparedStatement.setString(2, name);
                        System.out.println("enter address: ");
                        String address = br.readLine();
                        preparedStatement.setString(3, address);
                        System.out.println("enter phone: ");
                        String phone = br.readLine();
                        preparedStatement.setString(4, phone);
                        System.out.println("enter email: ");
                        String email = br.readLine();
                        preparedStatement.setString(5, email);
                        String accountType = "savings";
                        preparedStatement.setString(6, accountType);
                        System.out.println("enter balance: ");
                        float balance = Float.parseFloat(br.readLine());
                        preparedStatement.setString(8, String.valueOf(balance));
                        long accountNo = accNo;
                        preparedStatement.setString(7, String.valueOf(accountNo));
                        //String companyName = null;
                        preparedStatement.setString(9, null);
                        preparedStatement.executeUpdate();
                        f = true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;

                case 0:
                    b = false;
                    break;
                default:
                    System.out.println("enter valid choice");
                    break;
            }
        }
    }

    @Override
    public void deposit() {
        try {
            System.out.println("enter accountNo: ");
            long accno = Long.parseLong(br.readLine());
            for(Long i : list ) {
                if (i == accno) {
                    System.out.println("enter deposit amount: ");
                    float deposit = Float.parseFloat(br.readLine());
                    float newBal =+ deposit;
                    Connection connection = Connect.create();
                    String q = "update table bank set balance = newBal where accountNo = accno";
                    PreparedStatement preparedStatement = connection.prepareStatement(q);

                }
            }




        }catch(Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public void withdraw() {

    }

    @Override
    public void displayAll() {

    }
}
