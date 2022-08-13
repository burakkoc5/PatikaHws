package Recursive;

import java.util.Scanner;

public class PrimeNumberRecurs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi giriniz:  ");
        int sayi=input.nextInt();
        if(primeRecurs(sayi,2) == 0){
            System.out.println("Sayi asaldir");
        }else{
            System.out.println("Sayi asal degil");
        }
        input.close();
        
    }

    public static int primeRecurs(int number, int start){

        if(start == number){
            return 0;
        }

        if (number%start == 0) {
            return 1;
        }
        
        return primeRecurs(number,start+1);
    }
}
