package bt1;

public class Main {
    public static void main(String[] args) {
    HinhHoc hinhHoc;
    hinhHoc = new HinhChuNhat(4, 3);
        System.out.println("chu vi: "+ hinhHoc.tinhChuVi());
        System.out.println("dientich: "+ hinhHoc.tinhDienTich());
    Drawable drawable = new Drawable();
    drawable.draw(hinhHoc);
    }
}
