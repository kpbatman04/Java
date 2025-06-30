package exercise;

public class Customer {
    public static void main(String[] args) {
        bankAcc ac = new bankAcc("Krish Prajapti",1234);
        ac.Deposit(100);
        System.out.println("Cureent balance" + ac.getAccountBalance());
        System.out.println(ac.Withdraw(200));
        System.out.println("Remaining balance " + ac.getAccountBalance() );
    }
}
