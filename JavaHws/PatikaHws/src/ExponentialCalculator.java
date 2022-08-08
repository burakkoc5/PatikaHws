import java.util.Scanner;

public class ExponentialCalculator {
    public static void main(String[] args) {
        int n,k;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alinacak sayi :");
        n = scanner.nextInt();

        System.out.println("Üs olacak sayi : ");
        k = scanner.nextInt();

        int total = 1;

        for (int i = 1; i <= k ; i++) {
            total*=n;
        }

        System.out.println("Cevap : " + total);
        scanner.close();
    }
}
