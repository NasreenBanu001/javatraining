package Java_Test.Simple_atm;

public class Saving extends Account {
private double bal;
    public Saving(double balance){
            bal = balance;
    }
    private double interest_rate=0.8;
    public void Withdraw(double amount){
        bal= bal-amount-(amount*interest_rate);

    }
    public void Deposit(double amount){
        bal= bal+amount+(amount*interest_rate);

    }
    public void printBalance(){
        System.out.println("Balance in your saving account: "+bal);

    }
}
