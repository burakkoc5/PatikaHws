import java.util.Scanner;

public class AscDscSorting {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scanner = new Scanner(System.in);

        System.out.print("a sayisini giriniz :");
        a = scanner.nextInt();
        System.out.print("b sayisini giriniz :");
        b = scanner.nextInt();
        System.out.print("c sayisini giriniz :");
        c = scanner.nextInt();


        if (a == b ) { 
            if (a == c) {
                System.out.println(a + " = " + b + " = " + c); /// 1 = 2 = 3
            } else if (a > c) {
                System.out.println(c + " < " + a + " = " + b); /// 3 < 1 = 2
            } else {
                System.out.println(a + " = " + b + " < " + c); /// 1 = 2 < 3
            }

        } else if (b == c ) { 
            if (a > b) {
                System.out.println(b + " = " + c + " < " + a); /// 2 = 3 < 1
            } else  {
                System.out.println(a + " < " + b + " = " + c); /// 1 < 2 = 3
            }

        } else if (a == c ) {
            if (a > b) {
                System.out.println(b + " < " + a + " = " + c); /// 2 < 1 = 3
            } else  {
                System.out.println(a + " = " + c + " < " + b); /// 1 = 3 < 2
            }

            

        } else if (a > b) {  
            if (b > c) {
                System.out.println(c + " < " + b + " < " + a); /// 3 < 2 < 1
            } else if (a < c){
                System.out.println(b + " < " + a + " < " + c); /// 2 < 1 < 3
            } else {
                System.out.println(b + " < " + c + " < " + a); /// 2 < 3 < 1
            }


        } else { 
            if (a > c) {
                System.out.println(c + " < " + a + " < " + b); /// 3 < 1 < 2
            } else if (b < c){
                System.out.println(a + " < " + b + " < " + c); /// 1 < 2 < 3
            } else {
                System.out.println(a + " < " + c + " < " + b); /// 1 < 3 < 2
            }
        }

        
        scanner.close();
    }
}
