public class MoneyBack implements Card{
    @Override
    public String GetCardType() {
        return "MoneyBack";
    }

    @Override
    public int GetCreditLimit() {
        return 100;
    }

    @Override
    public int GetAnnualCharge() {
        return 10;
    }
}
