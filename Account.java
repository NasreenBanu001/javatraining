package Java_Test.Simple_atm;

public class Account {
    protected double balance;
    public void Withdraw(double amount){
    }
    public void Deposit(double amount){
    }
    public void printBalance(){
    }

    public static void main(String args[]){
        Account SAccount=new Saving(50000);
        SAccount.Deposit(1000);
        SAccount.printBalance();

        SAccount.Withdraw(3000);
        SAccount.printBalance();

        Account CAccount=new Current(50000);
        CAccount.Deposit(1000);
        CAccount.printBalance();
        CAccount.Withdraw(3000);
        CAccount.printBalance();

    }
}

