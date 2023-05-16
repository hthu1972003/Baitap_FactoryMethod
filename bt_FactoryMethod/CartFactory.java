package opp.bt_day6.bt_FactoryMethod;

public class CartFactory {
    private CartFactory(){}
    public static CreditCard getCreditCard(String creditcard){
        switch (creditcard){
            case "MoneyBack":
                return new  MoneyBack();
            case "Platinum":
                return new Platinum();
            case "Titanium":
                return new Titanium();
            default:
                return null;
        }
    }
}
