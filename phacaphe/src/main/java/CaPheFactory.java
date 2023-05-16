public class CaPheFactory {
    public static CaPhe Factory(int i){
        switch (i){
            case 0:
                System.exit(0);
            case 1:
                return new Espresso();
            case 2:
                return new DenDa();
            case 3:
                return new NauDa();
            case 4:
                return new Latte();
            case 5:
                return new BacXiu();
            default:
                throw new IllegalArgumentException("Ca phe voi ma so la "+i+" khong ton tai");

        }
    }
}
