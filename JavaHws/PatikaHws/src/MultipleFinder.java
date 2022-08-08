import java.util.Scanner;

public class MultipleFinder {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Sinir sayisi giriniz : ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0 || i % 5 ==0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    
    }   
}
