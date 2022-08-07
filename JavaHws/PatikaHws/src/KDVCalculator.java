import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18,kdvTutar,kdvliTutar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ücret tutarini giriniz");
        tutar = scanner.nextInt();
        if (tutar>1000) {
            kdvOran = 0.08;
        }
        kdvTutar = tutar*kdvOran;
        kdvliTutar = tutar+kdvTutar;

        System.out.println("KDV'siz tutar :"+ tutar);
        System.out.println("KDV orani :"+ kdvOran);
        System.out.println("KDV tutari :"+ kdvTutar);
        System.out.println("KDV'li tutari. :"+ kdvliTutar);
        scanner.close();
    }
}
