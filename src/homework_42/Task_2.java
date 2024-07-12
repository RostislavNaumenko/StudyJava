package homework_42;

/*
* Дан список транзакций (Transaction) с полями amount, type (DEBIT/CREDIT), timestamp. Используя Stream API,
* вычислите общую сумму для дебетовых и кредитных транзакций отдельно, а также найдите транзакцию с максимальной суммой.
* */

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Task_2 {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction(100.0, TransactionType.DEBIT, LocalDateTime.now().minusDays(1)));
        transactions.add(new Transaction(200.0, TransactionType.CREDIT, LocalDateTime.now().minusHours(5)));
        transactions.add(new Transaction(250.0, TransactionType.DEBIT, LocalDateTime.now().minusMinutes(30)));
        transactions.add(new Transaction(300.0, TransactionType.CREDIT, LocalDateTime.now()));

        DoubleSummaryStatistics statisticsDebit = transactions.stream()
                .filter(transaction -> transaction.getType().equals(TransactionType.DEBIT))
                .collect(Collectors.summarizingDouble(Transaction::getAmount));

        double sumDebit = statisticsDebit.getSum();

        DoubleSummaryStatistics statisticsCredit = transactions.stream()
                .filter(transaction -> transaction.getType().equals(TransactionType.CREDIT))
                .collect(Collectors.summarizingDouble(Transaction::getAmount));

        double sumCredit = statisticsCredit.getSum();


        double maxTransaction = Math.max(statisticsDebit.getMax(), statisticsCredit.getMax());


        System.out.println("Сумма дебетовых транзакций: " + sumDebit);
        System.out.println("Сумма кредитовых транзакций: " + sumCredit);
        System.out.println("Максимальная транзакция: " + maxTransaction);
    }

}
