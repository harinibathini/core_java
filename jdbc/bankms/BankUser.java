package jdbc.bankms;

public class BankUser {
    String name ;
    String address;
    String phone;
    String email;
    String accountType;
    long accountNo;
    float balance;
    String companyName;

    public BankUser(String name, String address, String phone, String email, String accountType, long accountNo, float balance, String companyName) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.balance = balance;
        this.companyName = companyName;
    }

    public BankUser(String name, String address, String phone, String email, String accountType, long accountNo, float balance) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.balance = balance;
    }
    BankUser(){

    }

    @Override
    public String toString() {
        return "BankUser{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", accountType='" + accountType + '\'' +
                ", accountNo=" + accountNo +
                ", balance=" + balance +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
