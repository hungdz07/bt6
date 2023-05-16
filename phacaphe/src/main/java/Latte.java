public class Latte implements CaPhe{
    @Override
    public void taoCaPhe() {
        System.out.println("đang pha Latte");
    }

    @Override
    public String loaiCaPhe() {
        return "Latte";
    }

    @Override
    public String nuoc() {
        return "30 ml";
    }

    @Override
    public String apSuat() {
        return "9 bar";
    }

    @Override
    public String sua() {
        return "20 ml";
    }
}
