package opp.bt_day6.bt_FactoryMethod;

public class Titanium implements CreditCard{
    @Override
    public String GetCardType() {
        return "Titanium";
    }

    @Override
    public int GetCreditLimit() {
        return 1;
    }

    @Override
    public int GetAnnualCharge() {
        return 20000;
    }
}
