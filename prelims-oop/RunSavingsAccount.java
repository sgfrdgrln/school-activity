import java.util.Scanner;

public class RunSavingsAccount {

    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount();

        boolean valid = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter interest rate: ");
        SavingsAccount.setInterestRate(input.nextDouble());
        System.out.print("Enter deposit amount: ");
        savings.addInterest();
        savings.deposit(input.nextDouble());
        System.out.print("Your balance is: ");
        savings.showBalance(savings);
        input.nextLine();

        do {
        System.out.print("Press D for another deposit or W to withdraw: ");
        String option = input.nextLine();
        option = option.toUpperCase();
        
        switch (option) {
            case "D":
                System.out.print("Enter deposit amount: ");
                savings.deposit(input.nextDouble());
                savings.addInterest();
                System.out.print("Your new balance is: ");
                savings.showBalance(savings);
                input.nextLine();
                break;
            case "W":
                System.out.print("Withdrawable amount: ");
                savings.showBalance(savings);
                System.out.print("Enter withdraw amount: ");
                savings.withdraw(input.nextDouble());
                System.out.print("Your new balance is: ");
                savings.showBalance(savings);
                input.nextLine();
                break;
            default:
                System.out.println("Program stopped.");
                valid = false;
                input.close();
                break;
        }
    }while(valid == true);
   
    }
}

class SavingsAccount {
    private double balance;
    public static double interestRate = 0;

    public SavingsAccount() {
        this.balance = 0;
    }
    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }
    public static double getInterestRate() {
        return interestRate;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public double withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        }else {
            amount = 0;
        }
        return amount;
    }
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }
    public void showBalance(SavingsAccount account) {
        System.out.print(account.getBalance() + "\n");
    }
}