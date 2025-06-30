package exercise;

 class bankAcc {
    private String AccountHolderName;
    private int AccNumber;
    private double AccountBalance;

    public bankAcc(String accountHolderName, int accNumber) {
        AccountHolderName = accountHolderName;
        AccNumber = accNumber;

    }

     public double getAccountBalance() {
         return AccountBalance;
     }

     public void Deposit(double money) {
        if (money <= 0){
            System.out.println("invalid input");
        }else{
            AccountBalance+= money;
        }
    }



    public double Withdraw(double amount) {
        if (AccountBalance <= amount) {
            System.out.println("invalid amount , balamnce is less");
        } else if (AccountBalance > amount) {
            AccountBalance -= amount;
            System.out.println("Withdrawl successful");
        } else if (amount <= 0) {
            System.out.println("Invalid input");
        } else {
            amount = AccountBalance;
        }
        return amount;
    }
        public static void main (String[]args){



    }
}