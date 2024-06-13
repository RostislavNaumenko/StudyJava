package homework_22.payments;

public class ElectronicWallet implements PaymentSystem {
    private String ownerOfWallet;
    private double balance;

    public ElectronicWallet(String ownerOfWallet, int balance) {
        this.ownerOfWallet = ownerOfWallet;
        this.balance = balance;
    }


    @Override
    public void transferMoney(String ownerOfAccount, int amountOfMoney) {
        if (this.balance < amountOfMoney) {

            System.out.println("Not enough money in your account");

            System.out.println("Your balance: " + checkBalance());
        } else {

            setBalance(amountOfMoney);

            System.out.printf("You send: %d to %s \n", amountOfMoney, ownerOfAccount);

            System.out.println("Your balance: " + checkBalance());
        }

    }

    @Override
    public void withdrawMoney(int amountOfMoney) {
        if (this.balance < amountOfMoney) {

            System.out.println("Not enough money in your account");

            System.out.println("Your balance: " + checkBalance());
        } else {

            setBalance(amountOfMoney);

            System.out.println("You have withdrawn from your account: " + amountOfMoney);

            System.out.println("Your balance: " + checkBalance());
        }
    }


    @Override
    public double topUpBalance(int amountOfMoney) {
        return balance += amountOfMoney;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public String getOwnerOfWallet() {
        return ownerOfWallet;
    }

    private void setBalance(int amountOfMoney) {
        this.balance -= amountOfMoney;
    }

    @Override
    public String toString() {
        return "ElectronicWallet{" +
                "ownerOfWallet='" + ownerOfWallet + '\'' +
                ", balance=" + balance +
                '}';
    }
}
