import java.util.Scanner;

public class PerfectNumberFinder {
    public static void main(String[] args) {
        int number;
        int multiplierTotal=0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bir sayi giriniz : ");
        number = scanner.nextInt();

        for (int i = 1; i < number; i++) {
            if (number%i==0) {
                multiplierTotal+=i;
            }
        }
        if (multiplierTotal==number) {
            System.out.println(number + " mükemmel bir sayidir.");
        } else {
            System.out.println(number + " mükemmel bir sayi degildir.");
        }

        scanner.close();
    
    }
}
