package bt3;

public class Main {
    public static void main(String[] args) {
        Movable[] m = new Movable[2];
        for (Movable i: m) {
            i = new MovablePoint(1, 1, 1, 1);
            i.moveUp();
            i.moveLeft();
            System.out.println(i.toString());
        }
    }


}
