public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++){
            Card card1 = CreditCardFactory.CardFactory(i);
            System.out.println("CardType"+ i +": "+card1.GetCardType());
            System.out.println( "AnnualCharge"+ i +": "+ card1.GetAnnualCharge());
            System.out.println("CreditLimit"+ i +": "+card1.GetCreditLimit());

        }

    }
}
