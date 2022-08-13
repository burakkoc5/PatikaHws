package Recursive;
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.println("Tabandaki sayiyi giriniz: ");
        y = input.nextInt();
        System.out.println("Usteki sayiyi giriniz: ");
        x = input.nextInt();

        System.out.println("Sonuc : " + takePower(x,y));

        input.close();
    }


   
    public static int takePower(int x, int y){
        if (x == 0){
            return 1;
        }

        return y*takePower(x-1,y);
    
    }
}