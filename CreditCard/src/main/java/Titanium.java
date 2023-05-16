public class Titanium implements Card{
    @Override
    public String GetCardType() {
        return "Titanium";
    }

    @Override
    public int GetCreditLimit() {
        return 1000;
    }

    @Override
    public int GetAnnualCharge() {
        return 30;
    }
}
