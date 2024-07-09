import java.util.Scanner;;

class BankAccount {
    private double bal;

    public BankAccount(double initBal) {
        this.bal = initBal;
    }

    public double GetBal() {
        return bal;
    }

    public void deposite(double ammount) {
        if (ammount > 0) {
            bal += ammount;

            System.out.println("deposited: $" + ammount);
        } else {
            System.out.println("invalid deposite ammount");

        }

    }

    public void withDraw(double ammount) {
        if (ammount > 0 && ammount <= bal) {
            bal -= ammount;
            System.out.println("withdrew:$" + ammount);

        } else if (ammount > bal) {
            System.out.println("insufficient balance");

        } else {
            System.out.println("invalid withdrawal ammount:");

        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;

    }

    public void displayMenu() {
        System.out.println("\nATM menu:");
        System.out.println("1.Check Bank Balance\n2.Deposite\n3.Withdraw\n4.Exit");

    }

    public void checkbal() {
        System.out.println("Current balance:$" + account.GetBal());

    }

    public void deposite(double ammont) {
        account.deposite(ammont);

    }

    public void withDraw(double ammount) {
        account.withDraw(ammount);

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            displayMenu();
            System.out.println("choose an option\n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    checkbal();
                    break;
                case 2:
                    System.out.println("enter deposite ammount");
                    double depositeAmmount = scanner.nextDouble();
                    deposite(depositeAmmount);
                    break;
                case 3:
                    System.out.println("enter with drawal ammount");
                    double withdrawalAmnt = scanner.nextDouble();
                    withDraw(withdrawalAmnt);
                    break;
                case 4:
                    exit = true;
                    System.out.println("thank you for using the ATM.");
                    break;

                default:
                    System.out.println("invalid option");

            }

        }
        scanner.close();
    }
}

public class Simpleatm {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        ATM atm = new ATM(account);
        atm.start();
    }
}