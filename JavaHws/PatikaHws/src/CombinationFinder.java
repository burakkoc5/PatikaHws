import java.util.Scanner;

public class CombinationFinder {
    public static void main(String[] args) {
        int n,r, combination;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi sayinin kombinasyonunu almak istiyorsunuz?");
        n = scanner.nextInt();
        System.out.println("Sayinin kacli kombinasyonunu almak istiyorsunuz?");
        r = scanner.nextInt();

        combination = factoriel(n)/(factoriel(r)*factoriel(n-r));

        System.out.println(combination);
        scanner.close();

    
    }

    public static int factoriel(int n){
        if(n<=1){
            return 1;
        }
        return n*factoriel(n-1);
    }
}
