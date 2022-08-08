import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int numberOfNumbers;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Fibonacci Serisi'nin ilk kaç elemanini istersiniz : ");
        numberOfNumbers = scanner.nextInt();

        int k = 1;
        int firstElement = 0;
        int activeElement= 1;
        int total = 0;
        System.out.print("0 ");
        while (k<numberOfNumbers-1) {
            total = firstElement+activeElement;
            //System.out.println(firstElement + " + " + activeElement + " = " + total);
            System.out.print(total + " ");
            firstElement = activeElement;
            activeElement = total;
            //System.out.println();
            k++;
        }

        scanner.close();
    
    }
}
