package lambdatest;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

public class StreamTest {


    public static void main(String[] args) {
        Map<Currency, List<Transaction>> transactionsByCurrencies = new HashMap<>();
        List<Transaction> transactionList=new ArrayList<Transaction>();
        Transaction transaction=new Transaction();
        transaction.setOrderId("0460000001");
        transaction.setCurrency(new Currency("RMB"));
        transaction.setMoney(1001L);
        transactionList.add(transaction);
        transaction=new Transaction();
        transaction.setOrderId("0460000002");
        transaction.setCurrency(new Currency("RMB2"));
        transaction.setMoney(1003L);
        transactionList.add(transaction);
        transaction=new Transaction();
        transaction.setOrderId("0460000003");
        transaction.setCurrency(new Currency("RMB3"));
        transaction.setMoney(999L);
        transactionList.add(transaction);


        /** 版本1 **/
        for (Transaction transaction_temp : transactionList) {
            if(transaction_temp.getMoney() > 1000){
                Currency currency=transaction_temp.getCurrency();
                List<Transaction> transactionsForCurrency=transactionsByCurrencies.get(currency);
                if(transactionsForCurrency==null){
                    transactionsForCurrency=new ArrayList<Transaction>();
                    transactionsByCurrencies.put(currency,transactionsForCurrency);
                }
                transactionsForCurrency.add(transaction_temp);
            }
        }

        System.out.println(transactionsByCurrencies);
        /** 版本2 **/
        Map<Currency, Transaction> transactionsByCurrencies2 =transactionList.stream().filter((Transaction t) -> t.getMoney() > 1000).collect(Collectors.toMap(Transaction::getCurrency, Function.identity()));
        System.out.println(transactionsByCurrencies2);
    }
}
