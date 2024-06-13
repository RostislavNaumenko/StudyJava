package homework_22.payments;

public interface PaymentSystem {
    void transferMoney(String ownerOfAccount, int amountOfMoney);

    void withdrawMoney(int amountOfMoney);

    double checkBalance();

    //Дополнительный метод пополнения баланса

    double topUpBalance (int amountOfMoney);
}
