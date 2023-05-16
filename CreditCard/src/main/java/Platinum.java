public class Platinum implements Card{
    @Override
    public String GetCardType() {
        return "Platinum";
    }

    @Override
    public int GetCreditLimit() {
        return 500;
    }

    @Override
    public int GetAnnualCharge() {
        return 20;
    }
}
