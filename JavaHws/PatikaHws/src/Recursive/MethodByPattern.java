package Recursive;

import java.util.Scanner;

public class MethodByPattern {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        n=input.nextInt();
        patternMaker(n);
        input.close();

    }


    public static void patternMaker(int a){
        if (a > 0) {
            System.out.print(a+" ");
            patternMaker(a-5);
        }
        System.out.print(a+" ");

    }

    
}
