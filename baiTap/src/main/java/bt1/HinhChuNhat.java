package bt1;

public class HinhChuNhat implements HinhHoc{

    public double cd = 1, cr = 1;

    public HinhChuNhat(double cd, double cr){
        this.cd = cd;
        this.cr = cr;
    }

    @Override
    public double tinhChuVi() {
        return (cd+cr)*2;
    }

    @Override
    public double tinhDienTich() {
        return cd * cr;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "cd=" + cd +
                ", cr=" + cr +
                '}';
    }
}
