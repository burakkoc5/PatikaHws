import java.util.Scanner;

public class TotalOfDigits {
    public static void main(String[] args) {
        int total = 0,number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        number = scanner.nextInt();

        while(number>0){
            total += number%10;
            number = number/10;

        }

        System.out.println("Basamklar toplami : " + total);
        scanner.close();
    }
}
