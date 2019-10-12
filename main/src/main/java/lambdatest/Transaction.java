package lambdatest;

import java.util.StringJoiner;

/**
 * @author william
 */
public class Transaction {
    private String orderId;
    private Long money;
    private Currency currency;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Transaction.class.getSimpleName() + "[", "]")
                .add("orderId='" + orderId + "'")
                .add("money=" + money)
                .add("currency='" + currency + "'")
                .toString();
    }
}
