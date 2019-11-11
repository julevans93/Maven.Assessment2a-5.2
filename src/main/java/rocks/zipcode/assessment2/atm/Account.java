package rocks.zipcode.assessment2.atm;

public class Account {

    // this is only boiler plate. add your group's code here.

    // ********
    //
    // See why you needed to get ATM finished this weekend??
    //
    // ********
    Double account;
    Double accountBalance = 0.0;
    Double currentBalance;

    public Account(double v) {
        this.account = v;
    }

    public double balance() {
        return accountBalance + this.account;
    }

    public boolean closeAccount() {
        return false;
    }

    public void deposit(double v) {
        this.accountBalance =v;
    }

    public Double withdraw(double v) {

        return v;
    }

    public void transfer(Account b, double v) {
    }
}
