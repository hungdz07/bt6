package bt1;

public class HinhVuong implements HinhHoc{

    public double r = 0;

    public HinhVuong(double r){
        this.r = r;
    }

    @Override
    public double tinhChuVi() {
        return 4 * r;
    }

    @Override
    public double tinhDienTich() {
        return r * r;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "r=" + r +
                '}';
    }
}
