package opp.bt_day6.bt_FactoryMethod;

public class MoneyBack implements CreditCard {

    @Override
    public String GetCardType() {
        return "MoneyBack";
    }

    @Override
    public int GetCreditLimit() {
        return 5;
    }

    @Override
    public int GetAnnualCharge() {
        return 2000;
    }
}
