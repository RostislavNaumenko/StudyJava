package homework_22.payments;

public class Test {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new ElectronicWallet("Rostyslav Naumenko", 5000);


        System.out.println(paymentSystem.checkBalance());

        System.out.println(paymentSystem.checkBalance());

        paymentSystem.transferMoney("Stanislav Shurko", 600);

        paymentSystem.withdrawMoney(400);

        System.out.println(paymentSystem.checkBalance());

        System.out.println(paymentSystem.toString());

        System.out.println("\n=====================\n");


        PaymentSystem paymentSystem1 = new BankAccount("Stanislav Shurko", 100_000, "Sparcasse");

        PaymentSystem paymentSystem2 = new BankAccount("Vlad Basko", 4000 , "MonoBank");

        System.out.println(paymentSystem1.toString());


        paymentSystem2.withdrawMoney(8000);


        paymentSystem2.transferMoney("ros", 3000);


        paymentSystem2.topUpBalance(1000);

        paymentSystem2.withdrawMoney(150);

        System.out.println(paymentSystem2.toString());

        System.out.println("\n=====================\n");

        paymentSystem1.withdrawMoney(50000);

        System.out.println(paymentSystem1.toString());

        paymentSystem2.topUpBalance(100000);

        System.out.println(paymentSystem2.toString());


    }
}
