import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) throws Exception {
        double kenar1, kenar2,kenar3,alan,u;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci kenari giriniz");
        kenar1 = scanner.nextInt();
        System.out.println("İkinci kenari giriniz");
        kenar2 = scanner.nextInt();
        System.out.println("Ucuncu kenari giriniz");
        kenar3 = scanner.nextInt();

        u = (kenar1+kenar2+kenar3)/2;

        alan = u * (u-kenar1)*(u-kenar2)*(u-kenar3);

        System.out.println("Ucgenin alani : " + Math.sqrt(alan));
        scanner.close();

    }
}
