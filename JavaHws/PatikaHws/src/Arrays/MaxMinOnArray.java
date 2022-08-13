package Arrays;

import java.util.Scanner;

public class MaxMinOnArray {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int n = scanner.nextInt();
      
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        System.out.println("Girilen sayi : " + n);

        for (int i : list) {
            if (i < min && i>n) {
                min = i;
            }
            if (i > max && i<n) {
                max = i;
            }
        }

        
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + max);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + min);

        scanner.close();

    }
    
}
