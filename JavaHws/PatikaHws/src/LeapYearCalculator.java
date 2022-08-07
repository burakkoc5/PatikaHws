import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Yil giriniz: ");
        year = scanner.nextInt();

        if (year%4==0) {
            if (year%100==0) {
                if(year%400==0){
                    System.out.println(year + " artik bir yildir.");
                }
                else{
                    System.out.println(year + " artik bir yil degildir !");
                }
            } else {
                System.out.println(year + " artik bir yildir.");
            }
        }else{
            System.out.println(year + " artik bir yil degildir !");
        }

        scanner.close();
    }
}
