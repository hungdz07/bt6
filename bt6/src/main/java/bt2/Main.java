package bt2;

public class Main {
    public static void main(String[] args) {
        GeometricObject[] hinh = new GeometricObject[2];
        hinh[0] = new Circle(10);

        hinh[1] = new Rectangle(4, 6);

        System.out.println(hinh[0].getArea());
        System.out.println(hinh[0].getPerimeter());
        System.out.println(hinh[0].toString());

        System.out.println(hinh[1].getArea());
        System.out.println(hinh[1].getPerimeter());
        System.out.println(hinh[1].toString());
    }
}
