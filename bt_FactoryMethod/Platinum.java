package opp.bt_day6.bt_FactoryMethod;

public class Platinum implements CreditCard {

    @Override
    public String GetCardType() {
        return "Platinum";
    }

    @Override
    public int GetCreditLimit() {
        return 2;
    }

    @Override
    public int GetAnnualCharge() {
        return 10000;
    }
}
