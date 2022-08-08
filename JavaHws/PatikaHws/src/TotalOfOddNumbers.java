import java.util.Scanner;

public class TotalOfOddNumbers {
    public static void main(String[] args) {
        int number,total = 0;
        Scanner scanner = new Scanner(System.in);

        
        
        do{
            System.out.println("Lütfen bir sayi giriniz : ");
            number = scanner.nextInt();
            if (number%2==0 && number %4 ==0) {
                total+=number;
            }
        }
        while (number%2==0);
        System.out.println("2 ve 4 e bolunenlerin toplami : " + total);
        scanner.close();
    }
}
