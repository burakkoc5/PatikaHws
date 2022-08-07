import java.util.Scanner;

public class CircleAreaPerimCalculator {

    public static void main(String[] args) {
        
        int r,alpha;
        final double pi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz : ");
        r = scanner.nextInt();

        System.out.println("Dairenin diliminin merkez açisinin ölcüsü giriniz : ");
        alpha = scanner.nextInt();

        double alan = pi * r * r;
        double dilimAlani = (alan*alpha)/360;

        System.out.println("Daire diliminin alani : " + dilimAlani);
        scanner.close();
    }
}