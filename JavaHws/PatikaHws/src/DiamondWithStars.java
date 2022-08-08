import java.util.Scanner;

public class DiamondWithStars {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        
        for(int i = 0 ; i < sayi ; i++){
            for(int j = 0 ; j < (sayi-i) ; j++){
                System.out.print(" ");
            }
            for(int k = 1 ; k<= ((i * 2) - 1) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = 1; a < sayi; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= ( 2 * sayi - (2 * a + 1) ); c++) {
                System.out.print("*");
            }
            System.out.println();
        }   
        scanner.close();


    }
}
