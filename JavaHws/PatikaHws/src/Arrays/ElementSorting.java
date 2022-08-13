package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ElementSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");

        int length = scanner.nextInt();
        int[] numbers= new int[length];

        for (int i = 0; i < length; i++) {
            System.out.println((i+1) + ". elemanı : ");
            int n = scanner.nextInt();
            numbers[i] = n;
        }
    
        Arrays.sort(numbers);

        System.out.print("Sıralama : ");
        for (int i : numbers) {
            System.out.print(i + " ");
        }        
        scanner.close();
    
    }   
    
}
