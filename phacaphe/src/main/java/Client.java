import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        for (int i = 1; i != 0;){
            System.out.println("--- MÁY PHA CÀ PHÊ ---");
            System.out.println("1. Espresso");
            System.out.println("2. Đen đá");
            System.out.println("3. Nâu đá");
            System.out.println("4. Latte");
            System.out.println("5. Bạc xỉu");
            System.out.println("0. Thoát");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Chon loai: ");
             i = scanner.nextInt();
            CaPhe caPhe = CaPheFactory.Factory(i);
            System.out.println(caPhe.loaiCaPhe());
            caPhe.taoCaPhe();
        }

    }
}
