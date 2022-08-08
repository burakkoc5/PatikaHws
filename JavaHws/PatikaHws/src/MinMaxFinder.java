import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numberOfInput;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int input = 0;
        System.out.println("Kaç tane sayi gireceksiniz : ");
        numberOfInput = scanner.nextInt();


        for (int i = 0; i < numberOfInput; i++) {
            System.out.println((i+1) + ". sayiyi giriniz :");
            input = scanner.nextInt();

            if (input>max) {
                max = input;
            }
            if (input<min) {
                min = input;
            }

        }

        System.out.println("En büyük sayi : " + max +"\nEn kücük sayi : " + min);
        
        
        
        scanner.close();
    }
}
