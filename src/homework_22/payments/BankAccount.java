package homework_22.payments;

public class BankAccount implements PaymentSystem {

    //TODO Сделать проверку на банк, если один и тот же  банк то комиссия меньше, если другой, то комиссия больше
    //TODO Сделать проверку на существование банковского аккаунта с таким именем если нет, то перевод не срабатывает
    //TODO Сберегательный счет (каждый год начисляется процент от суммы, но этими деньгами нельзя пользоваться)

    //Regular user commission
    private static final double TRANSFER_COMMISSION = 25;
    private static final double WITHDRAW_COMMISSION = 20;

    //Premium user commission
    private static final double TRANSFER_COMMISSION_PREMIUM = 12;
    private static final double WITHDRAW_COMMISSION_PREMIUM = 12;

    private String ownerOfWallet;
    private double balance;
    private String bank;

    //Once you receive a premium, it stays forever
    private boolean premiumUser;

    public BankAccount(String ownerOfWallet, double balance, String bank) {
        this.ownerOfWallet = ownerOfWallet;
        this.balance = balance;
        this.bank = bank;

        if (balance >= 100_000) {
            this.premiumUser = true;
        } else {
            this.premiumUser = false;
        }
    }

    @Override
    public void transferMoney(String ownerOfAccount, int amountOfMoney) {

            if (this.balance < countTransferCommission(amountOfMoney)) {

                System.out.println("Not enough money in your account");

                System.out.println("Your balance: " + checkBalance());
            } else {

                setBalance(countTransferCommission(amountOfMoney));

                System.out.printf("You send: %d to %s \n", amountOfMoney, ownerOfAccount);

                System.out.println("Your balance: " + checkBalance());
            }


    }

    private double countTransferCommission (int amountOfMoney){
        if(this.premiumUser){
          return (amountOfMoney + (amountOfMoney * TRANSFER_COMMISSION_PREMIUM) / 100);
        }
        return (amountOfMoney + (amountOfMoney * TRANSFER_COMMISSION) / 100);
    }

    @Override
    public void withdrawMoney(int amountOfMoney) {

            if (this.balance <  countWithdrawCommission(amountOfMoney)){

                System.out.println("Not enough money in your account");

                System.out.println("Your balance: " + checkBalance());
            } else {

                setBalance(countWithdrawCommission(amountOfMoney));

                System.out.println("You have withdrawn from your account: " + amountOfMoney);

                System.out.println("Your balance: " + checkBalance());
            }

    }

    private double countWithdrawCommission (int amountOfMoney){
        if (this.premiumUser){
            return (amountOfMoney + (amountOfMoney * WITHDRAW_COMMISSION_PREMIUM) / 100);
        }
        return (amountOfMoney + (amountOfMoney * WITHDRAW_COMMISSION) / 100);
    }


    @Override
    public double topUpBalance(int amountOfMoney) {
        return balance += amountOfMoney;
    }

    @Override
    public double checkBalance() {
        if(balance >= 100_000) setPremiumUser();
        return balance;
    }

    private void setPremiumUser() {
        this.premiumUser = true;
    }

    private void setBalance(double amountOfMoney) {
        this.balance -= amountOfMoney;
    }

    @Override
    public String toString() {

        if(balance >= 100_000) setPremiumUser();

        if (this.premiumUser){
            char ch = '\u2605';
            return "BankAccount " + ch + " {" +
                    "ownerOfWallet='" + ownerOfWallet + '\'' +
                    ", balance=" + balance +
                    ", bank='" + bank + '\'' +
                    ", withdraw commission='" + WITHDRAW_COMMISSION_PREMIUM/10 + "%" +
                    ", transfer commission='" + TRANSFER_COMMISSION_PREMIUM/10 + "%" +
                    '\'' +
                    '}';
        }
        return "BankAccount{" +
                "ownerOfWallet='" + ownerOfWallet + '\'' +
                ", balance=" + balance +
                ", bank='" + bank + '\'' +
                ", withdraw commission='" + WITHDRAW_COMMISSION/10  + "%" +
                ", transfer commission='" + TRANSFER_COMMISSION/10 + "%" +
                '\'' +
                '}';
    }
}
