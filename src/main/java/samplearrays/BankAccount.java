package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    //TO-DO: Initialize an Array with 1000 in size that stores Double called 'transactions' to keep track of the user's transactions
    double[] transactions = new double[1000];
    int counter=0;
    public BankAccount(String name, int startingBalance){
        this.name=name;
        this.currentBalance=startingBalance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.currentBalance += amount;
            this.counter++;
            this.transactions[counter] = amount;
            System.out.println("Deposited " + amount + " from " + name +", new balance = " + this.currentBalance + "\n");
        }
        else{
            System.out.println("unsuccessful deposit");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && this.currentBalance >= amount){
            this.currentBalance -= amount;
            this.counter++;
            this.transactions[counter] = -amount;
            System.out.println("Withdraw " + amount + " from " + name +", new balance = " + this.currentBalance + "\n");

        }
        else{
            System.out.println("unsuccessful withdraw");
        }
    }

    public void displayTransactions(){
        System.out.println("Transactions: ");
        for(int i=0;i<this.counter;i++){
            System.out.println(transactions[i]);

        }
    }

    public void displayBalance(){
        System.out.println("Current balance: " + this.currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}
