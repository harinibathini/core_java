package jdbc.bankms;

import java.io.IOException;

public interface Connectivity {
    public void addBankAccount() throws IOException;
    public void deposit();
    public void withdraw();
    public void displayAll();
}
