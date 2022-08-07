import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        
        double boy,kilo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextDouble();

        System.out.println("Vücut kitle indeksiniz : " + (kilo/(boy*boy)));
        scanner.close();

        
    }
}
