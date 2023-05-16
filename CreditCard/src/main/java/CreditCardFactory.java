public class CreditCardFactory {

    public static Card CardFactory(int card){
        switch (card){
            case 1:
                return new MoneyBack();
            case 2:
                return new Platinum();
            case 3:
                return new Titanium();
            default:
                throw new NumberFormatException("Invalid card type" + card);
        }
    }
}
