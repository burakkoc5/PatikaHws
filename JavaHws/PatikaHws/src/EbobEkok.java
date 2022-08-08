import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n1 sayisini giriniz : ");
        int n1 = scanner.nextInt();


        System.out.println("n2 sayisini giriniz : ");
        int n2 = scanner.nextInt();

        int ebob = 1;
        int k = 1;
        while (k<=n1) {
            if (n1% k == 0 && n2 % k == 0) {
                ebob= k;
            }
            k++;
        }

        System.out.println("Ebob : " + ebob);

        k = 1;
        while (k<=(n1*n2)) {
            if (k % n1 == 0 && k % n2 == 0) {
                System.out.println("Ekok : "+ k);
                break;
            }

            k++;
        }

        scanner.close();
    }
}
