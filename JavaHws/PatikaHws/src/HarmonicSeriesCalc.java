import java.util.Scanner;

public class HarmonicSeriesCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N sayisini giriniz : ");

        int n = scanner.nextInt();

        double result = 0.0;

        for (double i = 1; i <= n; i++) {
            result += (double)(1/i);
            //System.out.println(result);
        }

        System.out.println(result);
        scanner.close();
    }
}
