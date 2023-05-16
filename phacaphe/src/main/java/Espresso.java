public class Espresso implements CaPhe{
    @Override
    public void taoCaPhe() {
        System.out.println("Đang pha Espresso");
    }

    @Override
    public String loaiCaPhe() {
        return "Espresso";
    }

    @Override
    public String nuoc() {
        return "30ml";
    }

    @Override
    public String apSuat() {
        return "9 bar";
    }

    @Override
    public String sua() {
        return "";
    }
}
