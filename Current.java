package Java_Test.Simple_atm;

public class Current extends Account{
    private double bal;
    public Current(double balance){
        bal = balance;
    }
    public void Withdraw(double amount){
        bal= bal-amount;

    }
    public void Deposit(double amount){
        bal= bal+amount;

    }
    public void printBalance(){
        System.out.println("Balance in your current account: "+bal);

    }
}
