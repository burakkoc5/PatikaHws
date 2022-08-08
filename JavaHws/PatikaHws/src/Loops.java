import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int k,count=0,total=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz :");
        k = scanner.nextInt();


        for (int i = 1; i < k; i++) {

            if (i%3==0 && i % 4 ==0) {
                count++;
                total+=i;
                //System.out.println(i);
            }
            
        }

        System.out.println(total/count);
        scanner.close();
    }
}
