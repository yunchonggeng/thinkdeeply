package lambdatest;

import java.util.StringJoiner;

/**
 * @author william
 */
public class Currency {
    private String currency;

    Currency(String currency){
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Currency.class.getSimpleName() + "[", "]")
                .add("currency_money='" + currency + "'")
                .toString();
    }
}
