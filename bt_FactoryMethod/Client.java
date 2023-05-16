package opp.bt_day6.bt_FactoryMethod;

public class Client {
    public static void main(String[] args){
        CreditCard creditCard = CartFactory.getCreditCard("Titanium");
        if (creditCard != null){
            System.out.println(creditCard.GetCardType());
            System.out.println(creditCard.GetCreditLimit());
            System.out.println( creditCard.GetAnnualCharge());

        }
    }
}
